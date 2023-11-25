package com.kn.TwodArray;

import java.util.Scanner;

public class TwodAdditionOfAnArray 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of arr array = ");
		int[][] arr = new int[sc.nextInt()][sc.nextInt()];
		System.out.println("enter the size of an brr array = ");
		int[][] brr = new int[sc.nextInt()][sc.nextInt()];
//		Array intitialization
		System.out.println("arr elements are = ");
		for(int i=0;i<arr.length;i++)
		{
		for(int j=0;j<arr[i].length;j++)
		{
		arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("brr elements are = ");
		for(int i=0;i<brr.length;i++)
		{
		for(int j=0;j<brr[i].length;j++)
		{
		brr[i][j]=sc.nextInt();
		}
		}
		twodAddition(arr,brr);
		sc.close();
	}

	public static void twodAddition(int[][] arr,int[][] brr)
	{
		System.out.println("addition of two arrays of arr and brr arrays = ");
		int[][] crr = new int[arr.length][arr[0].length];
		for(int i=0;i<crr.length;i++)
		{
			for(int j=0;j<crr[i].length;j++)
			{
				crr[i][j]=arr[i][j]+brr[i][j];
				System.out.println(crr[i][j]);
			}
		}
	}
}
