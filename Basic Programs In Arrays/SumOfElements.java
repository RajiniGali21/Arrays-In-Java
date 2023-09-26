package com.kn.arrays;

import java.util.Scanner;

public class Task5 {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
//		Array declaration
		int[] arr;
//		Array creation
		System.out.println("enter the size = ");
		arr = new int[scan.nextInt()];
//		Array initialization
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("enter the elements of an array "+(i+1)+" ");
			arr[i]=scan.nextInt();
			
		}
		sumOfElements(arr);
		scan.close();
	}

// Method to calculate sum of an array elements
	public static void sumOfElements(int[] arr) 
	{
//		Array traversing
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum +=arr[i];
		}
		System.out.print(sum +"=  sum of the elements of an array");
	}
	

}
