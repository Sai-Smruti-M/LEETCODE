import java.util.*;
public class two_sum
{
    public static void main(String args[])
    {
        int[] nums = {5,2,1,4};
        int target = 6;
        int[] result = sum(nums, target);
        System.out.println(Arrays.toString(result));
        

        




    }
    public static int[] sum(int ar[],int goal)
    {
        Map<Integer,Integer> comp=new HashMap<>();
        for(int i=0;i<ar.length;i++)
        {
            Integer check=comp.get(ar[i]);
            if(check!=null)
            {
                return new int[]{check,i};
            }

            comp.put(goal-ar[i],i);
            
            


        }
        return ar;
    }
}