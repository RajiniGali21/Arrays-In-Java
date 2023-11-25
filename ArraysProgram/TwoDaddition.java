package com.kn.ArraysProgram;

import java.util.Scanner;

public class TwoDaddition {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
//		Array declaration and creation
		System.out.println("enter the size of an array = ");
		int[][] arr = new int[scan.nextInt()][scan.nextInt()];
		System.out.println("enter the size of an array = ");
		int[][] brr = new int[scan.nextInt()][scan.nextInt()];

//		System.out.println("enter the size of an array = ");
//		int[][][] crr = new int[scan.nextInt()][scan.nextInt()][scan.nextInt()];
		
//		Array initialization
		System.out.println("enter the arr array values = ");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.println("enter the elements of an  arr array = ");
				arr[i][j]= scan.nextInt();
			}
		}
		System.out.println("enter the brr array values = ");
		for(int i=0;i<brr.length;i++)
		{
			for(int j=0;j<brr[i].length;j++)
			{
				System.out.println("enter the elements of an brr array = ");
				brr[i][j] = scan.nextInt();
			}
		}
//		System.out.println("enter the crr array values = ");
//		for(int i=0;i<crr.length;i++)
//		{
//			for(int j=0;j<crr[i].length;j++)
//			{
//				for(int k=0;k<arr[i][j].length;k++)
//				{
//				System.out.println("enter the elements of an crr array = ");
//				crr[i][j][k] = scan.nextInt();
//			}
//		}

		twodAddition(arr,brr);
//		threeAdition(arr,brr,crr);
//			threedAdditionOfElements(arr,brr,crr);
		scan.close();
	}

//	public static void threeAdition(int[][] arr, int[][] brr, int[][] crr) 
//	{
//		int[][] drr = new int[arr.length][arr[0].length];
//		for(int i=0;i<crr.length;i++)
//		{
//			for(int j=0;j<crr[i].length;j++)
//			{
//				drr[i][j]=arr[i][j]+brr[i][j]+crr[i][j];
//				System.out.println("Addition of 3d array = "+drr[i][j]);
//			}
//		}
//	}

	public static void twodAddition(int[][] arr, int[][] brr) 
	{
        int[][] crr = new int[arr.length][arr[0].length];
		for(int i=0;i<crr.length;i++)
		{
			for(int j=0;j<crr[i].length;j++)
			{
				crr[i][j] =  arr[i][j]  +  brr[i][j] ;
			
			System.out.println("sum of " +i+ " & "+j+ "is =  "+crr[i][j]);
		}
		}
	}
	
}

//	public static void threedAdditionOfElements(int[][][] arr, int[][][] brr, int[][][] crr) 
//	{
//		int[][][] drr = new int[arr.length][arr[0].length][arr[0][1].length];
//		for(int i=0;i<drr.length;i++)
//		{
//			for(int j=0;j<drr[i].length;j++)
//			{
//				for(int k=0;k<drr[i][j].length;k++)
//				{
//					drr[i][j][k] = arr[i][j][k]+brr[i][j][k]+crr[i][j][k];
//					System.out.println("addition of "+i+" "+j+" "+k+" array = "+drr[i][j][k]);
//				}
//			}
//		}
//	}

	


