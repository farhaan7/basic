package javabasics;

public class Factorial {
	public static void main(String[] args) {
		int num=0, fact=1;
		for(num=5;num>=1;num--) {
			fact=fact*num;
		}
		System.out.println("Factorial of number is "+fact);
	}
}