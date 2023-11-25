package com.kn.TwodArray;

import java.util.Scanner;

public class JaggedArray {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
//		System.out.println("enter the size of an array = ");
		int[][] arr = new int[2][];
		arr[0]=new int[2];
		arr[1]=new int[3];
		System.out.println("enter the elements for jagged array = ");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		twodJaggedArray(arr);
		sc.close();
	}

	public static void twodJaggedArray(int[][] arr) 
	{
		System.out.println("elements are = ");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.println(arr[i][j]);
			}
		}
	}

}
