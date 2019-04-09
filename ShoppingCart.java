import java.util.*;

public class ShoppingCart {

	private ArrayList items;

	public ShoppingCart() {
		items = new ArrayList();
	}

	public double getBalance() {
		double balance = 0.00;
		for (Iterator i = items.iterator(); i.hasNext();) {
			Product item = (Product) i.next();
			balance += item.getPrice();
		}
		return balance;
	}

	public void addItem(Product item) {
		items.add(item);
	}

	public void removeItem(Product item) throws ProductNotFoundException {
		try {
			if (!items.remove(item)) {
				throw new ProductNotFoundException();
			}
		}
		finally {
			
		}
//		} catch (ProductNotFoundException ex) {
//			System.out.println("Sorry! The product doesn't exist. Please check back again.");
//		}
//		catch (Exception ex) {
//			System.out.println("Sorry! Something went wrong. Please check back again.");
//		}
	}

	public int getItemCount() {
		return items.size();
	}

	public void empty() {
		items.clear();
	}
}
