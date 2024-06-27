package arrayProgramPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class SkipArrayElement
{
  public static void main(String[] args)
  {
	  int [] a = {3,2,3,5};
	  int valueToSkip = 3;
	  
	  ArrayList<Integer> list = new ArrayList<>();
	  
	  boolean similar = false;
	  
	  for(int num : a)
	  {
		  if(num != valueToSkip)
		  {
			  list.add(num);
		  }
		  else if(!similar)
		  {
			  list.add(num);
			  similar =true;
		  }
	  }
	  //convert ArrayList into Array
	  int [] output = new int [list.size()];
	  for(int i=0; i<list.size(); i++)
	  {
		  output[i] = list.get(i);  
	  }
	  System.out.println(Arrays.toString(output));
  }
}
