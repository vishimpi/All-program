package allProgramString;

public class ReverseStringWordBYWord
{
public static void main(String[] args)
{
	String s = "My name is Vivek";
//	expecting = Vivek is name my
	
	String output = "";
	
	String [] a = s.split(" ");
	
	for(int i=0; i<a.length; i++)
	{
		output = a[i]+ " " + output;
	}
	System.out.println(output);
}
}
