package practiseQuestions;

public class ReverseString {

	public static void main(String[] args)
	{
	//	String s="I am learning java programming";
		//int len = s.length();
		//String rev = "";
		//for(int i=len-1;i>=0;i--)  //using for loop
		//{
		//	rev = rev + s.charAt(i);
		//}
		//System.out.println(rev); 
		
		//2.using stringbuffer class
		//StringBuffer sf = new StringBuffer(s);
		//System.out.println(sf.reverse());
		
		String string = "Neosoft QA Team";
		int length = string.length();
		String reverse ="";
		for(int j=length-1;j>=0;j--)
		{
			reverse = reverse + string.charAt(j);
		}
		System.out.println(reverse);
		
	}

}
