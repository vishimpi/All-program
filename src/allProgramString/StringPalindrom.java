package allProgramString;

public class StringPalindrom
{
public static void main(String[] args)
{
	String s = "viv";
	String str = s.toLowerCase();
	String rev = "";
	for(int i=0; i<str.length(); i++)
	{
		char c = str.charAt(i);
		
		rev = c+rev;	
	}
	System.out.println(rev);
	if(rev.equals(str))
	{
		System.out.println("its palindrom");
	}
	else
	{
		System.out.println("Its not palindrom");
	}
}
}
