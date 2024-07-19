package com.aniket.patterns;

public class LeftHalfPyramidPattern 
{
	public static void printPattern(Integer n)
	{
		int i, j;
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			for(j=1;j<=i;j++)
			{
				System.out.print("*");
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
