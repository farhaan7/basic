package practiseQuestions;

import java.util.Collections;

public class ArrayList {

	public static void main(String[] args) 
	{
		java.util.ArrayList<Integer> list = new java.util.ArrayList<Integer>();  
		
		list.add(40);  
		list.add(60);  
		list.add(30);  
		list.add(34);  
		list.add(80);  
		list.add(23);  
		list.add(54);
		list.add(90);  
		list.add(76);
		
		System.out.println("ArrayList Before Sorting:");  
		for(int marks: list)  
		{  
		System.out.println(marks);  
		}  
		Collections.sort(list);
		System.out.println("ArrayList After Sorting:");  
		for(int marks: list)  
		{  
		System.out.println(marks);  
		}  
		}  
		
	}


