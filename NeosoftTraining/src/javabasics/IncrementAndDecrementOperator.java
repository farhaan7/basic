package javabasics;

public class IncrementAndDecrementOperator {

	public static void main(String[] args) {
		
		int i = 1;
		int j = i++;
		System.out.println(i); //2   post increment
		System.out.println(j); //1
		
		int m = 1;
		int n = ++m;
		System.out.println(m); //2
		System.out.println(n); //2   pre increment
		
		int a = 2;
		int b = a--;
		
		System.out.println(a); //1    post decrement
		System.out.println(b);//2
		
		int c = 2;
		int d = --c;
		System.out.println(c); //1  pre decrement
		System.out.println(d); //1
		
		
		
		
		
	}

}
