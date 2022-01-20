package com.in28minutes.JspidersQuestion;

import java.util.Arrays;

public class ArrayPractice {
	public ArrayPractice() {

	}
	public int sumOfElements(int... numbers) {
		int sum = 0;
		for (int number : numbers) {
			sum = sum + number;
		}
		return sum;
	}

	public int findMinValue(int... numbers) {
		int min = Integer.MAX_VALUE;
		for (int number : numbers) {
			if (number < min) {
				min = number;
			}
		}
		return min;
	}

	public int findMaxValue(int... numbers) {
		int max = Integer.MIN_VALUE;
		for (int number : numbers) {
			if (number > max) {
				max = number;
			}
		}
		return max;
	}
	public int find2ndMinimumValue(int...numbers) {
		Arrays.sort(numbers);
		int secondMin = numbers[1];
		return secondMin;
		}

		public int find2ndMaximumValue(int... numbers) {
			Arrays.sort(numbers);
			int secondMax = numbers[numbers.length - 2];
			return secondMax;
		}

		public int findAverageValue(int... numbers) {
			int sum = 0;
			for (int number : numbers) {
				sum = sum + number;
			}
			int average = sum / numbers.length;
			return average;
		}

		public int findSumOfEvenIndexedElements(int... numbers) {
			int sum = 0;
			for (int i = 0; i <= numbers.length - 1; i++) {
				if (i % 2 == 0) {
					sum = sum + numbers[i];
				}
			}
			return sum;
		}

		public int findSumOfOddIndexedElements(int... numbers) {
			int sum = 0;
			for (int i = 1; i <= numbers.length - 1; i++) {
				if (i % 2 == 1) {
					sum = sum + numbers[i];
				}
			}
			return sum;
		}

		public int findMaxOfOddIndexedElements(int... numbers) {
			int max = Integer.MIN_VALUE;
			for (int i = 1; i <= numbers.length - 1; i++) {
				if (i % 2 == 1) {
					if (max < numbers[i]) {
						max = numbers[i];
					}
				}
			}
			return max;
		}

		public int findMinOfEvenIndexedElements(int... numbers) {
			int min = Integer.MAX_VALUE;
			for (int i = 0; i <= numbers.length - 1; i++) {
				if (i % 2 == 0) {
					if (min > numbers[i]) {
						min = numbers[i];
					}
				}
			}
			return min;
		}

		public int findAverageOfOddIndexedElements(int... numbers) {
			int sum = 0;
			int count = 0;
			for (int i = 1; i <= numbers.length - 1; i++) {
				if (i % 2 == 1) {
					sum = sum + numbers[i];
					count++;
				}
			}
			return sum / count;
		}

		public int findAverageOfEvenIndexedElements(int... numbers) {
			int sum = 0;
			int count = 0;
			for (int i = 0; i <= numbers.length - 1; i++) {
				if (i % 2 == 0) {
					sum = sum + numbers[i];
					count++;
				}
			}
			return sum / count;
		}

		public int sumOfFirstHalf(int... numbers) {
			int sum = 0;
			for (int i = 0; i <= (numbers.length - 1) / 2; i++) {
				sum = sum + numbers[i];
			}
			return sum;
		}

		public int sumOfSecondHalf(int... numbers) {
			int sum = 0;
			for (int i = (numbers.length - 1) / 2; i <= (numbers.length - 1); i++) {
				sum = sum + numbers[i];
			}
			return sum;
		}

		public int findMinOfFirstHalf(int... numbers) {
			int min = Integer.MIN_VALUE;
			for (int i = 0; i <= (numbers.length - 1) / 2; i++) {
				if (min < numbers[i]) {
					min = numbers[i];
				}
			}
			return min;
		}

		public int findMinOfSecondHalf(int... numbers) {
			int min = Integer.MIN_VALUE;
			for (int i = (numbers.length - 1) / 2; i <= (numbers.length - 1); i++) {
				if (min < numbers[i]) {
					min = numbers[i];
				}
			}
			return min;
		}

		public int findMaxOfFirstHalf(int... numbers) {
			int max = Integer.MAX_VALUE;
			for (int i = 0; i <= (numbers.length - 1) / 2; i++) {
				if (max > numbers[i]) {
					max = numbers[i];
				}
			}
			return max;
		}

		public int findMaxOfSecondHalf(int... numbers) {
			int max = Integer.MAX_VALUE;
			for (int i = (numbers.length - 1) / 2; i <= (numbers.length - 1); i++) {
				if (max > numbers[i]) {
					max = numbers[i];
				}
			}
			return max;
		}

		public int findAverageOfFirstHalf(int... numbers) {
			int sum = 0;
			int count = 0;
			for (int i = 0; i <= (numbers.length - 1) / 2; i++) {
				sum = sum + numbers[i];
				count++;
			}
			return sum / count;
		}

