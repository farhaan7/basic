package practiseQuestions;

public class MaxNumber {

	public static void main(String[] args)
	{

 int arr[] = {10, 192, 87, 107, 542};
 int max = arr[0];
 for(int i =1;i<arr.length;i++)
 {
	 if(arr[i]>max)
	 {
		 max = arr[i];
	 }
 }
 System.out.println("max number is"+max);
	}

}
