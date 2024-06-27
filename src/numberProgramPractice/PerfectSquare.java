package numberProgramPractice;

public class PerfectSquare
{
   public static void main(String[] args)
   {
	   int x = 16;
	   int temp = 0;
	   
	   for(int i=1; i<=x; i++)
	   {
		   if(x==i*i)
		   {
			   temp=1;
		   }
	   }
	   if(temp==1)
	   {
		   System.out.println("perfect");
	   }
	   else
	   {
		   System.out.println("not perfect");
	   }
	   
    }
}
