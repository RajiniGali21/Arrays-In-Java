package com.kn.Arrays;
import java.util.Scanner;
public class EvenOrOdd {


	


		public static void main(String[] args) 
		{
			Scanner scan  = new Scanner(System.in);
//			Array declaration
			int[] arr;
//			Array creation
			System.out.println("enter the size of an array = ");
			arr= new int[scan.nextInt()];
//			Array initialization
			for(int i=0;i<arr.length;i++)
			{
				System.out.println(" enter the element data of the array = "+(i+1)+ " ");
				arr[i]=scan.nextInt();
			}
			evenOrOdd(arr);
			scan.close();

		}

		public static void evenOrOdd(int[] arr) 
		{
//			Array traversing
			for(int i=0;i<arr.length;i++)
			{
				if(arr[i]%2==0)

				{
					System.out.println(arr[i]+ " "+ "= even numbers ");
				}
				else
				{
					System.out.println(arr[i]+" "+ " = odd numbers");
				}

			}
		}

	}