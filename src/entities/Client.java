package entities;

public class Client {
	
	private Integer quantity;
	private Double price;
	
	public Client() {
		
	}
	
	public Client (Integer quantity, Double price) {
		this.quantity = quantity;
		this.price = price;
	}
	
	public Integer getQuantity() {
		return quantity;
	}
	
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	
	public Double subTotal () {
		return quantity * price;
	}
	

}
