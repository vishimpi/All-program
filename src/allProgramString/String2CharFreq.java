package allProgramString;

public class String2CharFreq 
{
  public static void main (String [] args)
  {
	  String s = "viveek";
	  char cv = 'v';
	  char ce = 'e';
	  int freqofv = 0;
	  int freqofe = 0;

	  for(int i=0; i<s.length(); i++) 
	  {
		 char ch = s.charAt(i);
		 
		 if(ch==cv)
		 {
			 freqofv++;
		 }
		 else if (ch==ce)
		 {
			 freqofe++;
		 }
	  }  
	  System.out.println(freqofv);
	  System.out.println(freqofe);
	  
  }
}
