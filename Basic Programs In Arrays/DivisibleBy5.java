package com.kn.arrays;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
//		Array declaration
		int[] arr;
//		Array creation
		System.out.print("enter  the size of an array = ");
		arr = new int[scan.nextInt()];
//		Array initialization
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println("enter the element of an array "+(i+1)+" = ");
			arr[i] = scan.nextInt();
		}
		divisibleByFive(arr);
		scan.close();
	}
		
		

	
	//		array traversing
	public static void divisibleByFive(int[] arr)
	{
		// TODO Auto-generated method stub
		for(int i=0;i<=arr.length-1;i++)
	{
		if(arr[i]%5 == 0)
		{
			System.out.println(arr[i]+ " =  is divisble by 5");
			System.out.println(i +" is the  index is divisble by 5");
		}
		else
		{
			System.out.println(arr[i]+" = is not divisible by 5 ");
		}
	}
		
	}
	

}
