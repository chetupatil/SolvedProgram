package com.stirred.NumPattern;
//11111
//11111
//11011
//11111
//11111
public class Pattern4 {

	public static void main(String[] args)
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1; j<=5;j++)
			{
				int a =(5+1)/2;
				if(i==a&&j==a)
				{
					System.out.print(0);
				}
				else
				{
				System.out.print(1);
				}
			}
			System.out.println();
		}
		
	}

}
