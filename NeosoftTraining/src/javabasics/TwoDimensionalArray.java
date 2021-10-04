package javabasics;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		String x[][] = new String[3][5];
		System.out.println(x.length);//3 : will give no. of rows
		System.out.println(x[0].length);//5 : will give no. of column
		
		x[0][0] = "A";
		x[0][1] = "B";
		x[0][2] = "C";
		x[0][3] = "D";
		x[0][4] = "E";
		
		x[1][0] = "A1";
		x[1][1] = "B1";
		x[1][2] = "C1";
		x[1][3] = "D1";
		x[1][4] = "E1";
		
		x[2][0] = "A2";
		x[2][1] = "B2";
		x[2][2] = "C2";
		x[2][3] = "D2";
		x[2][4] = "E2";
		
		System.out.println(x[0][4]);
		System.out.println(x[2][3]);
		
		//print all the values of 2d array using for loop
		//row = 0, col = 0 to 4
		//row = 0, col = 0 to 4
		//row = 0, col = 0 to 4
		for(int row=0;row<x.length;row++)
		{
			for(int col=0;col<x[0].length;col++)
			{
				System.out.println(x[row][col]);
			}
		}
	}

}
