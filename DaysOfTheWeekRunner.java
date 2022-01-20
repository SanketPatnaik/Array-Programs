package com.in28minutes.Arrays;

public class DaysOfTheWeekRunner {

	public static void main(String[] args) {
		String [] days = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};

		String biggestDay = "";
			      for (String day : days){
			if (biggestDay.length() <= day.length()) {
			          biggestDay = day;
			          }
	}
			      System.out.println("The day with the most letters is " + biggestDay);

					for (int i = days.length - 1; i >= 0; i--) {
						System.out.println(days[i]);

}
}
}
