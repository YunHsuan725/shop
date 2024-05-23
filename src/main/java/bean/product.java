package bean;

/**
 * 2024/05/23, add by YunHsuan
 * 商品資料
 **/
public class product {

	//商品編號
	private String productId;
	
	//商品名稱
	private String productName;
	
	//售價
	private double price;
	
	//庫存
	private int quantity;

	
	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
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
}
