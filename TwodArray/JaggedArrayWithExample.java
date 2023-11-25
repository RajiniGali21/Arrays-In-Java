package com.kn.TwodArray;

import java.util.Scanner;

public class JaggedArrayWithExample {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number of batches = ");
		String arr[][] = new String[sc.nextInt()][];
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("enter no of friends in A "+(i+1)+" batch = ");
			arr[i]=new String[sc.nextInt()];
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("A"+(i+1)+"batch");
			System.out.println("I have "+arr[i].length+" best friends ");
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.println("enter the "+(j+1)+"best friends name = ");
				arr[i][j]=sc.next();
			}
		}
		printTheNameOffriends(arr);
		sc.close();
	}

	public static void printTheNameOffriends(String[][] arr) 
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Batch A"+(i+1));
			System.out.println("I have "+arr[i].length+" best friends in A"+(i+1)+"batch = ");
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.println(+(j+1)+"best friend name  = "+arr[i][j]);
			}
		}
	}

}
