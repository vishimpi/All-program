
package stringPractice1;

public class CharOccurance
{
  public static void main(String[] args)
  {
	String s = "vivek shimpi";
	
	int []charcount = new int[256];
	
	for(int i=0; i<s.length(); i++)
	{
		char c = s.charAt(i);
		if(c != ' ')
		{
			charcount[c]++;
		}
	}
	
	for(int i=0; i<256; i++)
	{
		if(charcount[i]>0)
		{
			System.out.println("'"+ (char)i+"':"+charcount[i]);
		}
	}

	
	
	
		
}
}
