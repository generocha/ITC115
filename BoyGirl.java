import java.io.FileNotFoundException;
import java.io.*;    // for File
import java.util.*;  // for Scanner

public class BoyGirl {
	//**************************************
	//
	// The Method boyGirl accepts a Scanner reads an input from a file that contains
	// a series of names followed by and integer.
	// The name alternate between boys and girls. The total of boys and girls will be printed and
	// the difference of the sum of boys and girls will also be printed.
	// By:  Gene Rocha 
	// Date: 02/16/2020
	//
	//**************************************

	public static void main(String[] args) throws FileNotFoundException {
		Scanner input = new Scanner(new File("boysgirls.txt"));
		boyGirl(input);

	}
	public static void boyGirl(Scanner input){
		// add local variables to keep track of the boys and girls
		int boys = 0;
		int boysCount = 0;
		int girls = 0;
		int girlsCount = 0;
		int rowCount = 1;// need to start the row at one
		int diff = 0;
		
		while(input.hasNext()) {
			String name = input.next();
			while(input.hasNextInt()) {
				if(rowCount % 2 == 0) {// if the row is even its a girl
					girlsCount++;// increment the girls count
					girls += input.nextInt();// add the integer after name to the girls sum
					
				}else {// if the row is odd its a boy
					boysCount++;// increment the boys count
					boys += input.nextInt();// add the integer after name to the boys sum
				}
				
			}
			rowCount++;// increment the row count
		}
		diff = girls - boys;// get the total difference by subtracting girls from boys
		System.out.println(boysCount + " boys, " + girlsCount + " girls");// print the girls and boys count
		System.out.println("Difference between boys and girls sums: " + diff);// print the absolute difference
	}

}
