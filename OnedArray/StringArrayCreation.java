package com.kn.OnedArray;

import java.util.Scanner;

public class StringArrayCreation {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of an array = ");
		String[] arr = new String[sc.nextInt()];
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("enter the string data "+(i+1)+" of the array = ");
			arr[i]=sc.next();
		}
		System.out.println("String elements are = ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		sc.close();
	}

}
