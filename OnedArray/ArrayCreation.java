package com.kn.OnedArray;

import java.util.Scanner;

public class ArrayCreation {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of an array = ");
//	 Array declaration and creation	
		int[] arr = new int[sc.nextInt()];
//		Array intialisation
//		Array Traversing
		int k=10;
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=k;
			k=k+10;
		}
		for(int i=0;i<arr.length;i++)
		{
			
			System.out.println(arr[i]);
		}
		sc.close();
	
		
		
		
	}


}
