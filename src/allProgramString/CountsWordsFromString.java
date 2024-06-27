package allProgramString;

public class CountsWordsFromString 
{
 public static void main(String[] args)
 {
	 String s = "this is my book";
	 int count = 0;
	 String [] a = s.split(" ");
	 
	 for(String x:a)
	 {
		 if(x.matches("\\w+"))
		 {
			 count++;
		 }
	 }
	 System.out.println(count);
	 
	 
	 //way 2
	 String s2 = "this i is my book";

	 String [] words = s2.split(" ");
	 
	 int count1 = words.length;
	 System.out.println(count1);
	 
}
}
