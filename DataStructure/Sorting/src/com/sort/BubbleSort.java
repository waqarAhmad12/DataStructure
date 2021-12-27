package com.sort;

public class BubbleSort
{
	public void sort(int a[]) 
	{
		for(int last = a.length-1; last>0;last --)
		{
			for(int i=0 ; i < last ; i++)
			{
				if(a[i]>a[i+1] )
				{
					swap( i  , i+1 , a);
				}				
			}
		}
	}
	
	public void swap(int i, int j , int a[])
	{
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

}
