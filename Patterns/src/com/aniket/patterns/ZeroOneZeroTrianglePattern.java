package com.aniket.patterns;

public class ZeroOneZeroTrianglePattern 
{

	public static void main(String[] args) 
	{
		Integer n = 6;
		printPattern(n);

	}

	private static void printPattern(Integer n) 
	{
		int i, j;
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++)
			{
				if((i+j)%2==0)
				{
					System.out.print(1 + " ");
				}
				else
				{
					System.out.print(0 + " ");
				}
			}
			System.out.println();
		}
		
	}

}
