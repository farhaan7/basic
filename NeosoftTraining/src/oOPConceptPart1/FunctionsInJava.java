package oOPConceptPart1;

public class FunctionsInJava {
//main method starting point of execution
	public static void main(String[] args) 
	{
		//non static methods
		//void: void doesnot return value thats why we use datatype name before method name
		
		FunctionsInJava obj = new FunctionsInJava();
		//one object will be created,obj is the object reference variable referring to this object
		//after creating the object,the copy of all non static methods will be given to this object
		
		obj.test();
		int l = obj.pqr();
		System.out.println(l);
		String m = obj.qa();
		System.out.println(m);
		int f = obj.division(30, 10);
		System.out.println(f);
		
	}
	
	//return type:void
		public void test() //no input,no output
		{
			System.out.println("test method");
		}
		//return type : int
		public int pqr()    //no input,some output
		{
			System.out.println("pqr method :");
			int a=10;
			int b=20;
			int c=a+b;
			
			return c;
		}
		//return type: string
		public String qa() //no input,some output
		{
			System.out.println("qa method");
			String s="selenium";
			return s;
		}
		//x,y : input parameters/arguments
		//return type : int
		public int division(int x, int y) //some input,some output
		{
			System.out.println("division method:");
			int d=x/y;
			return d;
			
		}
		
	}

