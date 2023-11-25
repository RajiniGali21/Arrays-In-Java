package com.kn.ArraysProgram;

import java.util.Scanner;

public class TwoDJaggedArray {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
//		Array declaration and creation
		int[][] arr = new int[2][];
		arr[0]=new int[4];
		arr[1]=new int[2];
//		Array initialization
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("enter the values of "+(i+1)+" array = ");
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.println("enter the values of "+(j+1)+" = ");
				arr[i][j]=scan.nextInt();
			}
		}
		twodJaggedArray(arr);
		scan.close();
	}
public static void twodJaggedArray(int[][] arr) {
//		Array Traversing
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("values of "+(i+1)+" array = ");
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.println("values are "+(j+1)+ " = "+arr[i][j]);
			}
		}
}
}

	


