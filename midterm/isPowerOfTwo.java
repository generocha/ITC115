//ITC 115 - SEATTLE CENTRAL COLLEGE
//INSTRUCTOR - AVA MEREDITH
//STUDENT 1: ALESSANDRA LIMA
//STUDENT 2: GENE ROCHA
//MidTerm exam
//--------------------------------------------------------------------------
//isPowerOfTwo
//Write a static method isPowerOfTwo that takes an integer n as an argument,
//and that returns true if n is a power of two, and otherwise false.
//If n is zero or negative, return false. Note that isPowerOfTwo(1)
//should return true, since 2^0 = 1.
// --------------------------------------------------------------------------

public class Midterm {

	public static void main(String[] args) {
	
		System.out.println(isPowerOfTwo(1));
		System.out.println(isPowerOfTwo(0));
		
	}

	public static boolean isPowerOfTwo(int n) {
		if (n <= 0) {
			return false;
		}
		int cur = (int)Math.pow(2, 0);
		int i = 0;
		while (cur < n) {
			cur = (int)Math.pow(2, i);
			i++;
		}
		return cur == n;
	}
	
}
