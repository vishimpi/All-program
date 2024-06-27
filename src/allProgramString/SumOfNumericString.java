package allProgramString;

public class SumOfNumericString 
{
public static void main(String[] args) 
{
	String s = "i am 23 love 20 program 3";
	int sum = 0;
    int num = 0;
	String [] a = s.split(" ");
	for(String x:a)
	{
		if(x.matches("\\d+"))
		{
			num = Integer.parseInt(x);
			sum = sum + num;
		}
     }
	System.out.println(sum);

}
}