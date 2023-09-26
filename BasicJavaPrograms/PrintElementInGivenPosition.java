package com.kn.Arrays;


import java.util.Scanner;
public class PrintElementInGivenPosition {

	
	public static void main(String[] args)
		{
			Scanner scan = new Scanner(System.in);
			System.out.println("enter the length of an array = ");
			String[] arr = new String[scan.nextInt()];
			System.out.println("enter the string to be store in an array = ");
			String element = scan.next();
			System.out.println("enter the position to be stored in between 0 and  "+(arr.length-1));
			int position = scan.nextInt();
			arr[position]=element;
			System.out.println("element present at position "+position+" is = "+arr[position]);
			scan.close();
		}
	

//			printElementInaGivenPosition(arr);
//			scan.close();
//			
//			
//		}
	//
//		public static void printElementInaGivenPosition(String[] arr) 
//		{
//			Scanner scan =new Scanner(System.in);
//			System.out.println("enter the string = ");
//			String element  = scan.next();
//			System.out.println("enter the position in between 0 to "+(arr.length-1));
//			int position = scan.nextInt();
//			arr[position] = element;
//			System.out.println("element present in "+position+" is = "+arr[position]);
//			scan.close();
//		}
	//	
	//
	//}

}
