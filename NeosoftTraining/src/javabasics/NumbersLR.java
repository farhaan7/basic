package javabasics;

import java.util.Scanner;

public class NumbersLR {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int L,R;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter L");
		L = sc.nextInt();
		System.out.println("Enter R");
		R = sc.nextInt();
		
		System.out.println("All the numbers between L and R are :");
		for(int i=L ; i<=R ; i++)
		{
		  System.out.println(i);
		}		

	}

}
