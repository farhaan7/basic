package oOPConceptPart1;

public class Car 
{
	int mod;
	int wheel;
	//object reference variables in java
	public static void main(String[] args) 
	{
		//car() : this is the object of car class
		//new : keyword is used to create the object
		//a,b,c : are the object reference variables.
	 Car a = new Car();
	 Car b = new Car();
	 Car c = new Car();
	 
	 a.mod = 2015;
	 a.wheel = 4;
	 
	 b.mod = 2017;
	 b.wheel = 2;
	 
	 c.mod = 2020;
	 c.wheel = 3;
	 
	 System.out.println("model a car = " +a.mod);
	 System.out.println("model a wheel = "+a.wheel);
	 
	 System.out.println("model b car = "+b.mod);
	 System.out.println("model b wheel = "+b.wheel);
	 
	 System.out.println("model c car = "+c.mod);
	 System.out.println("model c wheel = "+c.wheel);
	 
	 System.out.println("after shifting the references:");
	 
	 a=b;
	 b=c;
	 c=a;
	 
	 a.mod = 10;
	 System.out.println(a.mod); //10
	 c.mod = 20;
	 System.out.println(a.mod);  //20
	 System.out.println(c.mod);
	}

}
