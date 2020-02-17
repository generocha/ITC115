public class CharsSorted {
	//**************************************
	//
	// The Method charsStorted takes in a string and checks if the characters in the string
	// appear to be in sorted alphabetical order 
	// By:  Gene Rocha 
	// Date: 02/17/2020
	//
	//**************************************

	public static void main(String[] args) {
		charsSorted("abcde");
		charsSorted("bins");
		charsSorted("beads");

	}
	public static boolean charsSorted(String str) {
		int length = str.length();// get the length of the string
		int current = 0;
		int next = 0;
		boolean pass = true;
		for(int i = 0; i < length -1; i++) {//loop through the char in the string but there needs to be two to check.
			// get the first char and the next one and check if the next char is greater than the one before
			current = str.charAt(i);
			next = str.charAt(i + 1);
			if(current > next) {// check if current char is less than next
				pass = false;
			}
		}
		return pass;
	}
}
