package stringPractice1;

public class EXtractNUmFromString 
{
public static void main(String[] args)
{
	String s = "I have 20 mangos";
	int num = 0;
	String []a = s.split(" ");
	
	for(String x: a)
	{
	if(x.matches("\\d+"))
	{
		num = Integer.parseInt(x);
	}
	}
	System.out.println(num);
}  
}
