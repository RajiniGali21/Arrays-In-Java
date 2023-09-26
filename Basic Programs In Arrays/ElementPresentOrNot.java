package com.kn.arrays;

import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
//		Array declaration
		int[] arr;
//		Array creation
		System.out.println("enter the size of an array = ");
		arr = new int[scan.nextInt()];
//		Array initialization
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("enter the elements of an array "+(i+1)+" = ");
			arr[i]=scan.nextInt();
		}
		System.out.println("enter the element to be found = ");
		int ele = scan.nextInt();
		boolean  flag = ElementPresentOrNot(arr,ele);
		if(flag)
		{
			System.out.println("element "+ele+" is found" );
		}
		else
		{
			System.out.println("element "+ele +" is not found");
		}
		scan.close();
		
	}

	private static boolean ElementPresentOrNot(int[] arr, int ele) 
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==ele)
			{
				return true;
			}
		}
		return false;
	}

	
	
	
}
