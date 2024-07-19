package com.aniket.patterns;

public class NumberTrianglePattern 
{
	public static void printPattern(Integer n)
	{
		int i,j;
		for(i = 0; i <= n; i++)
		{
			for(j = 0 ; j <= n - i; j++)
			{
				System.out.print(" ");
			}
			for(j = 0 ; j <= i; j++)
			{
				System.out.print(i +" ");
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
