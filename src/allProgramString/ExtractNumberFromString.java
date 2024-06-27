package allProgramString;

public class ExtractNumberFromString 
{
public static void main(String[] args)
{
	String s = "i have 40 mangos";
	
	String numonly = s.replaceAll("[^0-9]", "");
	
	
	int num = Integer.parseInt(numonly);
	
	System.out.println(num);
}
}
