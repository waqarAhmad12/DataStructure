package com.sort;

public class Selection 
{
	public void sort(int a[])
	{
		
		for(int last = a.length -1; last > 0 ; last-- )
		{
			int max=0;
			for(int i=0 ; i<=last ; i++)
			{
				if(a[max] < a[i])
					max = i;
			}
			swap(max,last,a);
			
		}
	}
	
	public void swap(int i, int j , int a[])
	{
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	
}
