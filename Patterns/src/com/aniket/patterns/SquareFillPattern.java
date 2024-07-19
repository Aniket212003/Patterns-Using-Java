package com.aniket.patterns;

public class SquareFillPattern 
{
	public static void printPattern(Integer n)
	{
		int i, j;
		for(i=0;i<=n;i++)
		{
			for(j=0;j<=n;j++)
			{
				System.out.print("* ");
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
