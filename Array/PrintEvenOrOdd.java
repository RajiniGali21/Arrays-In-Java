package com.kn.Array;

public class PrintEvenOrOdd 
{
	public void printEvenOrOdd(int[] arr) 
	{
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]%2==0)
		{
			
			System.out.println(arr[i]+ " is an even element in array element");
		}
		else
		{
			System.out.println(arr[i]+ " is an odd element in array element");
		}
	}
	}
public void countEvenOrOdd(int[] arr)
{
	int evenCount =0,oddCount=0;
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]%2==0)
		{
			evenCount++;
		}
		else
		{
			oddCount++;
		}
	}
	System.out.println("even number = "+evenCount);
	System.out.println("odd number = "+oddCount);
}
	


}