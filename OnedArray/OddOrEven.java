package com.kn.OnedArray;

import java.util.Scanner;

public class OddOrEven {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
//		array declaration and creation
		System.out.println("enter the size of an array = ");
		int[] arr = new int[sc.nextInt()];
//		Array initialization
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("enter the element data of the array "+(i+1)+" = ");
			arr[i]=sc.nextInt();
		}
//		Array traversing
		printOddOreven(arr);
		sc.close();
	}

	public static void printOddOreven(int[] arr) 
	{
		for(int i=0;i<arr.length;i++)
		{
		if(arr[i]%2==0)
		{
			System.out.println("even number");
		}
		else
		{
			System.out.println("odd number");
		}
		}
	}
}
