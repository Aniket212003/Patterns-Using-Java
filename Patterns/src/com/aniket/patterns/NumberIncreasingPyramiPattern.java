package com.aniket.patterns;

public class NumberIncreasingPyramiPattern 
{
	public static void printPattern(Integer n)
	{
		int i, j;
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) 
	{
		Integer n = 6;
		printPattern(n);
	}

}