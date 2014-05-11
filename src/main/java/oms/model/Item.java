package oms.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class Item implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long id;

	private Product product;

	private int quantity;
	
	public Item() {
		
	}
	
	public Item(Long id, Product product, int quantity) {
		this.setId(id);
		this.setProduct(product);
		this.setQuantity(quantity);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public BigDecimal getPrice() {
		if (this.product == null)
			return BigDecimal.ZERO;
		return this.product.getPrice().multiply(BigDecimal.valueOf(quantity));
	}	
	
}
