package com.interview.dataStructure;

import java.util.Scanner;

public class MergeSortProgram {
	
	public void mergeSort(int[] a)
	{
		int[] l = new int[a.length];
		int[] r = new int[a.length];
		int temp=0;
		int temp1=0;
 		int mid=0;
		mid = (a.length)/2;
		System.out.println("middle :"+mid);
		for(int i=0;i<a.length;i++){
			
			if(i<mid){
				
				l[i]=a[i];
				
			}else
			{
				r[i]=a[i];
				
			}
			System.out.print(a[i]+" ");
			
		}
		
		System.out.println();
		System.out.println("start here");
		for(int k=0;k<l.length;k++)
		{
			System.out.print(l[k]+" ");
		}
		System.out.println();
		System.out.println("end here");
		System.out.println("start here");
		for(int k=0;k<l.length;k++)
		{
			System.out.print(r[k]+" ");
		}
		System.out.println();
		System.out.println("end here");
		
	}

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("enter the size of the array");
		int size = scn.nextInt();
		int[] a = new int[size];
		System.out.println("enter array value:");
		for(int i=0;i<size;i++){
			a[i]=scn.nextInt();
		}
		MergeSortProgram sort = new MergeSortProgram();
		sort.mergeSort(a);
		

	}

}
