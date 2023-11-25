package com.kn.SelectionSort;

public class SelectionSortDemo {

	public static void main(String[] args) 
	{
//		Array Declaration and Creation
		int[] arr = {48,32,16,29,72,44,63};
//		/Array initialization
		System.out.print("elements are : ");
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
//		Object is created
		Selectionsorting Selectionsorting2 = new Selectionsorting();
		int[] brr = Selectionsorting2.SelectionSort(arr);
		System.out.println();
		System.out.print("After sorting elements are : ");
		for(int i:brr)
		{
			System.out.print(i+" ");
		}

	}

}
