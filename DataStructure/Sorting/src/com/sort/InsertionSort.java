package com.sort;

public class InsertionSort 
{
	public static void sort(int ar[])
	{
		for(int i=1;i<ar.length;i++)
		{
			int e = ar[i];
			int in=i;;
			for(int j=i-1;j>=0;j--)
			{
				if(ar[j] > e)
				{
					ar[in] = ar[j];
					in = j;
					
				}
			}
			ar[in] = e;
		}
	}

}
