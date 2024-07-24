import java.util.HashMap;
import java.util.Map;
public class longestsubs2 
{
    public static int longestsubs2(String s)
    {
        int maxlen=0;
        Map<Character,Integer> record=new HashMap<>();
        for(int r=0,l=0;r<s.length();r++)
        {
            if(record.containsKey(s.charAt(r))&&record.get(s.charAt(r))>=l)
        
            {
                l=record.get(s.charAt(r))+1;
            }
            record.put(s.charAt(r),r);
            maxlen=Math.max(maxlen,r-l+1);
        }
        return maxlen;
    }
    public static void main(String[] args)
    {
        String s="abcabcabcdabcde";
        System.out.println(longestsubs2(s));
    }
}
