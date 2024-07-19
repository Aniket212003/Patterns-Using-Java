package com.aniket.patterns;

public class ReverseRightHalfPyramidPattern 
{
	public static void printPattern(Integer n)
	{
		int i, j;
		for(i=n;i>=1;i--)
		{
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
