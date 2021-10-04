package javabasics;

public class ArrayConcept {

	public static void main(String[] args) {
		//array:to store similar datatype value in a array variable.
		//1. int array 
		/* lowest bound index =0
		 * upper bound/index = n-1(n is size of array)
		 * one dim array
		 * 
		 * Disadvantages of array :
		 * 1.size is fixed:static array:to overcome these problem we use
		  collections-----------ArrayList,HashTable also called dynamic array
		  2.Store only similar DataType--to overcome these we use Object Array.
		 */
		//1. int array
		int i[] = new int[4];
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;
		System.out.println(i[2]);
		System.out.println(i[3]);
         //System.out.println(i[4]);//will give index out of bound exception as array is upto 3
		System.out.println(i.length);//to check total no. of array
		
		//print all the values of array : use forloop
		for(int j=0;j<i.length;j++)
		{
			System.out.println(i[j]);
		}
		
		//2. double array
		double d[]=new double[3];
		d[0] = 12.33;
		d[1] = 13.33;
		d[2] = 14.33;
		
		System.out.println(d[2]);
		
		//3. char array
		char c[] = new char[3];
		c[0] = 'h';
		c[1] = '@';
		c[2] = '2';
		
		//4. boolean array;
		
		boolean b[] = new boolean[2];
		b[0] = true;
		b[1] = false;
		
		//5. String array
		String s[] = new String[3];
		s[0] = "hello";
		s[1] = "farhaan";
		s[2] = "kaise ho";
		
		System.out.println(s.length);
		System.out.println(s[1]);
		
		for(int f=0;f<s.length;f++)
		{
			System.out.println(s[f]);
		}
		
		//dynamic object array
		Object ob[] = new Object[6];
		ob[0] = "farhaan";
		ob[1] = 12.33;
		ob[2] = 27;
		ob[3] = 'M';
		ob[4] = true;
		ob[5] = "03/04/1996";
		
		System.out.println(ob[0]);
		System.out.println(ob.length);
		
		
	}

}
