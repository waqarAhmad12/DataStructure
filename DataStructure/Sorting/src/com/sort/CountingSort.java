package com.sort;

public class CountingSort {
	/**
	 * 
	 * @param arr An integer array where 
	 * range of integer 0 to 9 inclusive; 
	 * @apiNote Time Complexity for all the
	 * cases is (n+k) where K is the range of Integer
	 * @return Nothing
	 * 
	 */
public static void sort(int arr[])
{
	int index=0;
	int freq[] = new int[10];
	for(int i=0;i<arr.length;i++)
	{
		freq[arr[i]]++;
	}
	for(int i=0;i<freq.length;i++)
	{
		
		while(freq[i] != 0 )
		{
			arr[index] = i;
			index++;
			freq[i]--;
		}
	}
}
}
