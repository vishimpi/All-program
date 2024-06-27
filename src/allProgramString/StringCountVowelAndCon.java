package allProgramString;

public class StringCountVowelAndCon
{
	public static void main(String[] args)
	{
		
 String s = "VivekShimpi";
 String str = s.toLowerCase();
 int vowel = 0;
 int cont = 0;
 
 
 for(int i=0; i<str.length(); i++)
 {
	 char ch = str.charAt(i);
	 
	 if(ch=='a'||ch=='i'||ch=='e'||ch=='o'||ch=='u')
	 {
		 vowel++;
	 }
	 else if (ch>='a' && ch<='z')
	 {
		 cont++;
	 }
	 }
 System.out.println(vowel);
 System.out.println(cont);

	}
}
