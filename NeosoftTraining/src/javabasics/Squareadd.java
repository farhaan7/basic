package javabasics;

import java.util.Scanner;

public class Squareadd {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
int n, sum = 0;
		
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter no. of elements you want in array:");
	    n = sc.nextInt();
	    
	    int a[] = new int[n];
	    System.out.println("Enter all the elements:");
	   
	    for(int i = 0; i < n; i++)
        {
	    	a[i] = sc.nextInt();
	        sum = sum + a[i]*a[i];
	    }
        System.out.println("Sum of squares all the elements in the array is :"+sum);


	}

}
