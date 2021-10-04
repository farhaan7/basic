package oOPConceptPart1;

public class StaticAndNonStaticConcept
{
	//global variables : the scope of global variables will be available across all the functions with some conditons
		String name = "farhaan";
		static int age = 25; 

	public static void main(String[] args) 
	{
		//how to call method and variables
		//1.direct calling
		sum(); //static method
		//2.calling by class name
		StaticAndNonStaticConcept.sum();
		
		System.out.println(age);
		System.out.println(StaticAndNonStaticConcept.age);
		
		//how to call non static methods and variables
		StaticAndNonStaticConcept obj = new StaticAndNonStaticConcept();
		obj.sendmail();
		System.out.println(obj.name);
		
		//can i access static method by using object references??yess
		obj.sum(); //warning will be given as it is not a good practise
		
	
		
	}
	
	public void sendmail() //non static method
	{
		System.out.println("send mail method:");
	}
	public static void sum()//static method
	{
		System.out.println("sum method");
		
	}
}
