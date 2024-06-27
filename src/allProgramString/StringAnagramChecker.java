package allProgramString;

import java.util.Arrays;

public class StringAnagramChecker
{
 public static void main(String[] args) 
 {
	String s1 = "care";
	String s2 = "race";
	
	if(s1.length() != s2.length())
	{
		System.out.println("its not an anagram");
	}
	else
	{
	char[] c1 = s1.toCharArray();
	char[] c2 = s2.toCharArray();
	
	Arrays.sort(c1);
	Arrays.sort(c2);
	
	if(Arrays.equals(c1, c2))
	{
		System.out.println("Its an anagram");
		
	}
	else
	{
		System.out.println("Its not an anagram");
	}
	
	
	}
}	

}
