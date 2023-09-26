package com.kn.ArraysProgram;

import java.util.Scanner;

public class ThreedJaggedArray {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter number of branches =  ");
		String[][][] arr = new String[scan.nextInt()][][];
		for(int i=0;i<arr.length;i++)
		{
			
			System.out.println("enter the number friends in A"+(i+1)+" in Rose batch = ");
			arr[i]=new String[scan.nextInt()][];	
			
		}
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print("enter the number of teachers = ");
				arr[i][j] =  new String[scan.nextInt()];
			}
		
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("A "+(i+1)+" batch ");
			System.out.println(" I have "+arr[i].length+" friends");
			for(int j=0;j<arr[i].length;j++)
			{
				for(int k=0;k<arr[i][j].length;k++)
				{
					System.out.println("enter the "+(j+1)+" best friends name = ");
					arr[i][j][k]= scan.next();
				}
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Batch A "+(i+1));
			System.out.println(" I have "+arr[i].length+" friends in A "+(i+1)+" batch ");
			for(int j=0;j<arr[i].length;j++)
			{
				for(int k=0;k<arr[i][j].length;k++)
				{
					System.out.println(+(j+1)+" best friends name = "+arr[i][j][k]);
				}
			}
		}
		scan.close();

	}

}
