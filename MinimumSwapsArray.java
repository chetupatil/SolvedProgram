package com.interview.p3;


import java.util.Scanner;



public class MinimumSwapsArray 
{
	public int minimumSwaps(int[] arr)
	{
	    int checkSort = checkArrayIsSorted(arr,arr.length);
		int index = 1;
		int i = 0;
		int swapCount = 0;
		if(checkSort==1)
		{
			while(index<arr.length){
			 i = findSmallestValueInArray(arr,index);
              for(int j=0;j<=i;j++){
            		  if(arr[j]>arr[i])
            		  {
            			  arr = swap(arr,j,i);
            			    swapCount++;
            		        break;
            		  }
            		 
              }          
			index++;
			}
			return swapCount;
			
		}	
		return checkSort;
	}
	public int checkArrayIsSorted(int[] arr,int length)
	{
			if(length==1 || length==0){
				return 0;
			}
			
			if(arr[length-1]<arr[length-2]){
				return 1;
			}
		return checkArrayIsSorted(arr,length-1) ;
	   }
    int[] swap(int[] arr,int leftIndex,int rightIndex)
      {  
    	  int temp = 0;
    	  temp = arr[leftIndex];
    	  arr[leftIndex]=arr[rightIndex];
    	  arr[rightIndex]=temp;
		 return arr;
    	  
      }
      int findSmallestValueInArray(int[] arr,int index)
      {
    	  int small = arr[index-1];
    	  int finalIndex = 0;
    	  for(int i=index;i<arr.length;i++)
    	  {
    		  if(small>arr[i]){
    			  small = arr[i];
    			  finalIndex = i;
    		  }
    	  }
		return finalIndex;
    	  
      }
	public static void main(String[] args)
	{
		MinimumSwapsArray msa = new MinimumSwapsArray();
		Scanner scn = new Scanner(System.in);
		System.out.println("Size of the Array");
		int size = scn.nextInt();
		System.out.println("Enter unordered Array of Integer");
		int[] arr = new int[size];
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = scn.nextInt();
		}
		int minNumberOfSortArr = msa.minimumSwaps(arr);
		System.out.println("Minimum number of swap to sort an Array: "+minNumberOfSortArr);
			
	}

}
