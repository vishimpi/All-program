 package allProgramString;

import java.util.HashMap;

public class StringCharCounter 
{
public static void main(String[] args) 
{
	String str = "vivek";
	
	HashMap<Character, Integer> charCountMap = new HashMap<>();
	
	//Convert String to Char Array
	
	char [] charArray = str.toCharArray();
	
	//Iterate through each character in the array
	
	for(char c : charArray)
	{
		// If the character is not a space
		if(c != ' ')
		{
		//if the character already present in the map, increment its count
			
		  if(charCountMap.containsKey(c))
		  {
			  charCountMap.put(c, charCountMap.get(c)+1);
		  }
		  else
		  {
			  //Otherwise add it to the map with count 1
			  charCountMap.put(c, 1);
		  }
		}
	}
	
	//Print the character counts
	System.out.println("Character Count: ");
	
	for(char c: charCountMap.keySet())
	{
		System.out.println("'" + c + "': " + charCountMap.get(c));
	}
	
	
	
	
	
	
	
	
	
	
	
}
}
