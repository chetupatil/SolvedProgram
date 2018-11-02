package com.stirred.NumPattern;
//11111
//00000
//11111
//00000
//11111

public class Pattern1 {

	public static void main(String[] args) 
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1; j<=5;j++)
			{
				if(i%2==1)
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
