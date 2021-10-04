package javabasics;

public class BMW extends Car
{
//when same method is present in parent class as well as child class with same name and same no. of arguments,is called
	//method overriding
	void start()
	{
		System.out.println("BMW----start");
	}
	
	void nitro()
	{
		System.out.println("BMW----NITRO");
	}


}
