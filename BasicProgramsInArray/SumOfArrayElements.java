package com.kn.BasicProgramsInArray;

import java.util.Scanner;

public class SumOfArrayElements {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of an array = ");
		int[] arr = new int[sc.nextInt()];
		System.out.println("enter the elements = ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		int TotalSum = sumOfElements(arr);
		System.out.println("Sum of the elements in an array = "+TotalSum);
		sc.close();
				
	}

	public static int sumOfElements(int[] arr) 
	{
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum+=arr[i];
			
		}
		return sum;
	}

}
