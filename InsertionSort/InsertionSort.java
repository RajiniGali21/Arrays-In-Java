package com.kn.InsertionSort;

public class InsertionSort 
{
	public int[] insertionSorting(int[] arr) 
	{
		System.out.println("After sorting = ");
		for(int i=0;i<arr.length;i++)
		{
		int temp=arr[i];
		int j=i-1;
		while(j>=0 && arr[j]>temp)
		{
			arr[j+1]=arr[j];
			j--;
		}
		arr[j+1]=temp;
		}
		return arr;
	}

	
}
