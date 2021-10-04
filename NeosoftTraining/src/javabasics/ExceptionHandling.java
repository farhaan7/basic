package javabasics;

public class ExceptionHandling {

	public static void main(String[] args) 
	{
		try {
		System.out.println("hello world");
		int i = 1/0;
		System.out.println("completed");
		}catch(Exception e)
		{
			System.out.println("i am inside catch block");
			System.out.println("message is"+e.getMessage());//gives the exception message
			//
			System.out.println("cause is"+e.getCause());//gives the cause for the exception
			e.printStackTrace();//prints trace
		//	throw new ArithmeticException("not valid operation");//throws any error on console  you wish to declare.
			
		}
		finally {
			System.out.println("i am inside finally");//it runs despite any exception
			
		}
		}

}