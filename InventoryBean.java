
public class InventoryBean {
	public double itemID;
	public String itemName;
	public double price;
	public int quantity;
	private String category;

	public InventoryBean(double itemID, String itemName, double price, int quantity,
			String category) {
		super();
		this.itemID = itemID;
		this.itemName = itemName;
		this.price = price;
		this.quantity = quantity;
		this.category = category;
	}

	public double getItemID() {
		return itemID;
	}

	public void setItemID(double itemID) {
		this.itemID = itemID;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {

		this.category = category;
	}
}
