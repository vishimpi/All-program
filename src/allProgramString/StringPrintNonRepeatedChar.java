package allProgramString;

public class StringPrintNonRepeatedChar 
{
	public static void main(String[] args)
	{
		String s = "abacabadd";
       for(int i=0; i<s.length(); i++)
       {
    	   char ch = s.charAt(i);
    	   boolean repeated = false;
    	   
           for(int j=0; j<s.length(); j++)
           {
        	   char c = s.charAt(j);
        	   
        	   if(i != j && ch == c)  
        	   {   
        	   repeated = true;
        	   }
        	}
           
           if(repeated)
           {
        	   System.out.println(ch);
           }

       }
	}
}
