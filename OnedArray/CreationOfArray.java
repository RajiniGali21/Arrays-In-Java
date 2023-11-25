package com.kn.OnedArray;

public class CreationOfArray 
{
public static void main(String[] args) 
{
// Array declaration
	int[] arr;
//	Array Creation
	arr = new int[4];
//	Array Traversing
	arr[0]=10;
	arr[1]=20;
	arr[2]=30;
	arr[3]=40;
//	Array Traversing
	for(int i=0;i<=arr.length-1;i++)
	{
		System.out.println(arr[i]+" ");
	}
}
}