		public int findAverageOfSecondHalf(int... numbers) {
			int sum = 0;
			int count = 0;
			for (int i = (numbers.length - 1) / 2; i <= (numbers.length - 1); i++) {
				sum = sum + numbers[i];
				count++;
			}
			return sum / count;
		}

		public void reverseTheOrder(int... numbers) {
			System.out.print("The array in reverse order is ");
			for (int i = numbers.length - 1; i >= 0; i--) {
				System.out.print(numbers[i] + " ");
			}
			System.out.println();
		}

		public void reverseTheFirstHalfOrder(int... numbers) {
			System.out.print("The first half of array in reverse order is ");
			for (int i = (numbers.length - 1) / 2; i >= 0; i--) {
				System.out.print(numbers[i] + " ");
			}
			System.out.println();
		}

		public void reverseTheSecondHalfOrder(int... numbers) {
			System.out.print("The second half of array in reverse order is ");
			for (int i = (numbers.length - 1); i >= (numbers.length) / 2; i--) {
				System.out.print(numbers[i] + " ");
			}
			System.out.println();
		}

		public void readEvenIndexedElements(int... numbers) {
			System.out.print("The even indexed elements are ");
			for (int i = 0; i <= numbers.length - 1; i = i + 2) {
				System.out.print(numbers[i] + " ");
			}
			System.out.println();
		}

		public void readEvenIndexedElementsInReverseOrder(int... numbers) {
			System.out.print("The even indexed elements in reverse order are ");
			for (int i = numbers.length - 1; i >= 0;) {
				if (i % 2 == 0) {
					System.out.print(numbers[i] + " ");
					i = i - 2;
				} else {
					i--;
				}
			}
			System.out.println();
		}

		public void readOddIndexedElements(int... numbers) {
			System.out.print("The odd indexed elements are ");
			for (int i = 1; i <= numbers.length - 1; i = i + 2) {
				System.out.print(numbers[i] + " ");
			}
			System.out.println();
		}

		public void readOddIndexedElementsInReverseOrder(int... numbers) {
			System.out.print("The odd indexed elements in reverse order are ");
			for (int i = numbers.length - 1; i >= 1;) {
				if (i % 2 == 1) {
					System.out.print(numbers[i] + " ");
					i = i - 2;
				} else {
					i--;
				}
			}
			System.out.println();
		}

		public int findIndexOfElement(int element, int... numbers) {
			int index = 0;
			for (int i = 0; i <= numbers.length - 1; i++) {
				if (element == numbers[i]) {
					index = i;
				}
			}
			return index;
		}

		public void swapTwoElements(int index1, int index2, int... numbers) {
			System.out.println("Before swapping the elements are " + numbers[index1] + " " + numbers[index2]);
			for (int i = 1; i <= numbers.length - 1; i++) {
				if (i == index2) {
					numbers[index1] = numbers[index1] * numbers[index2];
					numbers[index2] = numbers[index1] / numbers[index2];
					numbers[index1] = numbers[index1] / numbers[index2];
				}
			}
			System.out.println("Before swapping the elements are " + numbers[index1] + " " + numbers[index2]);
		}

		public void reverseTheElements(int... numbers) {
			int digits[] = numbers;
			for (int i = 0; i <= numbers.length - 1; i++) {
				if (i <= (numbers.length - 1) / 2) {
					numbers[i] = numbers[(numbers.length - 1) - i];
					System.out.print(numbers[i]);
				} else if (i > (numbers.length - 1) / 2) {
					digits[i] = digits[(digits.length - 1) - i];
					System.out.print(digits[i]);
				}
			}
			System.out.println();
		}

		public void reverseTheFirstHalfElements(int... numbers) {
			int digits[] = numbers;
			for (int i = (numbers.length - 1) / 2; i <= numbers.length - 1; i++) {
				numbers[i] = digits[(digits.length - 1) - i];
				System.out.print(numbers[i]);
			}
			System.out.println();
		}

		public void reverseTheSecondHalfElements(int... numbers) {
			int digits[] = numbers;
			for (int i = 0; i <= (numbers.length - 1) / 2; i++) {
				numbers[i] = digits[(digits.length - 1) - i];
				System.out.print(numbers[i]);
			}
			System.out.println();
		}

		public void reverseEvenIndexedElements(int... numbers) {
			int digits[] = numbers;
			if (numbers.length - 1 % 2 == 0) {
			for (int i = 0; i <= numbers.length - 1; i += 2) {
				numbers[i] = digits[(digits.length - 1) - i];
				System.out.print(numbers[i]);
			}
		} else {
			for (int i = 1; i <= numbers.length - 1; i += 2) {
				numbers[i] = digits[(digits.length - 1) - i];
				System.out.print(numbers[i]);
			}
		}
		}
}