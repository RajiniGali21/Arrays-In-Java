package com.kn.Array;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
//		Array declaration
		int[] arr;
//		Array creation
		System.out.println("enter the size = ");
		arr = new int[scan.nextInt()];
//		Array initialization
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("enter the elements of an array "+(i+1)+" ");
			arr[i]=scan.nextInt();
			
		}
		System.out.println("---->object is created");
		PrintEvenOrOdd printEvenOrOdd2 = new PrintEvenOrOdd();
		printEvenOrOdd2.printEvenOrOdd(arr);
		
		
		System.out.println("count of an even or odd number in an array = ");
		printEvenOrOdd2.countEvenOrOdd(arr);
		
		scan.close();
	}	
}
