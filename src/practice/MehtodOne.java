package practice;

public class MehtodOne {
public static void main(String[] args) {
	System.out.println("first project");
	System.out.println("QUE-12:" + getPrettyResult(2,3,'+'));
	System.out.println("QUE-EXTRA:" + getAverage(1, 2, 3));
	System.out.println("QUE-5: " + "hello\nBishawjit");
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
