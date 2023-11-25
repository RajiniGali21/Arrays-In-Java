package com.kn.BubbleSort;

public class BubbleSortDemo {

	public static void main(String[] args) 
	{
		int[] arr = {32,48,11,69,5,21};
//		Array initialization
		System.out.print("elements are = ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
//		Object Is Created
		BubbleSortTemp  bubbleSort = new BubbleSortTemp();
		int[] crr = bubbleSort.bubbleSort2(arr);
		System.out.println(" ");
		System.out.print("After sorting the elements are = ");
		for(int i:crr)
		{
			System.out.print(i+" ");
		}

	}
}




