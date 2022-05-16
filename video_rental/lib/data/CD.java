package video_rental.lib.data;
import video_rental.lib.Inventory;
import video_rental.lib.data.type.*;

/** This class represent a CD item with a title, its price and its genre
 * 
 * @author Nguyen, Gia Bao
 *
 */
public class CD extends Media {
	private boolean exLabel;
	private MusicGenre genre;
	private static int CDtotal = 1000;
	private String MBID = "CD";
	
	/**
	 * This is a constructor of CD class
	 * 
	 * @param title the title of the CD
	 * @param price the normal price of the CD
	 * @param genre the music genre of the CD
	 * @param exLabel a boolean variable shows if this CD is an explixit Label or not
	 * @param status a boolean variable shows if this CD still available for lending or not
	 */
	public CD(String title, double price, MusicGenre genre,boolean exLabel, boolean status) {
		super(title, "CD", price, status);
		this.title = title;
		this.price = price;
		this.genre = genre;
		this.exLabel = exLabel;
		this.status = status;
		this.MBIDGenerate();
	}
	
	private void MBIDGenerate() {
		this.MBID += ++CDtotal;
	}
	
	/**
	 * This method is to check if this CD is an explixit Label or not
	 * 
	 * @return the boolean type variable "exLabel" of this CD class
	 */
	public boolean isExLabel() {
		return exLabel;
	}
	
	/**
	 * This is a setter for the "exLabel" variable
	 * 
	 * @param exLabel the "exLabel" variable of the CD class that will be given through the setter
	 */
	public void setExLabel(boolean exLabel) {
		this.exLabel = exLabel;
	}

	/**
	 * This is a getter for the "genre" variable
	 * 
	 * @return the genre of the CD
	 */
	public MusicGenre getGenre() {
		return genre;
	}
	
	/**
	 * This is a setter for the "genre" variable
	 * 
	 * @param genre the music genre that will be given to the CD through the setter
	 */
	public void setGenre(MusicGenre genre) {
		this.genre = genre;
	}
	
	public String getMBID() {
		return MBID;
	}

	/**
	 * This method is to lend the customer the CD
	 * 
	 * @param inv choose the inventory which contains the CD
	 * @param cus choose the customer who wants to borrow the CD
	 */
	public void lendingCDs(Inventory inv, Customer cus) {
		if (this.status) {
			for (int i = 0; i < inv.getCDs().length; i++) {
				if (this == inv.getCDs()[i]) {
					if (this.isExLabel()) {
						if (cus.getAge() >= 18) {
						    System.out.println("Lending customer...\n" + inv.getCDs()[i].toString() + "\n");
						    inv.getCDs()[i] = null;
						    cus.addCD(this);
						    break;
					    } else {
						    System.out.println("You must be older to borrow this CD");
					    }
			        } else {
			        	System.out.println("Lending customer...\n" + inv.getCDs()[i].toString() + "\n");
					    inv.getCDs()[i] = null;
					    cus.addCD(this);
					    break;
			        }
				}
			}
		} else {
			System.out.println("This CD is not available right now");
		}
	}
	
	/**
	 * This CD is to return the CD from the customer to the inventory
	 * 
	 * @param inv choose the inventory to return the CD
	 * @param cus choose the customer who wants to return the CD
	 */
	public void returningCDs(Inventory inv, Customer cus) {
		for (int i = 0; i < cus.getCDs().length; i++) {
			if (cus.getCDs()[i] == this) {
				System.out.println("returning CD...\n" + cus.getCDs()[i].toString() + "\n");
				cus.getCDs()[i] = null;
				inv.addCD(this);
			}
		}
	}
	/**
	 * This is an Override of the toString() method 
	 * 
	 * @return a String type prasentation of this CD class
	 */
	public String toString() {
		return "[CD: " + this.getTitle() + ", Price: " + this.getPrice() + ", " + this.getGenre().toString() + "]";
	}
	
}
