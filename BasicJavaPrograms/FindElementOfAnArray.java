package com.kn.Arrays;
import java.util.Scanner;
public class FindElementOfAnArray {

	


		public static void main(String[] args) 
		{
			Scanner scan = new Scanner(System.in);
//			Array declaration
			int[] arr;
//			Array creation
			System.out.println("enter the size of an array = ");
			arr = new int[scan.nextInt()];
//			/Array initialization
			for(int i=0;i<arr.length;i++)
			{
			System.out.println("enter the elemnets "+(i+1)+" = ");
			arr[i]= scan.nextInt();
			}
			findElementOfAnArray(arr);
			scan.close();


		}

		public static void findElementOfAnArray(int[] arr)
		{
//			Array Traversing
			for(int i=0;i<=arr.length-1;i++)
			{
				if(i==2)
				{
					System.out.println(arr[i]+" =  is the " +i+ " elements of given array");

				}
			}
		}

	}