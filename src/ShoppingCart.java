import java.util.*;
public class ShoppingCart {

	ArrayList<Books>Products;
	int count;
	int totalPrice;
	
	ShoppingCart(){
		count = 0;
		totalPrice=0;
		Products = new ArrayList();
	}

	public boolean add(Books book) {
		// TODO Auto-generated method stub
		Products.add(book);
		totalPrice += book.price;
		count++;
		return false;
	}

	public int getCount() {
		// TODO Auto-generated method stub
		return count;
	}

	public int getTotalPrice() {
		// TODO Auto-generated method stub
		return totalPrice;
	}
}
