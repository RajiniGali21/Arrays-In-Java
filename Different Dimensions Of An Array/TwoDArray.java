package com.kn.ArraysProgram;

import java.util.Scanner;

public class TwoDArray {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
//		Array declaration and creation
		System.out.println("enter the size of n = ");
		int n = scan.nextInt();
		System.out.println("enter the size of m = ");
		int m = scan.nextInt();
		int[][] arr = new int[n][m];
//		Array initialization
		for(int i=0;i<n;i++) {
			System.out.println("enter the student "+(i+1)+" data :");
		
			for(int j=0;j<m;j++)
			{
				System.out.println("enter the student "+(j+1)+" marks =");
				arr[i][j] = scan.nextInt();
			}
				
		}
		StudentMarks(arr);
		scan.close();
	}
public static void StudentMarks(int[][] arr) {
		// TODO Auto-generated method stub
//		Array Traversing
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Student "+(i+1)+" data :");
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.println("subject "+(j+1)+" marks = "+arr[i][j]);
			}
		
	}

	}
}
