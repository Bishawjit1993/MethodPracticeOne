package practice;

import java.util.Arrays;

public class MehtodOne {
	public static void main(String[] args) {
		System.out.println("first project");
		System.out.println("QUE-12:" + getPrettyResult(2, 3, '+'));
		System.out.println("QUE-EXTRA:" + getAverage(1, 2, 3));
		System.out.println("QUE-5: " + "hello\nBishawjit");
		System.out.println("QUE-extra1:-" + getSpaceCount("Aa kiu I swd skieo 236587 GH kiu sieo 2533"));
		System.out.println("QUE-extra2:-" + getLetterCount("Aa kiu I swd skieo 236587 GH kiu sieo 2533"));
		System.out.println("QUE-EXTRACOUNT:" + getNumberCount("Aa kiu I swd skieo 236587 GH kiu sieo 2533"));
		int[] numberArray = {5,4,6};
		System.out.println("QUE-40:" + Arrays.toString(getSortedArray(numberArray)));
		System.out.println("que-37:" + getReverseOrder("thisisa"));
	}
	/**
	 * que-37: write a method that take one string input and return same string in reverse order.
	 * parameter: String text
	 * returnType: String 
	 * servingBucket: variable
	 */
		public static String getReverseOrder(String text) {
			String reverseOrder = "";
			for (int i = text.length() - 1; i >= 0; i = i - 1) {
				reverseOrder = reverseOrder + text.charAt(i);
			}
			return reverseOrder;
		}
/**
 * que-40: write a method that take one numberArray input and return the sorted array.
 * parameter: int[] numberArray
 * returnType: int[]
 * servingBucket: Array	 
 */
	public static int[] getSortedArray(int[] numberArray) {
		int[] sortedArray = new int[numberArray.length];
		Arrays.sort(numberArray);
		sortedArray = numberArray;
		return sortedArray;
	}
/**
 *que-extra: Write a Java program to count the letters, spaces, numbers and other characters of an input string.
 * The string is :  Aa kiu I swd skieo 236587 GH kiu sieo 2533
 * parameter: String text
 * return:int
 * serving: variable
 */
	public static int getLetterCount(String text) {
		int count = 0;
		text = text.toLowerCase();
		String letter = "abcdefghijklmnopqrstuvwxyz";
		for (int i = 0; i < text.length(); i = i + 1) {
			String textOne = String.valueOf(text.charAt(i));
			if (letter.contains(textOne)) {
				count = count + 1;
			}
		}
		return count;
	}
/**
 * Write a Java program to count spaces, numbers and other characters of an input string.
 * The string is :  Aa kiu I swd skieo 236587 GH kiu sieo 2533
 * parameter: String text
 * return:int
 * serving: variable
 */
	public static int getSpaceCount(String text) {
		int count = 0;
		for (int i = 0; i < text.length(); i = i + 1) {
			if (Character.isSpace(text.charAt(i))) {
				count = count + 1;
			}
		}
		return count;
	}
/**
 * Write a Java program to count the numbers of an input string.
 *The string is :  Aa kiu I swd skieo 236587 GH kiu sieo 25.33
 * parameter: String text
 * return:int
 * serving: variable
 */
	public static int getNumberCount(String text) {
		int count = 0;
		for (int i = 0; i < text.length(); i = i + 1) {
			String value = String.valueOf(text.charAt(i));
			if (Character.isDigit(text.charAt(i))) {
				count = count + 1;
			}
		}
		return count;
	}

/**
 * que-5: write a method to print Hello on screen and your name in a separate line.
 */
/**
 * que-extra: write a method that take three number and return the average of those numbers.
 * parameter: int numOne, int numTwo, int numThree
 * returnType; int
 * servingBucket: variable
 */
	public static double getAverage(double numOne, double numTwo, double numThree) {
		double average = 0;
		average = (numOne + numTwo + numThree) / 3;
		return average;
	}
/**
 * que-extra-12: Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers. 
 * parameter: int numOne , int numTwo, char option
 * returnType: int
 * servingBucket: variable
 */
	public static String getPrettyResult(double numOne, double numTwo, char option) {
		String result = "";
		result = numOne + " " + option + " " + numTwo + " = " + getCalculateResult(numOne, numTwo, option);

		return result;
	}

	public static double getCalculateResult(double numOne, double numTwo, char option) {
		double result = 0;
		if (option == '+') {
			result = getAdd(numOne, numTwo);
		} else if (option == '-') {
			result = getSubraction(numOne, numTwo);
		} else if (option == '/') {
			result = getDivision(numOne, numTwo);
		} else if (option == '*') {
			result = getMultiply(numOne, numTwo);
		} else {
			result = getReminder(numOne, numTwo);
		}

		return result;
	}

	public static double getReminder(double numOne, double numTwo) {
		double result = 0;
		result = numOne % numTwo;
		return result;
	}

	public static double getAdd(double numOne, double numTwo) {
		double result = 0;
		result = numOne + numTwo;
		return result;
	}

	public static double getDivision(double numOne, double numTwo) {
		double result = 0;
		result = numOne + numTwo;
		return result;
	}

	public static double getSubraction(double numOne, double numTwo) {
		double result = 0;
		result = numOne + numTwo;
		return result;
	}

	public static double getMultiply(double numOne, double numTwo) {
		double result = 0;
		result = numOne + numTwo;
		return result;
	}
}
