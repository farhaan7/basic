package oOPConceptPart1;

public class LocalVsGlobalVariables {

	//global variables : are class variables
	String name = "farhaan";
	int age = 25;
	
	public static void main(String[] args) 
	{
		int i = 10;  //local variable for main method
		System.out.println(i);
		LocalVsGlobalVariables obj = new LocalVsGlobalVariables();
		System.out.println(obj.name);
		System.out.println(obj.age);		
	}
	public void sum() {
		int i = 10; //local variable for sum method //both i are different as they r in dfrnt method
		int j = 20;
	}

}
