// This program writes a method called printPowersOfN that accepts the base and exponent as arguments
// and prints the power of the base^0 up to the max power inclusive.
public class printPowersOfN {

	public static void main(String[] args) {
		// test the printPowersOfN method and pass arguments
		printPowersOfN(2,7);// if the test passes the result on the console 1 2 4 8 16 32 64 128 
		printPowersOfN(5,3);// if the test passes the result on the console 1 5 25 125 
		printPowersOfN(3,3);// if the test passes the result on the console 1 3 9 27

	}
	public static void printPowersOfN(int base,int exponent) {
		int power =1;// initialize a local variable to keep the original base number and set value to 1.
		for(int i =0; i <= exponent; i++) {// loop through until i is greater than or equal to the exponent
			System.out.print(power + " ");// print the power
			power = power * base;// multiply the power by the base 
		}
		System.out.println(" ");// end the line output
	}
	

}
