package com.kn.NonStaticMethodsExampleInAnArray;

public class PrintOddOrEven 
{

	

	public void countOfEvenOrOdd(int[] arr)
	{
		int evenCount =0;
		int oddCount =0;
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
		System.out.println("count of even numbers = "+evenCount);
		System.out.println("count of odd numbers = "+oddCount);
	}

	public void printOddOrEven1(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				System.out.println(arr[i]+"= even number");
			}
			else
			{
				System.out.println(arr[i]+"= odd number ");
			}
		}		
	}

}
