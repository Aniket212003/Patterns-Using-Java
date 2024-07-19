package com.aniket.patterns;

public class ReverseHollowTrianglePattern 
{
	public static void printPattern(Integer n)
	{
		int i, j, k;
		for(i=n;i>=1;i--)
		{
			for(j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			for(k=1;k<=2*i-1;k++)
			{
				if(k==1 || i == n || k == (2*i-1))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
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
