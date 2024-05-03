package com.core;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stud

		        String original = "DIVYA";
		        String reversed = reverseString(original);
		        System.out.println("Original string: " + original);
		        System.out.println("Reversed string: " + reversed);
		    }

		    public static String reverseString(String str) {
		        int length = str.length();
		        String reversed = "";
		        for (int i = length - 1; i >= 0; i--) {
		            reversed += str.charAt(i);
		        }
		        return reversed;
		    }
		
	}

		
		      