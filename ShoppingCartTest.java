import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.jupiter.api.Test;

class ShoppingCartTest {
	
	@SuppressWarnings("deprecation")
	@Test
	void test() {
		try {			
			ShoppingCart sc = new ShoppingCart();

			// Zero Items initially. - Step 1.
			assertEquals(0, sc.getItemCount());

			Product p = new Product("Shampoo", 6.99);
			Product p1 = new Product("Soap", 7.99);
			Product p2 = new Product("Toothpaste", 7.99);
			// Add new products
			sc.addItem(p);
			sc.addItem(p1);
			sc.addItem(p2);
			// Total count of items added in the cart. -- Step 3
			assertEquals(3, sc.getItemCount());
			// Sum of the total items in the cart. -- Step 4
			assertEquals(p.getPrice() + p1.getPrice() + p2.getPrice(), sc.getBalance());

			sc.removeItem(p2);
			// Count should be decremented. -- Step 5
			assertEquals(2, sc.getItemCount());			

		} catch (Exception ex) {
			fail(ex.getMessage());
		}

	}

}
