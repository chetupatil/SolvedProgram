package com.stirred.NumPattern;
//12345
//23456
//34567
//45678
//56789

public class Pattern9 {

	public static void main(String[] args) {
	int n=5;
	int count=0;
	for(int i=1; i<=n;i++)
	{
		for(int j=1; j<=n;j++)
		{
			System.out.print(j+count);
			
		}
		System.out.println();
		count++;
	}

	}

}
