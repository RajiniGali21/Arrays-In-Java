package com.kn.Array;

public class ArrayMerging {

	public static void main(String[] args) 
	{
//		int[] arr = {10,20,30,40,50};
//		int[] brr = {11,12,13,14,15};
//		int[] crr = arrayMerging(arr,brr);
//		for(int i:crr)
//		{
//		System.out.print(i+" ");
//		}
//	}
//public static int[] arrayMerging(int[] arr, int[] brr) {
//		// TODO Auto-generated method stub
//		System.out.print("ELements are = ");
//		int[] crr = new int[arr.length+brr.length];
//		int a=0;
//		int b=brr.length-1;
//		for(int i=0;i<crr.length;i++)
//		{
//			if(i%2==0)
//			{
//				crr[i]=arr[a];
//				a++;
//			}
//			else
//		    {
//			crr[i]=brr[b];
//			b--;
//			}
//		}
//		return crr;
//	}
//	
//}
//		**************************************
//		**************************************
		int[] arr = {10,20,30,40,50};
		int[] brr = {11,12,13,14,15};
		int[] crr = arrayMerging2(arr,brr);
		for(int i:crr)
		{
		System.out.print(i+" ");
		}
	}

	public static int[] arrayMerging2(int[] arr, int[] brr) {
		// TODO Auto-generated method stub
		int[] crr = new int[arr.length+brr.length];
		int a =arr.length-1;
		int b=0;
		for(int i=0;i<crr.length;i++)
		{
			if(i%2==0)
			{
			crr[i]=arr[a];
			a--;
			}
			else
			{
				crr[i]=brr[b];
				b++;
			}
		}
		
		return crr;
	}	
}