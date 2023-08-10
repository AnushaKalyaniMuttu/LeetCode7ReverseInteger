package com.demo;

public class ReverseIntegerDifferentWays {
		
	
	public static void main (String [] args) {
	int value=123;
	String reversedStr = new StringBuilder(value).reverse().toString();
   int  reverse=Integer.parseInt(reversedStr);
		System.out.println(reverse);
   
	
	}
	public int reverseNumber(int num) {
	    int reversed = 0;
	    while (num != 0) {
	        int digit = num % 10;
	        reversed = reversed * 10 + digit;
	        num /= 10;
	    }
	    return reversed;
	}

	public int reverseNumberUsingRecursion(int num) {
	    return reverseHelper(num, 0);
	}

	private int reverseHelper(int num, int reversed) {
	    if (num == 0) {
	        return reversed;
	    }
	    return reverseHelper(num / 10, reversed * 10 + num % 10);
	}

	
	}

