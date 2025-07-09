package com.Assignment;

public class ExceptionProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
            int arr[] = { 1, 2, 3, 4 };
            System.out.println(arr[9]); 
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught: " + e);
        }

        
        try {
            int arr[] = null;
            System.out.println(arr.length); 
        } catch (NullPointerException e) {
            System.out.println("Exception caught: " + e);
        }
    }


	}

