package allProgramString;

public class StringCharCounter2
{
public static void main(String[] args)
{
  String s = "vivek is an automation Engineer";
  
  int[] charCount = new int[256];
  //Assume ASCII character only
  
  for(int i=0; i<s.length(); i++)
  {
	  char c = s.charAt(i);
	  if(c != ' ') // this will not count space in String
	  {
	  charCount[c]++;
	  }
  }
  
  for(int i=0; i<256; i++)
  {
	  if(charCount[i]>0)
	  {
		  System.out.println("'"+(char)i+"': "+charCount[i]);
	  }
  }
}
}
