package de.anhquan.demo.hibernate.helloworld;

import org.junit.Test;

import de.anhquan.demo.hibernate.helloworld.Order;
import de.anhquan.demo.hibernate.helloworld.ShoppingCart;

public class ShoppingCartTest {

	@Test
	public void testSave(){
		Order entry = new Order();
		entry.setCategory("iPod");
		entry.setName("iPod-nano-3g");
		entry.setDescription("Third Generation iPod Nano Flash 8GB");
		ShoppingCart.save(entry);
		
		ShoppingCart.close();
	}
}
