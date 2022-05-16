package video_rental;
import video_rental.lib.*;
import video_rental.lib.data.*;
import video_rental.lib.data.type.*;

/** This is the main class, which calls all the method we want to use
 *  to give some output to the console
 * 
 * @author Nguyen, Gia Bao
 * 
 */
public class Main {

	public static void main(String[] args) {
		
		Inventory i = new Inventory();
		DVD dvd1 = new DVD("Wizard, Selena", 2.99, MovieGenre.COMEDY, FSKRating.FROM_6, true);
		DVD dvd2 = new DVD("Rock, Demi", 4.99, MovieGenre.ROMANTIC, FSKRating.FROM_12, true);
		CD cd1 = new CD("Baby, Bieber", 2.49, MusicGenre.POP, false, true);
		CD cd2 = new CD("Love Story, Swift", 4.99, MusicGenre.COUNTRY, true, true);
		
		i.addDVD(dvd1);
		i.addDVD(dvd2);
		i.addCD(cd1);
		i.addCD(cd2);
		
		System.out.println(i.toString());
		
		Customer cus1 = new Customer("Gia Bao", "Nguyen", 18);
		
		dvd1.lendingDVDs(i, cus1);
		
		System.out.println(i.toString());
		System.out.println(cus1.toString());
		
		cd2.lendingCDs(i, cus1);
		
		System.out.println(i.toString());
		System.out.println(cus1.toString());
		
		dvd1.returningDVDs(i, cus1);
		cd2.returningCDs(i, cus1);
		
		System.out.println(i.toString());
		System.out.println(cus1.toString());
		
	}

}
