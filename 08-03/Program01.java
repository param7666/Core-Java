class Program01 {
	
	public static void cartClothes(String product, String companyName, String type, int quantity) {
		if (product.equals("Clothes") && (companyName.equals("Nike") || companyName.equals("Reebok"))) {
			double price = buyNowForClothes(type, quantity);
			bill(product, companyName, type, quantity, price);
		} else {
			System.err.println("Not Available");
		}
	}
	
	public static void mobileCart(String product, String companyName, int quantity) {
		if (product.equals("Phone") && (companyName.equals("Apple") || companyName.equals("Samsung"))) {
			double price = buyNowForMobile(companyName, quantity);
			bill(product, companyName, "", quantity, price);
		}
	}
	
	public static double buyNowForClothes(String type, int quantity) {
		double totalPrice = 0;
		if (type.equals("T-shirt")) {
			System.out.println("T-shirt Price of each: 500Rs.");
			System.out.println("10% discount on T-shirt");
			double price = 500;
			double discount = (price * quantity * 0.10);
			totalPrice = price * quantity - discount;
		} else if (type.equals("Shoes")) {
			System.out.println("Shoes Price of each: 1000Rs.");
			System.out.println("5% discount on Shoes");
			double price = 1000;
			double discount = (price * quantity * 0.05);
			totalPrice = price * quantity - discount;
		} else {
			System.err.println("Please check your selection");
		}
		return totalPrice;
	}
	
	public static double buyNowForMobile(String companyName, int quantity) {
		double totalPrice = 0;
		if (companyName.equals("Apple")) {
			System.out.println("Price of each Apple Phone: 40000Rs");
			System.out.println("20% discount on Apple Phones");
			double price = 40000;
			double discount = (price * quantity * 0.20);
			totalPrice = price * quantity - discount;
		} else if (companyName.equals("Samsung")) {
			System.out.println("Price of each Samsung Phone: 30000Rs");
			System.out.println("25% discount on Samsung Phones");
			double price = 30000;
			double discount = (price * quantity * 0.25);
			totalPrice = price * quantity - discount;
		}
		return totalPrice;
	}
	
	public static void bill(String product, String companyName, String type, int quantity, double price) {
		System.out.println("Product Name: " + product);
		System.out.println("Company Name: " + companyName);
		if (!type.equals("")) {
			System.out.println("Type: " + type);
		}
		System.out.println("Quantity: " + quantity);
		System.out.println("Price: " + price);
		System.out.println("=============================");
	}
	
	public static void main(String[] args) {
		System.out.println("Welcome to MINI Flipkart");
		System.out.println("Choose the Type of product that You want to buy");
		System.out.println("=============================");
		System.out.println("OPTION 1) CLOTHES");
		System.out.println("OPTION 2) MOBILE");
		
		int op = Integer.parseInt(args[0]);
		
		if (op == 1) {
			cartClothes("Clothes", "Nike", "T-shirt", 4);
		} else if (op == 2) {
			mobileCart("Phone", "Samsung", 2);
		} else {
			System.out.println("Product Not available!");	
		}
	}
}
