package com.kn.OnedArray;

import java.util.Scanner;

public class SumOfTheDigits {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of an array = ");
		int[] arr = new int[sc.nextInt()];
		for(int i=0;i<arr.length;i++)
		{
		System.out.println("enter element "+(i+1)+"of the array = ");
		arr[i]=sc.nextInt();
		}
		sumOfTheDigits(arr);
		sc.close();
	}

	public static void sumOfTheDigits(int[] arr)
	{
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum  = sum+arr[i];
		}
		System.out.println("Sum of the elements in an array = "+sum);
	}
}
		
	
