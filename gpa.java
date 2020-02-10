import java.util.Scanner;
public class GPA {
	//**************************************
	//
	// The Method printGPA accepts a Scanner for the console as a parameter and calculates a students 
	// grade point average.
	// By:  Gene Rocha 
	// Date: 02/10/2020
	//
	//**************************************
	public static void main(String[] args) {
		// Enter Maria 5 72 91 84 89 78
		// return "Maria's grade is 82.8"
		printGPA();

	}
	public static void printGPA() {
		Scanner console = new Scanner(System.in);
		System.out.println("Enter a student name ");
		System.out.println("How many scores would you like to enter? ");
		System.out.println("Enter the scores seprated by a space ");
		
		double sum = 0.0;// local double variable for the sum
		String student = console.next();// local string variable for the student's name
		int scores = console.nextInt();// the recored scores
		
		for(int i = 0; i < scores; i++) {// loop through the record and add to the sum
			sum += console.nextDouble();
		}
		System.out.println(student + "'s grade is " + sum/scores);// print the students name and calculate the GPA 
		console.close();
	}

}
