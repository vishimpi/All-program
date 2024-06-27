package numberProgramPractice;

public class NumberPalindrom 
{

	public static void main(String[] args) 
	{
      int x = 121;
      int num = x;
      int rem;
      int rev=0;
      
      while (num != 0)
      {
    	  rem = num%10;
    	  rev = rev*10+rem;
    	  num = num/10;
      }
      
      if(x==rev)
      {
    	  System.out.println("palindrome");
      }
      else
      {
    	  System.out.println("not palindrome");
      }
	}

}
