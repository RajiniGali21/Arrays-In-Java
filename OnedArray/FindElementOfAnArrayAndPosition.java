package com.kn.OnedArray;

import java.util.Scanner;

public class FindElementOfAnArrayAndPosition {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of an array = ");
		int[] arr = new int[sc.nextInt()];
		System.out.println("enter the elements in an array = ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		findElementOfAnArray(arr);
		sc.close();
		}

	public static void findElementOfAnArray(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(i==2)
			{
				System.out.println(arr[i]+" = is the "+i+" element of an array");
			}
	}
	}

}
