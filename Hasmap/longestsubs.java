import java.util.*;
public class longestsubs
{
    public static int lengthOfLongestSubstring(String s)
    {
        int maxlen=0;
        for(int i=0;i<s.length();i++)
        {
            StringBuilder sb=new StringBuilder();
            for(int j=i;j<s.length();j++)
            {
                if(sb.indexOf(String.valueOf(s.charAt(j)))!=-1)
                {
                    break;
                }
                sb.append(s.charAt(j));
                maxlen=Math.max(maxlen,sb.length());
            }
        }
        return maxlen;

    }
    public static void main(String[] args)
    {
        String s="abcabcabcd";
        System.out.println(lengthOfLongestSubstring(s));
    }
}
