package com.kn.Array;

import java.util.Scanner;

public class TaskA {

	public static void main(String[] args)
	{
		Scanner scan = new  Scanner(System.in);
		System.out.println("enter the size = ");
//		Array declaration and creation
		int[] arr = new int[scan.nextInt()];
//		Array initialization 
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("enter the elements = "+(i+1)+"=");
			arr[i]=scan.nextInt();
		}
		System.out.println("------> intiialization done in main()");
		
		int[] crr = copyArrayElements(arr);
//		Array Traversing
		System.out.println("elements are = ");
		for(int i=0;i<crr.length;i++)
		{
			System.out.println(crr[i]);
		}
		scan.close();
	}

	public static int[] copyArrayElements(int[] arr) 
	{
		System.out.println("copy elements are called =");
		int[] brr = new int[arr.length];
		for(int i=0;i<brr.length;i++)
		{
			brr[i]=arr[i];
		}
		return brr;
		
	}

}
