package com.aniket.patterns;

public class NumberChangingPyramidPattern 
{
	public static void printPattern(Integer n)
	{
		int i, j;
		Integer num = 1;
		for(i = 1; i <= n ; i++)
		{
			for(j = 1; j <= i; j++)
			{
				System.out.print(num + " ");
				num++;
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
