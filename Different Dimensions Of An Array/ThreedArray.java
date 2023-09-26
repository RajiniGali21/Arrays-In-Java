package com.kn.ArraysProgram;

import java.util.Scanner;

public class ThreedArray {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
//		Array declaration
		int[][][] arr;
//		Array creation
		arr = new int[2][2][2];
//		Array initialization
		System.out.println("enter data = ");
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
		System.out.println("elements are :");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++) 
			{
				for(int k=0;k<arr[i][j].length;k++)
				{
					System.out.println(arr[i][j][k]+" ");
				}
			}
		}
		scan.close();
	}
}

		
				
	


