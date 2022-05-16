package video_rental.lib.data;

import video_rental.lib.Inventory;
import video_rental.lib.data.type.FSKRating;
import video_rental.lib.data.type.MovieGenre;

public class BluRay extends Media {
	private MovieGenre genre;
	private FSKRating restriction;
	private static int DVDtotal = 1000;
	private String IMDbID = "BR";
	
	public BluRay(String title, double price, MovieGenre genre, FSKRating restriction, boolean status) {
		super(title, "BR", price, status);
		this.title = title;
		this.price = price;
		this.genre = genre;
		this.restriction = restriction;
		this.status = status;
		this.IMDbIDGenerate();
	}
	
	private void IMDbIDGenerate() {
		this.IMDbID += ++DVDtotal;
	}
	
	/**
	 * This is a getter for the "genre" variable
	 * 
	 * @return the genre of the BluRay
	 */
	public MovieGenre getGenre() {
		return genre;
	}
	
	/**
	 * This is a setter for the "genre" variable
	 * 
	 * @param genre the music genre that will be given to the BluRay through the setter
	 */
	public void setGenre(MovieGenre genre) {
		this.genre = genre;
	}
	
	public FSKRating getRestriction() {
		return restriction;
	}
	public void setRestriction(FSKRating restriction) {
		this.restriction = restriction;
	}
	
	public String getIMDbID() {
		return IMDbID;
	}

	/**
	 * This method is to lend the customer the BluRay
	 * 
	 * @param inv choose the inventory which contains the BluRay
	 * @param cus choose the customer who wants to borrow the BluRay
	 */
	public void lendingBluRays(Inventory inv, Customer cus) {
		if (this.status) {
			for (int i = 0; i < inv.getBluRay().length; i++) {
				if (this == inv.getBluRay()[i]) {
					if (this.restriction.isAllowed(cus.getAge())) {
						System.out.println("Lending customer...\n" + inv.getBluRay()[i].toString() + "\n");
						inv.getBluRay()[i] = null;
						cus.addBluRay(this);
						break;
					} else {
						System.out.println("You must be older to borrow this BluRay\n");
						break;
					}
				} 
			}
		} else {
			System.out.println("This BluRay is not available right now");
		}
	}
	
	/**
	 * This BluRay is to return the BluRay from the customer to the inventory
	 * 
	 * @param inv choose the inventory to return the BluRay
	 * @param cus choose the customer who wants to return the BluRay
	 */
	public void returningBluRays(Inventory inv, Customer cus) {
		for (int i = 0; i < cus.getBluRay().length; i++) {
			if (cus.getBluRay()[i] == this) {
				System.out.println("returning BluRay...\n" + cus.getBluRay()[i].toString() + "\n");
				cus.getBluRay()[i] = null;
				inv.addBluRay(this);
			}
		}
	}
	
	@Override
	public String toString() {
		return "[BluRay: " + this.getTitle() + ", Price: " + this.getPrice() + ", " + this.getGenre().toString() + ", " + this.getRestriction().toString() + "]";
	}
}
