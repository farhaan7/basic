package oOPConceptPart2;

public class BMW extends Car { //HAS-A RELATIONSHIP
	//when same method is present in parent class as well as child class with same name and same no. of arguments,is called
		//method overriding..preference is given to childclass method
	public void Start()//overridden method
	{
		System.out.println("BMW START");
	}
	
	void speedup()
	{
		System.out.println("reach top speed 200");
	}

}
