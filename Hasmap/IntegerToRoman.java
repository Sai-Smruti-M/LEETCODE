public class IntegerToRoman 
{
    public static String convert(int num)
    {
        int [] value={1,4,5,9,10,40,50,90,100,400,500,900,1000};
        String [] roman={"I","IV","V","IX","X","XL","XC","C","CD","D","CM","M"};
        StringBuilder sb=new StringBuilder();
        for(int i=value.length-1;i>=0 && num>0;i--)
        {
            while(num>=value[i])
            {
                num-=value[i];
                sb.append(roman[i]);

            }
        }
        return sb.toString();

    }
    public static void main(String []args)
    {
        int num=789;
        System.out.println(convert(num));
        
    }
}
