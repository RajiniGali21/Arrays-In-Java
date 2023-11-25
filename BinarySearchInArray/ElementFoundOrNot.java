package com.kn.BinarySearchInArray;

import java.util.Scanner;

public class ElementFoundOrNot {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
//		Array declaration and creation
		System.out.println("enter the size of an array = ");
		int[] arr = new int[scan.nextInt()];
//		Array initialization
		System.out.println("enter the elements = ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = scan.nextInt(); 
		}
		System.out.println("enter the element to found = ");
		int element = scan.nextInt();
		elementFoundOrNot(arr,element);
		
		scan.close();
	}
//Method to know the element is found or not in an array
	public static void elementFoundOrNot(int[] arr, int element) 
	{
//		Array Traversing
		int position = -1;
		int low=0;
		int high = arr.length-1;
		boolean isFound = false;
		while(low<=high)
		{
			int mid = (low+high)/2;
			
			if(element == arr[mid])
			{
				isFound = true;
				position = mid+1;
				break;
			}
			else if(element > arr[mid])
			{
				low = mid+1;
				high = high;
			}
			else
			{
				high = mid-1;
				low = low; 
			}
		}
		if(isFound == false)
		{
		System.out.println(element+" element is not found in any position");	
		}
		else
		{
			System.out.println(element+" element is found at position "+position);
		}
		
	}
}
