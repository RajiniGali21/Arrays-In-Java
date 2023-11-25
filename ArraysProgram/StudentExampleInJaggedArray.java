package com.kn.ArraysProgram;

import java.util.Scanner;

public class StudentExampleInJaggedArray {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
//		Array declaration and creation
		System.out.println("enter the number of batches = ");
		String arr[][]=new String[scan.nextInt()][];
		 for(int i=0;i<arr.length;i++) {
			System.out.println("Enter no of friends in A"+(i+1)+" Batch");
			arr[i]=new String[scan.nextInt()];
		 }
			
		
//		arr[1]=new String[1];
//		arr[2]=new String[4];
//		arr[3]=new String[2];
//		Array Initiliazation
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("A"+(i+1)+ " batch ");
            System.out.println("I have "+arr[i].length+" best  friends ");
			for(int j=0;j<arr[i].length;j++)
			{
				
				System.out.println("enter the" +(j+1)+" best friend name  = ");
				arr[i][j] = scan.next();
			}
		}
		printTheNameOfFriends(arr);
		scan.close();
		
	}

	public static void printTheNameOfFriends(String[][] arr) 
//	Array Traversing
	{
	for(int i=0;i<arr.length;i++)
	{
		System.out.println("batch A"+(i+1));
		System.out.println("i have "+arr[i].length+ " best friends in A"+(i+1)+" batch");
		for(int j=0;j<arr[i].length;j++)
		{
			System.out.println(+(j+1)+"st best  friend  = "+arr[i][j] );
		}
	}
		
	

	}

}
