package com.sort;

public class MergeSort {
	public static void sort(int arr[])
	{
		mergeSort(arr,0,arr.length);
	}
	public static void mergeSort(int arr[], int l,int r)
	{
		if(l<r)
		{
			int mid = l+r/2;
			mergeSort(arr,l,mid);
			mergeSort(arr,mid+1,r);
			merge(arr,l,mid,r);
		}
	}
	public static void merge(int arr[] , int l,int mid , int r)
	{
		int b[] = new int[r];
		int i=l;
		int j=mid+1;
		int k=l;
		while(i<=mid && j<= r)
		{
			if(arr[i] < arr[j])
			{
				b[k] = arr[i];
				j++;
				k++;
			}
			else
			{
				b[k] = arr[j];
				j++;
				k++;
			}
		}
		if(i > mid)
		{
			while(j<=r)
			{
				b[k] = arr[j];
				j++;
				k++;
			}
		}
		else
		{
			while(i<=mid)
			{
				b[k] = arr[i];
				i++;
				k++;
			}
		}
		for(int i1=0;i1<r;i1++)
		{
			arr[i1] = b[i1];
		}
		
	}
}
