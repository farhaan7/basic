package oOPConceptPart2;

public class TestCar {

	public static void main(String[] args) {
		//static polymorphism :compile time polymorphism
		BMW b = new BMW();
		b.Start();
		b.stop();
		b.refuel();
		b.speedup();//compile time polymorphism
		b.engine();//accessing property of super class vehicle
		
		System.out.println("@@@@@@@@@@@");
		
		Car c = new Car();
		c.Start();
		c.stop();
		c.refuel();
		//c.speedup();//parent class cannot access property o child class
		
		System.out.println("@@@@@@");
		//child class object can be referred by parent class object reference also called top casting
		Car c1 = new BMW();//child class object can be referred by parent class reference variable is called
		//dynamic polymorphism or runtime polymorphism
		//THESE IS TOP CASTING
		c1.Start();//child class method will be selected
		c1.stop();
		c1.refuel();
		//c1.speedup();//parent clASS cannot access childclass property using dynamic polymorphism only by runtime
		//polymorphism
		
		//DOWN CASTING : IS NOT ALLOWED
		//BMW b1 = new Car(); not allowed
		//big thing cannot fit in small thing
		//parent cannot fit into child class reference variable(b1)
	//	To solve these just cast it
		//BMW b1 =(BMW)new Car();//THIS IS NOT ALLOWED WILL GIVE CLASS CAST EXCEPTION IN RUNTIME
	//	TOP CASTING IS DYNAMIC POLYMORPHISM :CHILD CLASS OBJECT CAN BE REFERRED BY PARENT CLASS REFERENCE VARIABLE
		//DOWN CASTING : REFERED BY CHILD CLASS REFERENCE VARIABLE
		
	}

}
