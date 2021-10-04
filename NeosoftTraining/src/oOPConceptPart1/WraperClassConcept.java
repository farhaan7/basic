package oOPConceptPart1;

public class WraperClassConcept
{
	//wrapper classes are used to convert one data type to another
	public static void main(String[] args) 
	{
		String x ="100";
		System.out.println(x+20);  //10020
		
		//data conversion : string to int
		int i = Integer.parseInt(x);
		System.out.println(i+20); //120
		
		//string to double conversion
		String y = "12.33";
		Double d = Double.parseDouble(y);
		System.out.println(d+10); //22.33
		
		//string to char not available
		
		//string to boolean
		String q = "true";
		Boolean b = Boolean.parseBoolean(q);
		System.out.println(b);
		
		//int to string conversion
		int h= 200;
		System.out.println(h+20);//220
		
		String a = String.valueOf(h);
		System.out.println(a+20);//20020
		
		//converting mixed datatypes will give error
		String o = "100A";
		int m = Integer.parseInt(o);
		System.out.println(o);//number format exception
				
		
		
		
	}

}
