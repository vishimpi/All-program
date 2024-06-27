package arrayProgramPractice;

public class LargestEleInArray
{
public static void main(String[] args)
{
	int[]a= {10,60,3,40,50};
	int max=2;
	for(int i=0; i<a.length; i++)
	{
		if(a[i]>max)
		{
			max = a[i];
		}
	}
	System.out.println(max);
}
}
