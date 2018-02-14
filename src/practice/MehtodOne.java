package practice;

import java.util.ArrayList;
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
		int[] numberArray = { 5, 4, 6 };
		System.out.println("QUE-40:" + Arrays.toString(getSortedArray(numberArray)));
		System.out.println("que-37:" + getReverseOrder("thisisa"));
		ArrayList<Integer> numberList = new ArrayList<Integer>();
		numberList.add(2);
		numberList.add(3);
		numberList.add(5);
		numberList.add(7);
		System.out.println("QUE-38:" + Arrays.toString(getConvertedArray(numberList)));
		int[] numArray = {2,5,7,1};
		System.out.println("QUE-42:" +Arrays.toString(getBubbleSortedArray(numArray)));
		System.out.println("QUE-11:" + getNumberList(3));
		System.out.println("QUE-12:" + Arrays.toString(getNumberArray(4)));
		System.out.println("QUE-13:" + Arrays.toString(getNumArray(5)));
		int[] nummArray = { 1,4,2,5};
		System.out.println("QUE-15:" + getMaxNum(nummArray));
		System.out.println("QUE-19:" + getTrueFalse("thisisastring"));
		System.out.println("QUE-20:" + getAllIndex("thisis"));
	}
	/**
	 * que-20: write a method that take one string input and return the sum off all index.
	 * parameter: String text
	 * returnType: int
	 * servingBucket: variable
	 */
	public static int getAllIndex(String text) {
		int result = 0;
		for (int i = 0; i < text.length(); i++) {
			result = result + i;
		}
		return result;
	}
	/**
	 * que-19: write a method that take a string representation of number input and return the same value as an integer.
	 * parameter: String text
	 * returnType: boolean
	 * servingBucket: variable
	 */
	public static boolean getTrueFalse(String text) {
		boolean result = false;
		text = text.toLowerCase();
		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) == 'a') {
				result = true;
			}
		}
		return result;
	}

	/**
	 * que-15: write a method that take one number array input and return the max number.
	 * parameter: int[] numArray
	 * returnType: int
	 * servingBucket: variable
	 */
	public static int getMaxNum(int[] nummArray) {
		int maxNum = nummArray[0];
		for (int i = 0; i < nummArray.length; i++) {
			if (maxNum < nummArray[i]) {
				maxNum = nummArray[i];
			}
		}
		return maxNum;
	}
	/**
	 * QUE-13: write a method that take one number input and return an Array that contains 1 to that given number.
	 * parameter: int number
	 * returnType: int[]
	 * servingBucket: array
	 */
	public static int[] getNumArray(int number) {
		int[] numArray = new int[number];
		for (int i = 1; i <= number; i++) {
			numArray[i - 1] = i;
		}
		return numArray;
	}
	/**
	 * que-12: write a method that take one number input and return an array that contains 0 to that given number.
	 * parameter: int number
	 * returnType: int[]
	 * servingBucket: Array
	 */
	public static int[] getNumberArray(int number) {
		int[] numberArray = new int[number + 1];
		for (int i = 0; i <= number; i++) {
			numberArray[i] = i;
		}
		return numberArray;
	}
	/**
	 * QUE-11: write a method that take one number input and return a number list starting from 0 to that given number.
	 * parameter: int number
	 * returnType: ArrayList<Integer>
	 * servingBucket: list
	 */
	public static ArrayList<Integer> getNumberList(int number) {
		ArrayList<Integer> numberList = new ArrayList<Integer>();
		for (int i = 0; i <= number; i++) {
			numberList.add(i);
		}
		return numberList;
	}
	/**
	 * que-42: write a method that take one number array input and return the bubble sorted array.
	 * parameter: int[] numArray
	 * returnType: int[]
	 * servingBucket: variable
	 */
	public static int[] getBubbleSortedArray(int[] numArray) {
		int[] sortedArray = new int[numArray.length];
		for (int i = 0; i < numArray.length; i = i + 1) {
			for (int j = i + 1; j < numArray.length; j = j + 1) {
				if (numArray[i] > numArray[j]) {
					int num = numArray[i];
					numArray[i] = numArray[j];
					numArray[j] = num;
				}
			}
		}
		sortedArray = numArray;

		return sortedArray;
	}
	/**
	 * que-38: write a method that take one number list input then convert that to an Array and return that Array.
	 * parameter: ArrayList<Integer> number
	 * returnType: int[]
	 * servingBucket: Array
	 */
	public static int[] getConvertedArray(ArrayList<Integer> numberList) {
		int[] convertedArray = new int[numberList.size()];
		for (int i = 0; i < numberList.size(); i = i + 1) {
			convertedArray[i] = numberList.get(i);
		}

		return convertedArray;
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
