package com.kn.OnedArray;

import java.util.Scanner;

public class ElementPresentOrNot {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of an array = ");
		int[] arr = new int[sc.nextInt()];
		System.out.println("enter the elements of an array = ");
		for(int i=0;i<arr.length;i++)
		{
		arr[i]=sc.nextInt();
		}
		System.out.println("enter the element to found = ");
		int ele = sc.nextInt();
		boolean flag = elementPresentOrNot(arr,ele);
		if(flag)
		{
			System.out.println("element is found");
		}
		else
		{
			System.out.println("element is not found");
		}
		sc.close();
	}

	public static boolean  elementPresentOrNot(int[] arr, int ele) 
	{
		for(int i=0;i<arr.length;i++)
		{
			if(ele==arr[i])
			{
				return true;
			}
		}
		return false;
	}

}
