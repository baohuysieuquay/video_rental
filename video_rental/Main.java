package video_rental;
import video_rental.lib.*;
import video_rental.lib.data.*;

public class Main {

	public static void main(String[] args) {
		
		Inventory i = new Inventory();
		DVD dvd1 = new DVD("Wizard, Selena", 2.99);
		CD cd1 = new CD("Rock, Demi", 2.49);
		
		i.addDVD(dvd1);
		i.addCD(cd1);
		
		System.out.println(i.str());
		
	}

}
