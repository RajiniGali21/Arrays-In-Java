package com.kn.arrays;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
//		Array declaration
		int[] arr;
//		Array Creation
		System.out.println("enter the size of an array = ");
		arr = new int[scan.nextInt()];
//		Array intialization
		int k=10;
		for(int i=0;i<arr.length;i++)
		{
		
			arr[i]=k;
			k+=10;
		}
		elementsOfAnArray(arr);
		scan.close();
		
//		
	}

	public static void elementsOfAnArray(int[] arr) 
	{
//		Array traversing
		for(int i=0;i<=arr.length-1;i++)
//		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.println(arr[i]);
		}
	}
}

		
	
		
		
		
			
		
		
	
		
	
		
		
	


