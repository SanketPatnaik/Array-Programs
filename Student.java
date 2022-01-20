package com.in28minutes.Arrays;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;

public class Student {

	private String name;
	private int[] marks;

	public Student(String name, int... marks) {
		this.name = name;
		this.marks = marks;
	}

	public void getNumberOfSubjects() {
		System.out.println("The Name of the student is " + name);
		System.out.println("The Number of the Subjects is " + marks.length);
	}

	public int getTotalSumOfMarks() {
		int sum = 0;
		for (int mark : marks) {
			sum = sum + mark;
		}
		System.out.println("The sum of all the marks is " + sum);
		return sum;
	}


	public void getMaximumMark() {
		Arrays.sort(marks);
		int maxMark = 0;
		for (int mark : marks) {
			maxMark = mark;
		}
		System.out.println("The Maximum mark of the Student is " + maxMark);
	}

	public void getMinimumMark() {
		Arrays.sort(marks);
		for (int mark : marks) {
			System.out.println("The Minimum mark of the Student is " + mark);
			break;
		}
	}

	public BigDecimal getAverageMark() {
		int sum = getTotalSumOfMarks();
		System.out.println(
				"The Average mark is " + new BigDecimal(sum).divide(new BigDecimal(marks.length), 3, RoundingMode.UP));
		return new BigDecimal(sum).divide(new BigDecimal(marks.length), 3, RoundingMode.UP);
	}
}
