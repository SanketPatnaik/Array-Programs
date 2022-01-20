package com.in28minutes.JspidersQuestion;

public class ArrayPracticeRunner {

	public static void main(String[] args) {
		ArrayPractice array = new ArrayPractice();
		System.out.println("The sum of all the values is " + array.sumOfElements(88, 98, 82, 78, 64));

		System.out.println("The minimum value in the array is " + array.findMinValue(88, 64, 82, 78, 98));

		System.out.println("The maximum value in the array is " + array.findMaxValue(88, 64, 82, 78, 98));

		System.out.println("The 2nd minimum value in the array is " + array.find2ndMinimumValue(88, 64, 82, 78, 98));

		System.out.println("The 2nd maximum value in the array is " + array.find2ndMaximumValue(88, 64, 82, 78, 98));

		System.out.println("The average value in the array is " + array.findAverageValue(88, 98, 82, 78, 64));

		System.out.println(
				"The sum of all the even indexed digits is " + array.findSumOfEvenIndexedElements(88, 98, 82, 78, 64));

		System.out.println(
				"The sum of all the odd indexed digits is " + array.findSumOfOddIndexedElements(88, 98, 82, 78, 64));

		System.out.println(
				"The max of all the odd indexed digits is " + array.findMaxOfOddIndexedElements(88, 64, 82, 78, 98));

		System.out.println(
				"The min of all the even indexed digits is " + array.findMinOfEvenIndexedElements(88, 64, 82, 78, 98));

		System.out.println("The average of all the odd indexed digits is "
				+ array.findAverageOfOddIndexedElements(88, 64, 82, 78, 98));

		System.out.println("The average of all the even indexed digits is "
				+ array.findAverageOfEvenIndexedElements(88, 64, 82, 78, 98));

		System.out
				.println("The sum of all the elements in the first half is " + array.sumOfFirstHalf(1, 2, 3, 4, 5));

		System.out.println(
				"The sum of all the elements in the second half is " + array.sumOfSecondHalf(1, 2, 3, 4, 5));

		System.out
				.println("The min of all the elements in the first half is " + array.findMinOfFirstHalf(1, 2, 3, 4, 5));

		System.out.println(
				"The min of all the elements in the second half is " + array.findMinOfSecondHalf(1, 2, 3, 4, 5));

		System.out
				.println("The max of all the elements in the first half is " + array.findMaxOfFirstHalf(1, 2, 3, 4, 5));

		System.out.println(
				"The max of all the elements in the second half is " + array.findMaxOfSecondHalf(1, 2, 3, 4, 5));

		System.out.println(
				"The average of all the elements in the first half is " + array.findAverageOfFirstHalf(1, 2, 3, 4, 5));

		System.out.println("The average of all the elements in the second half is "
				+ array.findAverageOfSecondHalf(1, 2, 3, 4, 5));

		array.reverseTheOrder(1, 2, 3, 4, 5, 6);

		array.reverseTheFirstHalfOrder(1, 2, 3, 4, 5, 6);

		array.reverseTheSecondHalfOrder(1, 2, 3, 4, 5, 6);

		array.readEvenIndexedElements(1, 2, 3, 4, 5, 6);

		array.readEvenIndexedElementsInReverseOrder(1, 2, 3, 4, 5, 6);

		array.readOddIndexedElements(1, 2, 3, 4, 5, 6);

		array.readOddIndexedElementsInReverseOrder(1, 2, 3, 4, 5, 6);

		System.out.println("The index of element given is " + array.findIndexOfElement(98, 88, 64, 82, 78, 98));

		array.swapTwoElements(2, 4, 1, 2, 3, 4, 5, 6);

		// array.reverseTheElements(1, 2, 3, 4, 5, 6);

		// array.reverseTheFirstHalfElements(1, 2, 3, 4, 5, 6);

		// array.reverseTheSecondHalfElements(1, 2, 3, 4, 5, 6);

		// array.reverseEvenIndexedElements(0, 1, 2, 3, 4, 5, 6, 7, 8);

	}

}
