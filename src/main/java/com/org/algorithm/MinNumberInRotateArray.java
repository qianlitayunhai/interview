package com.org.algorithm;


public class MinNumberInRotateArray {
	
	 public static int minNumberInRotateArray(int [] array) {
	    	if(array.length==0||(array==null))
	            return 0;
	        if(array.length==1)
	            return array[0];
	        for(int i=1;i<array.length;i++)
	            if(array[i]<array[i-1])
	                return array[i];
			return array[0];
	    }
	
	public static void main(String[] args) {
		int[] array=new int[5];
		array[0]=3;
		array[1]=4;
		array[2]=5;
		array[3]=1;
		array[4]=2;
		System.out.println(minNumberInRotateArray(array));
		
	}

}
