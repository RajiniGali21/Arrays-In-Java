package com.kn.arrays;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
//		Array declaration
		String[] arr;
//		Array creation
		System.out.println("enter the size = ");
		arr = new String[scan.nextInt()];
//		array initialization
		for(int i=0;i<arr.length;i++) 
		{
			System.out.println("enter the element data of the element  = "+(i+1));
			arr[i]=scan.next();
		}
		stringOfArray(arr);
		scan.close();

		
	}

	public static void stringOfArray(String[] arr) 
	{
//		Array Traversing
		System.out.println("elements are = ");
		for(int i=0;i<arr.length;i++)
//		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.println(arr[i]);
		}
	}

}
