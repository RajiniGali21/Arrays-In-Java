package com.kn.TwodArray;

import java.util.Scanner;

public class TwodArrayCreation {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
//		Array creation and declaration
		System.out.println("enter the size of n = ");
		int n = sc.nextInt();
		System.out.println("enter the size of m = ");
		int m = sc.nextInt();
		int[][] arr = new int[n][m];
//		Array intitialization
		for(int i=0;i<n;i++)
		{
		System.out.println("enter the student "+(i+1)+" data :");
		for(int j=0;j<m;j++)
		{
			System.out.println("enter the subject "+(j+1)+"marks = ");
			
				arr[i][j]=sc.nextInt();
			}
		}
		studentMarks(arr);
		sc.close();
	}
	
public static void studentMarks(int[][] arr)
	{
	for(int i=0;i<arr.length;i++)
	{
		System.out.println("student "+(i+1)+" data = ");
		for(int j=0;j<arr[i].length;j++)
		{
		System.out.println("subject "+(j+1)+" marks = ");
		System.out.println(arr[i][j]);
	}
	}
	}
	}
