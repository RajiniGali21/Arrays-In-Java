package com.kn.ThreedArray;

import java.util.Scanner;

public class ThreedAddition {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of an arr array = ");
		int[][][] arr = new int[sc.nextInt()][sc.nextInt()][sc.nextInt()];
		System.out.println("enter the size of an brr array = ");
		int[][][] brr = new int[sc.nextInt()][sc.nextInt()][sc.nextInt()];
		System.out.println("enter the arr array = ");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				for(int k=0;k<arr[i][j].length;k++)
				{
					arr[i][j][k] = sc.nextInt();
				}
			}
		}
		System.out.println("enter the brr array = ");
		for(int i=0;i<brr.length;i++)
		{
			for(int j=0;j<brr[i].length;j++)
			{
				for(int k=0;k<arr[i][j].length;k++)
				{
					brr[i][j][k]=sc.nextInt();
				}
			}
		}
		
		threedAddition(arr,brr);
		sc.close();
		
	}

	public static void threedAddition(int[][][] arr, int[][][] brr) 
	{
		int[][][] crr = new int[arr.length][arr[0].length][arr[1].length];
		for(int i=0;i<brr.length;i++)
		{
			for(int j=0;j<brr[i].length;j++)
			{
				for(int k=0;k<arr[i][j].length;k++)
				{
					crr[i][j][k]=arr[i][j][k]+brr[i][j][k];
					System.out.println(crr[i][j][k]);
				}
			}
		}
	}
}
