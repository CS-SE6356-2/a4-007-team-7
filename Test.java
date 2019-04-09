
public class Test {
	public static void main(String[] args) {

		//System.out.println("Hello World");
		ShoppingCart sc = new ShoppingCart();
		System.out.println(sc.getItemCount());

		Product p = new Product("Shampoo", 6.99);
		Product p1 = new Product("Soap", 7.99);
		Product p2 = new Product("Toothpaste", 7.99);
		Product p3 = new Product("Brush", 1.99);
		sc.addItem(p);
		System.out.println(sc.getItemCount());
		System.out.println(sc.getBalance());
		sc.addItem(p1);
		System.out.println(sc.getItemCount());
		System.out.println(sc.getBalance());
		sc.addItem(p2);
		System.out.println(sc.getBalance());
		System.out.println(sc.getItemCount());
		try {
			//sc.removeItem(p2);
			//sc.removeItem(p3);
		}
		catch(Exception ex) {
			
		}
		
		System.out.println(sc.getBalance());
		System.out.println(sc.getItemCount());

		
	}

}
