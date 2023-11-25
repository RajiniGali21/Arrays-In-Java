package com.kn.Array;

import java.util.Scanner;

public class ElementFoundOrNot {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
//		Array declaration and creation
//		System.out.println("enter the size of an array = ");
//		int[] arr = {10,40,52,64,87};
//		System.out.println("enter element");
//		int element = scan.nextInt();
//		System.out.println("enter the position to be entered in between 0 to "+arr.length);
//		int position = scan.nextInt();
////		arr[position] = element;
//		if(position <arr.length)
//		{
//			System.out.println("element present in position "+position+" is ="+arr[position]);
//			
//		}
//		else
//		{
//			System.out.println("element position is not found");
//		}
//		scan.close();
//		
//		}
//	}
		int[] arr = {10,40,52,64,87};
		System.out.println("enter element");
		int element = scan.nextInt();
		
		int position = elementFoundOrNot(arr,element);
		if(position>0)
		{
			System.out.println(element+" element found in position ="+position);
		}
		else
		{
			System.out.println(element+" element is not found in an array ");
		}
		scan.close();
	}

	public static int elementFoundOrNot(int[] arr, int element)
	{
		boolean isFound = false;
		int position = -1;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==element)
			{
			isFound = true;
			position = ++i;
			break;
			}
		}
		if(isFound)
		{
		return position;
		}
		else
		
		return -1;	
		
	}
}
		
	
	
		
		
		
		
		
		
		
		
		
