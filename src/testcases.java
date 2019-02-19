import static org.junit.Assert.*;

import org.junit.Test;

public class testcases {

	@Test
	public void test() {
		ShoppingCart cart = new ShoppingCart();
		assertTrue(cart.getCount()==0);
	}
	
	@Test
	public void testAdd() {
		ShoppingCart cart = new ShoppingCart();
		Books book = new Books("java",1,127);
		cart.add(book);
		assertEquals(cart.Products.get(cart.Products.size()-1),book);
		assertTrue(cart.getCount()==1);
		assertTrue(cart.getTotalPrice()==127);

		
	}
	@Test
	public void testDifferent() {
		ShoppingCart cart = new ShoppingCart();
		Books java = new Books("java",1,127);
		Books Web = new Books("Web",1,100);
		cart.add(java);
		cart.add(Web);
		assertTrue(cart.getCount()==2);
		assertTrue(cart.getTotalPrice()==227);

	}

}
