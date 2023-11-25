package com.kn.OnedArray;

import java.util.Scanner;

public class OnedAddition 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of an arr array = ");
		int[] arr = new int[sc.nextInt()];
		System.out.println("enter the size of an brr array = ");
		int[] brr = new int[sc.nextInt()];
		System.out.println("elements elements of an arr array =");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("elements of an brr array = ");
		for(int i=0;i<brr.length;i++)
		{
			brr[i]=sc.nextInt();
		}
		additionOdOnedArray(arr,brr);
		sc.close();
	}

	public static void additionOdOnedArray(int[] arr, int[] brr)
	{
		System.out.println("Addition of one-d array = ");
		int[] crr = new int[arr.length];
		for(int i=0;i<crr.length;i++)
		{
			crr[i]=arr[i]+brr[i];
			System.out.println(crr[i]);
		}
	}

}
