//Lab 3 CS210

package CS210;

import java.util.Scanner;

public class TestnthPrimes {
	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Nth prime number");
		int nthPrime = sc.nextInt();
		
		int primeNum = 0;
		
		if(nthPrime >= 1 && nthPrime <=1000) {
			primeNum = primeNum(nthPrime);
			int nextPrime = primeNum; 
			System.out.println("The " + nthPrime + "th prime number is: " + primeNum);
		}
		else {
			System.out.println("Please pick another number between 1 and 1000");
	}

	int nthPrime2 = primeNum;
	int primeNum2 = 0;
		
		if(nthPrime >= 1 && nthPrime <=1000) {
			primeNum2 = primeNum(nthPrime2);
			int nextPrime = primeNum; 
			System.out.println("The " + nthPrime2 + "th prime number is: " + primeNum2);
		}
		else {
			System.out.println("Please pick another number between 1 and 1000");
		}
}
	
	public static int primeNum(int nthPrime) {
		
		int count = 0; 
		int primeNum = 2;
		
		while(true) {
			if(check(primeNum)) {
				count++;
				if(count == nthPrime) {
					return primeNum;
				}
			}
			primeNum++;
		}
	}
	
	public static boolean check(int num) {
		
		if(num <= 1) {
			return false;
		}
		
		for(int i = 2; i < num; i++) {
			if(num%i == 0) {
				return false;
			}
		}
		return true;
	}
}