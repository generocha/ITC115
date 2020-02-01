public class repl {
	//**************************************
	//
	// The Method repl takes in a string and a number of repetitions as parameters
	// and returns the string concatenated that many times. 
	// By:  Gene Rocha 
	// Date: 02/01/2020
	//
	//**************************************

	public static void main(String[] args) {
		repl("hello",3);// This test should return hellohellohello

	}
	public static String repl(String str, int rep) {
		String word  = ""; // initialize a local variable and set the value to a empty string
		if(rep > 0) {// check if rep is greater than 0
			for(int i = 0; i < rep; i++) {// loop through if i is less than rep
				word += str;// concatenate the str to the variable word 
			}
		}System.out.print(word);// print the variable word
		return word;// return a string
	}

}
