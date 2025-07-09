package com.Assignment;

public class PrimeNumber {

	public static void main(String[] args) {
		// Find prime numbers between 1 to 100
        System.out.println("Prime numbers between 1 to 100 are:");
        
        for (int i = 2; i <= 100; i++) {
            if (isPrime(i)) {
                System.out.print(i + ", ");
            }
        }
    }
    
    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}