package com.kn.BasicProgramsInArray;

import java.util.Scanner;

public class SwappingOfElements {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the length of an array = ");
		int[] arr = new int[sc.nextInt()];
		System.out.println("Array of "+arr.length+"length is created");
		System.out.print("enter "+arr.length+" numbers =");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("enter elements stored in an array");
		System.out.print("arr==>");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("enter the two positions :");
		int pos1 = sc.nextInt();
		int pos2 = sc.nextInt();
		int help;
		help=arr[pos1];
		arr[pos1]=arr[pos2];
		arr[pos2]=help;
		System.out.println("Array elements after swapping :");
		System.out.println("arr===>");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		sc.close();
	}

}
