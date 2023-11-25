package com.kn.BubbleSort;

import java.util.Scanner;

public class BubbleSorting {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
//		Array Declaration and creation
		System.out.print("enter the size of an array = ");
		int[] arr = new int[scan.nextInt()];
//		Array initialization 
		System.out.println("enter the elements to be sort = ");
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i] =scan.nextInt();
		}
		bubbleSortOfAnArray(arr);
		scan.close();
		
	}
// Method to calculate the array elements to be sorted
	public static void bubbleSortOfAnArray(int[] arr) 
	{
//		Array Traversing
		System.out.println("====After Swapping====");
		for(int i=0;i<arr.length;i++)
		{
			int count=0;
			for(int j=0;j<arr.length-1-i;j++)
			{
				int temp=0;
		        if(arr[j]>arr[j+1])
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					count=1;
				}
			}
			if(count==0)
				break;
		}
		for(int i:arr)
		{
			System.out.println(i+" ");
		}
   }
}
