package allProgramString;

public class StringCountTotalChar
{
public static void main(String[] args)
{
	String s = "vivek";
	int freq = 0;
	char[] a = s.toCharArray();
	for(int i=0; i<a.length; i++)
	{
      freq++;
	}
	System.out.println(freq);
	System.out.println(s.length());// this is simple without logic directly using method of String
}
}
