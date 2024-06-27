package allProgramString;

public class StringPrintInitials 
{
 public static void main(String[] args) 
 {
	String s = "Boy Is Good";
	
	String desire = "";
	String [] a = s.split(" ");
	
	for(int i=0; i<a.length; i++)
	{
		desire = desire + a[i].charAt(0);
		
	}
	System.out.println(desire);
}
}
