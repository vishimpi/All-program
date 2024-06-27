package allProgramString;

import java.util.Arrays;

public class StringRemoveDuplicateChar 
{
 public static void main(String[] args) 
 {
	String s = "dell";
	char[]a = s.toCharArray();
	int index = 0 ;
	String result = "";
	for(int i=0; i<a.length; i++)
	{
		int j;
		for(j=0; j<a.length; j++)
		{
			if(a[i]==a[j])
			{
				break;
			}
		}
		  if(j==i)
		  {
			  a[index++]=a[i];
		  }
		
		 result = String.valueOf(Arrays.copyOf(a, index));
		
	 }
	System.out.println(result);

}
}
