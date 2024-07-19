package com.aniket.patterns;

public class HollowDiamondPyramid 
{

	public static void main(String[] args) 
	{
		Integer n = 6;
		printPattern(n);

	}

	private static void printPattern(Integer n) 
	{
		int i, j, k;
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			for(k=1;k<=2*i-1;k++)
			{
				if(k==1 || k == (2*i-1))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		for(i=n-1;i>=1;i--)
		{
			for(j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			for(k=1;k<=2*i-1;k++)
			{
				if(k==1 || k == (2*i-1))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

}
