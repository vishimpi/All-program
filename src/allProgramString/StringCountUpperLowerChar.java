package allProgramString;

public class StringCountUpperLowerChar
{
 public static void main(String[] args) 
 {
	String s = "VivekSHimpi";
    int upper = 0;
    int lower = 0;
    
    for(int i=0; i<s.length(); i++)
    {
    	char c = s.charAt(i);
    	if(c>='A' && c<='Z')
    	{
    		upper++;
    	}
    	else if(c>='a' && c<='z')
    	{
    		lower++;
    	}
    	
    }
    System.out.println(upper);
    System.out.println(lower);
} 
}
