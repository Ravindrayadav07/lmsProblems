package com.lms;

public class ArrayIndexOutofBound {
	 public static void main(String[] args) {
	        // Create an array with 10 elements
	        int[] arr = {1,2,3,4,5,6,7,8,9,10};
	        
	        
	        try {
	            for (int i = 0; i <= arr.length; i++) {
	            	
	                System.out.println("Element at index " + i + ": " + arr[i]);
	            }
	        } catch (ArrayIndexOutOfBoundsException e) {
	            System.out.println("ArrayIndexOutOfBoundsException caught: Attempted to access index " + e.getMessage());
	            e.printStackTrace();
	        }
	    }
}
