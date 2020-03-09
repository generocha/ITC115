import java.text.NumberFormat;

public class Product {
	//**************************************
	//
	// The Class: Product
	// product code, description, price and product count
	//
	// By:  Gene Rocha 
	// Date: 03/09/2020
	//
	//**************************************

		//fields
		int productCode;
		String productDescription;
		double productPrice;
		int productCount;
		
		// constructor
		Product(int pc, String pd, double pg, int pcount){
			productCode = pc;
			productDescription = pd;
			productPrice = pg;
			productCount = pcount;
		}
		
		public String toString() {
			return "Product Code: " + productCode + "\n" + "Product Description: " + productDescription + "\n"
					+ "Product Price: " + getPriceFormatted() + "\n" + "Product Count: " + productCount;
			
		} 
	 public String getPriceFormatted() 
	    {
	        String formattedPrice = NumberFormat.getCurrencyInstance().format(this.productPrice);
	        return formattedPrice;
	    }
	// getters
	public int getProductCode() {
		return productCode;
	}
	public String getProductDescription() {
		return productDescription;
	}
	public double getProductPrice() {
		return productPrice;
	}
	public int getProductCount() {
		return productCount;
	}

	// setters
	public void setProductCode(int productCode) {
		this.productCode = productCode;
	}
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	public void setProductCount(int productCount) {
		this.productCount = productCount;
	}
	 
}
