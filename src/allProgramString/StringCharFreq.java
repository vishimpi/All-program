package allProgramString;

public class StringCharFreq 
{
  public static void main(String[] args)
  {
	 String s = "Viveeek";
     char c = 'e';
     int freq = 0;
     
     for(int i=0; i<s.length(); i++)
     {
    	 char ch = s.charAt(i);
    	 if(ch==c)
    	 {
    		 freq++;
    	 }
     }
     System.out.println("frequency of char e : "+ freq);
  }
}
