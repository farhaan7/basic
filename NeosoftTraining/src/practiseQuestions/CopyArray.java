package practiseQuestions;

public class CopyArray {

	public static void main(String[] args)
	{
		int[] source = {1,2,3,4,5,6};
		int[] destination = new int[6];
		
		for(int i=0;i<source.length;i++)
		
		 destination[i] = source[i];
		System.out.println("elements of destination array = ");
		
		for(int i= 0;i<destination.length;i++)
			System.out.println(destination[i]);
		
			
		
	}

}
