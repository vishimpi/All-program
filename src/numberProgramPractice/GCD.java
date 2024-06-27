package numberProgramPractice;

public class GCD
{
public static void main(String[] args) 
{
	int x = 15;
	int y = 30;
	int gcd = 1;
	
	for(int i=1; i<=x && i<=y; i++)
	{
		if(x%i==0 && y%i==0)
		{
			gcd=i;
		}
	}
	System.out.println(gcd);
}
}
