package com.stirred.NumPattern;
//10001
//01010
//00100
//01010
//10001

public class Pattern7 
{

	public static void main(String[] args)
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1; j<=5;j++)
			{
				if(i==j||i+j==6)
				{
					System.out.print(1);
				}else
				{
					System.out.print(0);
				}
			}
			System.out.println();
		}



	}

}
