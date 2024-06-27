package stringPractice1;

public class SumofStringNO
{
  public static void main(String[] args)
  {
	String s = "this 20 is 10 our 34 mock 3";
	int sum =0;
	String [] a = s.split(" ");
	
	for(String x : a)
	{
		try
		{
			int num = Integer.parseInt(x);
			sum = sum + num;
		}
		catch(Exception e)
		{
		}
	}
	System.out.println(sum);
   }
}
