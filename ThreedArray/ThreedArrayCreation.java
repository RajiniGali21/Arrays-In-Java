package com.kn.ThreedArray;

import java.util.Scanner;

public class ThreedArrayCreation {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of an array = ");
		int[][][] arr = new int[sc.nextInt()][sc.nextInt()][sc.nextInt()];
		System.out.println("enter the data = ");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				for(int k=0;k<arr[i][j].length;k++)
				{
					arr[i][j][k]=sc.nextInt();
				}
			}
		}
		threedArrayCreation(arr);
		sc.close();
	}
		public static void threedArrayCreation(int[][][] arr) 
		{
			System.out.println("elements are = ");
			for(int i=0;i<arr.length;i++)
			{
				for(int j=0;j<arr[i].length;j++)
				{
					for(int k=0;k<arr[i][j].length;k++)
					{
						System.out.println(arr[i][j][k]);
					}
				}
			}
	}

}
