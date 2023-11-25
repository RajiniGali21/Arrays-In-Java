package com.kn.Array;

import java.util.Scanner;

public class SumOfArrayElementsInaMethod {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
//		Array declaration and creation
		System.out.println("enter the size of an array = ");
		int[] arr = new int[scan.nextInt()];
//		Array initialization
		System.out.println("enter the elements = ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("enter the data "+(i+1)+" in the array =");
			arr[i] = scan.nextInt();
		}
//		Array Traversing
		System.out.println("Array elements are = ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		int TotalSum = sumOfArrayElements(arr);
		System.out.println("sum of the array elements are = "+TotalSum);
		scan.close();
	}

	public static int sumOfArrayElements(int[] arr)
	{
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum += arr[i];
		}
		return sum;
	}

}
