package stringPractice1;

public class SumofString2 
{
  public static void main(String[] args)
  {
		String s = "this is 20  our 40 mock";
		String temp = "0";
		int sum = 0;
		
		for(int i=0; i<s.length(); i++)
		{
			char ch = s.charAt(i);
			
			if(Character.isDigit(ch))
			{
			temp = temp + ch;
			}
			else
			{
				sum = sum + Integer.parseInt(temp);
				temp = "0";
			}
			
		}
		System.out.println(sum);
		
	
}
}
