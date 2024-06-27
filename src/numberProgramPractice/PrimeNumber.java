package numberProgramPractice;

public class PrimeNumber
{

	public static void main(String[] args)
	{
         int x = 5;
         int temp = 0;
         
         for (int i=2; i<x; i++)
         {
        	 if(x%i==0)
        	 {
        		 temp++;
        	 }
         }
         if(temp == 0)
         {
        	 System.out.println("Prime");
         }
         else
         {
        	 System.out.println("Not Prime");
         }
	}

}
