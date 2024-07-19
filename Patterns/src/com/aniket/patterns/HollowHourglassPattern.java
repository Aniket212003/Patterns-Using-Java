package com.aniket.patterns;

public class HollowHourglassPattern 
{
	public static void printPattern(Integer n)
	{
		int i, j;
		for(i=1;i<=n;i++)
		{
			for(j=1;j<i;j++)
			{
				System.out.print(" ");
			}
			for(j=i;j<=n;j++)
			{
				if(j==i || j == n || i == 1)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		for(i=n-1;i>=1;i--)
		{
			for(j=1;j<i;j++)
			{
				System.out.print(" ");
			}
			for(j=i;j<=n;j++)
			{
				if(j==i || j == n || i == 1)
					System.out.print("* ");
				else
					System.out.print("  ");
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
