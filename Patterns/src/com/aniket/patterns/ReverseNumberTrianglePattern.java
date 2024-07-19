package com.aniket.patterns;

public class ReverseNumberTrianglePattern 
{
	public static void printPattern(Integer n)
	{
		int i, j;
		for(i=n;i>=1;i--)
		{
			for(j=0;j<=n-i;j++)
			{
				System.out.print(" ");
			}
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
