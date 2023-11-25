package com.kn.NonStaticMethodsExampleInAnArray;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of an array = ");
		int[] arr = new int[sc.nextInt()];
		System.out.println("elements are = ");
		for(int i=0;i<arr.length;i++)
		arr[i]=sc.nextInt();
		
		PrintOddOrEven printOddOrEven = new PrintOddOrEven();
		printOddOrEven.printOddOrEven1(arr);
		printOddOrEven.countOfEvenOrOdd(arr);
		sc.close();
	}

}
