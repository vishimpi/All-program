package allProgramString;

public class ReverseStringWordBYWord
{
public static void main(String[] args)
{
	String s = "My name is Vivek";
//	expecting = Vivek is name my
	
	String output = "";
	
	String [] a = s.split(" ");
	
	//way2
//	for(int i=0; i<a.length; i++)
//	{
//		output = a[i]+ " " + output;
//	}
//	System.out.println(output);
	
	//way2
	for(String x:a)
	{
		output = x + " " + output;
	}
	System.out.println(output);

}
}
