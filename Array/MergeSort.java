package com.kn.Array;

import java.util.Scanner;

public class MergeSort {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
//		array declaration and creation
		System.out.println("enter the size of an arr array = ");
		int[] arr = new int[scan.nextInt()];
		System.out.println("enter the size of brr array = ");
		int[] brr = new int[scan.nextInt()];
//		Array initialization
		System.out.println("enter the arr elements :");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=scan.nextInt();
		}
		System.out.println("enter the brr elements: ");
		for(int i=0;i<brr.length;i++)
		{
			brr[i]=scan.nextInt();
		}
//		Array Traversing
		int[] crr = mergeArrayOfElements(arr,brr);
		System.out.println("elements of merge array = ");
		for(int i=0;i<crr.length;i++)
		{
		System.out.println(crr[i]);
		}
//		int[] crr = mergeArrayOfElements(arr,brr);
//		System.out.println("arr elements = ");
//		for(int i:arr)
//		{
//			System.out.println(i+" ");
//		}
//		System.out.println("brr elements = ");
//		for (int i:brr)
//			
//		{
//			System.out.println(i+" ");
//		}
//		System.out.println("merge array elements are = ");
//		for(int i:crr)
//		{
//			System.out.println(i+" ");
//		}
		scan.close();
}
//	method to merge the two array elements in single array
public static int[] mergeArrayOfElements(int[] arr, int[] brr) 
	{
		int[] crr = new int[arr.length+brr.length];
				for(int i=0;i<arr.length;i++)
				{
					crr[i]=arr[i];
				}
		int j=0;
		for(int i=arr.length;i<crr.length;i++)
		{
			crr[i]=brr[j];
			j++;
		}
		return crr;
	}

}
