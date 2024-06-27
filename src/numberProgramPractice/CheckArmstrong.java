package numberProgramPractice;

public class CheckArmstrong 
{
 public static void main(String[] args)
{
	int x = 153;
	int num = x;
	int sum = 0;
	int rem = 0;
	while(num != 0)
	{
		rem = num%10;
		num = num/10;
		sum = sum+rem*rem*rem;
	}
	
	if(x==sum)
	{
		System.out.println("its armstrong");
	}
	else
	{
		System.out.println("its not an armstrong");
	}
}
}
