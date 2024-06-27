package allProgramString;

import java.util.HashMap;

public class StringCountDuplicateChar
{
 public static void main(String[] args) 
 {
	String s = "vivek Shimpi";
	
	HashMap <Character, Integer> charCountMap = new HashMap<>();
	char [] charArray = s.toCharArray();
	
	for (char c: charArray)
	{
		if(c != ' ')// this will ignore space in String if there is any.
		{
		//if the character is already present in map, increment its count.
		if(charCountMap.containsKey(c))
		{
			charCountMap.put(c, charCountMap.get(c)+1);
		}
		else
		{
			//otherwise add it to the map with count 1
			charCountMap.put(c, 1);
		}
		}
	}
	
	//Print the duplicate char count
	System.out.println("Duplicate char count: ");
	for(char c: charCountMap.keySet())
	{
		int count = charCountMap.get(c);
		if(count > 1)
		{
			System.out.println("'" + c +"'");
		}
	}
}
}
