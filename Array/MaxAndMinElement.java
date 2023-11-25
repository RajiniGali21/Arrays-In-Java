package com.kn.Array;

import java.util.Scanner;

public class MaxAndMinElement {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the size of an array = ");
		int[] arr = new int[scan.nextInt()];
		System.out.println("Enter the elements = ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=scan.nextInt();
		}
		maximumAndMinimumElements(arr);
		scan.close();
	}
public static void maximumAndMinimumElements(int[] arr)
	{
		int max = -2147483648;
		//int max1=0;
		int min = 2147483647;
		//int min1=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max = arr[i];
				//max1=arr[i+1];
			}
		}
		System.out.println("Maximum number = "+max);
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				min = arr[i];
			}
		}
		System.out.println("Minimum number = "+min);
	}
}


