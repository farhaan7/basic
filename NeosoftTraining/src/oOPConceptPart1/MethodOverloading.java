package oOPConceptPart1;


public class MethodOverloading 

{
//cannot create method into method
	//cannot create same name method
	
	//method overloading :when the method name is same with different parameters within the same class
	//duplicate method :same method with same no. of arguments is not allowed
	//we can overload main method also by passing different parameters
	//parameters and arguments is same which we write in bracket of methods
	//likewise method and function is also same with 2 names in java. :)
	
	public static void main(String[] args) {
		MethodOverloading obj = new MethodOverloading();
		obj.sum();
		obj.sum(10);
		obj.sum(10,20);
		obj.sum(22.2);

	}
	//you cannot create a method inside a method
	
	public void sum()//zero parameter
	{
		System.out.println("sum method---zero parameter");
	}
	
	public void sum(double d)//one parameter or argument
	//we can pass same method name with same parameters if we r using differnet datatypes
	{
		System.out.println("i am double");
	}
	
	public void sum(int x)//one parameter
	{
		System.out.println("sum method----1 parameter");
		System.out.println(x);
	}

	public void sum(int x, int y)//two parameters
	{
		System.out.println("sum method----1 parameter");
		System.out.println(x+y);
	}

}
