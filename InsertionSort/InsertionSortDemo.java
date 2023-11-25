package com.kn.InsertionSort;

public class InsertionSortDemo {

	public static void main(String[] args) 
	{
		int[] arr = {5,4,10,1,6,2};
		System.out.println("elements are = ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+" ");
		}
		InsertionSort insertionSorting = new InsertionSort();
		int[] brr = insertionSorting.insertionSorting(arr);
		for(int i:brr)
		{
			System.out.println(i+" ");
		}
	}
}
