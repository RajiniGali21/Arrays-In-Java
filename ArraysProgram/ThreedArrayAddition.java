package com.kn.ArraysProgram;

import java.util.Scanner;

public class ThreedArrayAddition {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
//		Array declaration
		int[][][] arr;
		int[][][] brr;
//		Array creation
		System.out.println("enter the size of arr array = ");
		arr = new int[scan.nextInt()][scan.nextInt()][scan.nextInt()];
		System.out.println("enter the size of brr array = ");
		brr = new int[scan.nextInt()][scan.nextInt()][scan.nextInt()];
//		Array initialization
		System.out.println("enter data for arr array = ");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++) 
			{
				for(int k=0;k<arr[i][j].length;k++)
				{
					arr[i][j][k] = scan.nextInt();
				}
					
			}
		}
		System.out.println("enter data for brr array = ");
		for(int i=0;i<brr.length;i++)
		{
			for(int j=0;j<brr[i].length;j++) 
			{
				for(int k=0;k<brr[i][j].length;k++)
				{
					brr[i][j][k] = scan.nextInt();
				}
					
			}
		}
		threedAdditionArray(arr, brr);
		scan.close();


		
				}

	public static void threedAdditionArray(int[][][] arr, int[][][] brr) 
	{
		System.out.println("addition of elements of arr and brr array  = ");
		System.out.print("crr array = ");
		int[][][] crr = new int[arr.length][arr[0].length][arr[1].length]; 
		for(int i=0;i<crr.length;i++)
		{
			for(int j=0;j<crr[i].length;j++) 
			{
				for(int k=0;k<crr[i][j].length;k++)
				{
					System.out.print("addition of "+i+ " "+j+" "+k+" = ");
					crr[i][j][k] = arr[i][j][k]+brr[i][j][k]; 
					System.out.println(crr[i][j][k]);
				}
					
			}
		}
	
	}

}
