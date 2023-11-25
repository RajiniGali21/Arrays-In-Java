package com.kn.BubbleSort;

public class BubbleSortArray {

	public static void main(String[] args) 
	{
		int[] arr = {15,16,6,8,7};
		System.out.println("Before Swapping ====");
		for(int i:arr)
		{
			System.out.println(i+" ");
		}
		System.out.println("After Swapping = ");
		for(int i=0;i<arr.length;i++)
		{
			int count=0;
			for(int j=0;j<arr.length-1-i;j++)
			{
				int temp=0;
				if(arr[j]>arr[j+1])
				{
					temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					count=1;
				}
			}
				if(count==0)
					break;
			}
		for(int i:arr)
		{
		System.out.println(i+" ");
		}
	}
}
		
		

	    
		
	
	

		
	
