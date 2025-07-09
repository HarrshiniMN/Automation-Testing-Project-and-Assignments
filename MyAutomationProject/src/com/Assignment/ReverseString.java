package com.Assignment;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = "Harrshini M N"; 
        System.out.println(name); 

        // Reverse without using reverse() function
        String reversedWithoutFunction = "";
        for (int i = name.length() - 1; i >= 0; i--) {
            reversedWithoutFunction += name.charAt(i);
        }
        System.out.println("Reversed without reverse() function: " + reversedWithoutFunction);

        // Reverse using StringBuffer's reverse() method
        StringBuffer stringBuffer = new StringBuffer(name);
        stringBuffer.reverse();
        System.out.println("Reversed with reverse() function: " + stringBuffer.toString());

        scanner.close();
    }
}
