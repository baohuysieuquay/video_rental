package video_rental.lib.data;
import video_rental.lib.data.type.*;
import video_rental.lib.*;

/** This class represent a DVD item with a title, its price and its genre
 * 
 * @author Nguyen, Gia Bao
 *
 */
public class DVD extends Media {
	private MovieGenre genre;
	private FSKRating restriction;
	private static int DVDtotal = 1000;
	private String IMDbID = "DVD";
	
	/**
	 * This is a constructor of a DVD class
	 * 
	 * @param title the title of the DVD
	 * @param price the price of the DVD
	 * @param genre the genre of the DVD
	 * @param restriction a boolean type variable shows if this DVD has any restrictions
	 * @param status a boolean type variable shows if this DVD is still available for lending or not
	 */
	public DVD(String title, double price, MovieGenre genre, FSKRating restriction, boolean status) {
		super(title, "DVD", price, status);
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
	 * @return the genre of the DVD
	 */
	public MovieGenre getGenre() {
		return genre;
	}
	
	/**
	 * This is a setter for the "genre" variable
	 * 
	 * @param genre the music genre that will be given to the DVD through the setter
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
	 * This method is to lend the customer the DVD
	 * 
	 * @param inv choose the inventory which contains the DVD
	 * @param cus choose the customer who wants to borrow the DVD
	 */
	public void lendingDVDs(Inventory inv, Customer cus) {
		if (this.status) {
			for (int i = 0; i < inv.getDVDs().length; i++) {
				if (this == inv.getDVDs()[i]) {
					if (this.restriction.isAllowed(cus.getAge())) {
						System.out.println("Lending customer...\n" + inv.getDVDs()[i].toString() + "\n");
						inv.getDVDs()[i] = null;
						cus.addDVD(this);
						break;
					} else {
						System.out.println("You must be older to borrow this DVD\n");
						break;
					}
				} 
			}
		} else {
			System.out.println("This DVD is not available right now");
		}
	}
	
	/**
	 * This DVD is to return the DVD from the customer to the inventory
	 * 
	 * @param inv choose the inventory to return the DVD
	 * @param cus choose the customer who wants to return the DVD
	 */
	public void returningDVDs(Inventory inv, Customer cus) {
		for (int i = 0; i < cus.getDVDs().length; i++) {
			if (cus.getDVDs()[i] == this) {
				System.out.println("returning DVD...\n" + cus.getDVDs()[i].toString() + "\n");
				cus.getDVDs()[i] = null;
				inv.addDVD(this);
			}
		}
	}
	
	@Override
	/**
	 * This is an Override of the toString() method 
	 * 
	 * @return a String type prasentation of this DVD class
	 */
	public String toString() {
		return "[DVD: " + this.getTitle() + ", Price: " + this.getPrice() + ", " + this.getGenre().toString() + ", " + this.getRestriction().toString() + "]";
	}
	
}

