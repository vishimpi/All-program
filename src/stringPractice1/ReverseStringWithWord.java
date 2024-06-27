package stringPractice1;

public class ReverseStringWithWord
{
public static void main(String[] args)
{
	String s = "My name is Aman";
	//output = Aman is name My
	
	String output = "";
	String [] a = s.split(" ");

	for(int i=0; i<a.length; i++)
	{
		output = a[i]+" "+output;
	}
	System.out.println(output);
	
	
	//output= yM eman si namA 
//	String output = "";
//	   String a [] = s.split(" ");
//	   
//	   for(String x: a)
//	   {
//	   for(int i=x.length()-1; i>=0;  i--)
//	   {
//		   char c = x.charAt(i);
//		   output = output+c;
//	   }
//	       output = output+ " ";
//	   }
//	   System.out.println(output);
}
}
