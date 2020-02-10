public class Season {
	//**************************************
	//
	// The Method season takes in two integers. The first is the month and the second integer as the day
	// and returns the season based on the month and day.
	// if the date falls between 
	// 12/16 and 3/15 return "winter"
	// 3/16 and 6/15 return "spring"
	// 6/16 and 9/15 return "summer"
	// 9/16 and 12/15 return "fall"
	// By:  Gene Rocha 
	// Date: 02/10/2020
	//
	//**************************************

	public static void main(String[] args) {
		//season(12,25); // returns winter
		//season(1,17); // returns winter
		//season(2,9); // returns winter
		//season(3,21); // returns spring
		//season(4,16); // returns spring
		//season(5,7); // returns spring
		//season(6,18); // returns summer
		//season(7,4); // returns summer
		//season(8,30); // returns summer
		//season(9,21); // returns fall
		//season(10,31); // returns fall
		//season(11,24); // returns fall
		//season(12,3); // returns fall

	}
	public static String season(int m, int d) {
		String s = "";
		if(m == 3) {// check if the month is March
			if(d > 15)// need to check what day it is
			s = "spring";
		}else if(m > 3 && m <= 5){// check if the month is April or May
			s = "spring";
		}else if(m == 6 && d < 16) {// check if the month is June and the date is less than 16
			s = "spring";
		}else if(m == 6 && d >= 16) {// check if the month is June and the date is greater or equal to 16
			s = "summer";
		}else if(m > 6 && m < 9) {// check if the month is July or August
			s = "summer";
		}else if(m == 9 && d < 15) {// check if the month is September and the date is less than 15
			s = "summer";
		}else if(m == 9 && d >= 15) {// check if the month is September and the date is greater or equal to 15
			s = "fall";
		}else if(m > 9 && m < 12) {// check if the month is October or November
			s = "fall";
		}else if(m == 12 && d < 15) {// check if the month is December and the date is less than 15
			s = "fall";
		}else {// all other dates will return "winter"
			s = "winter";
		}
		System.out.println(s);
		return s;
	}
}
