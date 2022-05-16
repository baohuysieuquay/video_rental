package video_rental.lib.data;

public class Media {
	protected String title;
	private String mediaType;
	protected double price;
	protected boolean sale = false;
	protected double saleprice = 0;
	protected boolean status;
	private static int IDTotal = 1000;
	protected int ID;
	
	public Media(String title, String mediaType, double price, boolean status) {
		this.title = title;
		this.price = price;
		this.status = status;
		this.mediaType = mediaType;
		this.IDGenerate();
	}

	private void IDGenerate() {
		this.ID = ++IDTotal;
	}
	
	public String getMediaType() {
		return mediaType;
	}
	public void setMediaType(String mediaType) {
		this.mediaType = mediaType;
	}

	/**
	 * This is a getter for the "title" variable
	 * 
	 * @return the title of the media product
	 */
	public String getTitle() {
		return this.title;
	}
	
	/**
	 * This is a setter for the "title" variable
	 * 
	 * @param title the title that will be given to the media product through the setter
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	
	/**
	 * This is the getter for the "price" variable
	 * 
	 * @return the normal price if the media product is not on sale and the sale price if the media product is on sale
	 */
	public double getPrice() { // if its on sale, show the sale price, if not, show the original price
		if (sale == false) {
			return price;
		} else {
			return saleprice;
		}
	}
	
	/**
	 * This is a setter for the "price" variable
	 * 
	 * @param price the price that will be given to this media product through this setter
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	
	/**
	 * This is a setter for the "sale" variable
	 * 
	 * @param sale the sale status that will be given to this media product through this setter
	 */
	public void setSale(boolean sale) {
		this.sale = sale;
	}
	
	/**
	 * This is a setter for the "sale" variable
	 * 
	 * @param saleprice the sale price that will be given to this media product through this setter
	 */
	public void setSaleprice(double saleprice) {
		this.saleprice = saleprice;
	}
	
	@Override
	public String toString() {
		return "[Media Product: " + this.getTitle() + ", Price: " + this.getPrice() + "]";
	}
}
