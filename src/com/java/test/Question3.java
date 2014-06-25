package com.java.test;

public class Question3 {

	public void getPercentile(int[] arr){
		int count=arr.length;
		for(int i=0; i < count; i++){
			int smallerNumCount=0;
			for(int j=0; j < count; j++){
				if(i!=j && arr[j] <=arr[i]){
					smallerNumCount++;
				}
			}
			
			System.out.println(""+ ((double)smallerNumCount/count)*100 +"% of the numbers are less than or equal to "+arr[i]);
		}
	}
}
