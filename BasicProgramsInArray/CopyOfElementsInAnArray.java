package com.kn.BasicProgramsInArray;

import java.util.Scanner;

public class CopyOfElementsInAnArray {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of an array = ");
		int[] arr = new int[sc.nextInt()];
		System.out.println("enter elements = ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("enter the data "+(i+1)+" of the array = ");
			arr[i]=sc.nextInt();
		}
		int crr[] = copyingArrayElements(arr);
		System.out.println("elements are = ");
		for(int i=0;i<crr.length;i++)
		{
			System.out.println(crr[i]);
		}
		sc.close();
	}

	public static int[] copyingArrayElements(int[] arr)
	{
		System.out.println("copied elements are = ");
		int[] brr = new int[arr.length];
		for(int i=0;i<brr.length;i++)
		{
			brr[i]=arr[i];
			
		}
		return brr;
	}

}
