package com.arrays;

import java.util.Arrays;

public class FindSingleNumber {

	public static void main(String[] args) {
		
		int a[] = {4,1,2,1,2};
		int a1 =singleNumber(a);
		System.out.println(a1);
		
	}
		    public static int singleNumber(int[] nums) {
		       /* Arrays.sort(nums);
		        for(int i=0 ; i<nums.length-1; i=i+2){
		            
		            if(nums[i]!=nums[i+1]) {
		                return nums[i];     
					}
		        }
		        return nums[nums.length - 1];  
		    }*/
		    	
		    	int res=nums[0];
		    	System.out.println("zerooo"+res);
		        for(int i=1;i<nums.length;i++){
		        	System.out.println(i+" "+res);
		        res=res^nums[i];
		        System.out.println("herooo"+res);
		        }
		        return res;
		        } 
	
	}


