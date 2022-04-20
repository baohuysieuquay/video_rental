package video_rental.lib.data;

public class CD {

	private String title;
	private double price;
	private boolean sale = false;
	private double saleprice = 0;
	
	public CD(String title, double price) {
		this.title = title;
		this.price = price;
	}
	
	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public double getPrice() {
		if (sale == false) {
			return price;
		} else {
			return saleprice;
		}
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public void setSale(boolean sale) {
		this.sale = sale;
	}
	public void setSaleprice(double saleprice) {
		this.saleprice = saleprice;
	}
	
	public String str() {
		return "[CD: " + this.getTitle() + ", Price: " + this.getPrice() + "]";
	}
	
}
