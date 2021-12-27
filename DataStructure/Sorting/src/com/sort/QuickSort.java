package com.sort;

public class QuickSort 
{
	/**
	 * 
	 * @param An Integer array 
	 * @apiNote worst case complexity O(n^2)
	 * average case and best case complexity is (nlogn)
	 */
	public static void sort(int a[]) {
		new QuickSort().quickSort(0,a.length-1,a);
	}
	
	public int partition(int l,int h,int arr[])
	{
		int pivot = arr[l];
		int i=l;
		int j=h;
		while(i<j)
		{
			while(arr[i] <= pivot)i++;
			while(arr[j] > pivot)j--;
			if(i<j)
			{
				System.out.println("swap");
				swap(i,j,arr);
			}
		}
		System.out.println("itration complete");
		swap(l,j,arr);
		return j;
	}
	private void swap(int i, int j,int arr[])
	{
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	public void quickSort(int l,int h,int arr[])
	{
		if(l<h)
		{
			int part = partition(l,h,arr);
			quickSort(l,part-1,arr);
			quickSort(part+1,h,arr);
		}
	}

}
