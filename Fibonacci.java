// This class will use a for loop to compute and print out the first 12 Fibonacci numbers.

public class Fibonacci {

	public static void main(String[] args) {
		System.out.println("The first 12 Fibonacci numbers are");
		int k1 = 1;
		int k2 = 1;
		for(int i = 0; i < 12; i++) {
			System.out.print(k1 + " ");// print the current Fibonacci number
			int preK1 = k1;// add a variable to save the current Fibonacci number
			k1 = k2;// update the variable k1 to the next Fibonacci number
			k2 = preK1 + k1;//update the k2 variable
		}

	}

}
