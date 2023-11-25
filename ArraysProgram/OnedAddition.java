package com.kn.ArraysProgram;

import java.util.Scanner;

public class OnedAddition {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
//		Array Declaration and Creation
		System.out.println("enter the size of an array = ");
		int[] arr = new int[scan.nextInt()];
		System.out.println("enter the size of an zrray = ");
		int[] brr = new int[scan.nextInt()];
//		
//		Array initialization
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("enter the number in first array = ");
			arr[i]=scan.nextInt();
		}
		
			for(int i=0;i<brr.length;i++)
			{
			System.out.println("enter the number in second array = ");
			brr[i]=scan.nextInt();
			}
		
		
		additionOfArray(arr,brr);
		scan.close();
//		Array Traversing
		
		
	}
public static void additionOfArray(int[] arr, int[] brr) 
	{
     int[] crr= new int[arr.length];
	for(int i=0;i<crr.length;i++)
	{
		System.out.println("c[i] = ");
		crr[i] = arr[i]+brr[i];
	
	System.out.println("addition of array = "+crr[i]);
    }
	}
}
