
public class LibraryItemClient {

	public static void main(String[] args) {
		
		Book b1 = new Book(354, "Bread","yes","no", 2);
		Magazine m1 = new Magazine(2988, "Craft Beer Brewing","yes","no", 30);
		DVD d1 = new DVD(23, "Cloverfield","no","yes", 0);
		CD c1 = new CD(42, "American Standard ","yes","no", 39);
		System.out.println(b1);
		System.out.println(m1);
		System.out.println(d1);
		System.out.println(c1);

	}

}
