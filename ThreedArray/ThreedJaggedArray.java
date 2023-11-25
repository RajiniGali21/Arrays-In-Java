package com.kn.ThreedArray;

import java.util.Scanner;

public class ThreedJaggedArray {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int[][][] arr = new int[2][][];
		arr[0]=new int[1][];
		arr[1]=new int[2][];
		arr[0][0]=new int[2];
		arr[1][0]=new int[3];
		arr[1][1]=new int[2];
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
		threedJaggedArray(arr);
		sc.close();
	}

		
	public static void threedJaggedArray(int[][][] arr) 
	{		
	System.out.println("elements are = ");
	for(int i=0;i<arr.length;i++)
	{
		for(int j=0;j<arr[i].length;j++) {
			for(int k=0;k<arr[i][j].length;k++) {
				System.out.println(arr[i][j][k]);
			}
		}
	}
	}

}
