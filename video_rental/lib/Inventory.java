package video_rental.lib;
import video_rental.lib.data.*;

/** This is an Inventory, which stores the DVDs and CDs.
 *  It can stores maximal 10 DVDs and 10 CDs.
 * 
 * @author Nguyen, Gia Bao
 */

public class Inventory {
	/**
	 *  These are the variables of the Inventory class
	 * 
	 */
	// The inventory only have space for max. 10 DVDs and 10 CDs
	private DVD[] dvdList = new DVD[10];
	private CD[] cdList = new CD[10];
	private BluRay[] blurayList = new BluRay[10];
	
	/** This method adds a DVD item to the inventory
	 * 
	 * @param item a DVD item that you want to add to this inventory
	 */
	public void addDVD(DVD item) {
		for (int i = 0; i < dvdList.length; i++) {
			if (dvdList[i] == null) { // check if there is enough space to store the DVD
				dvdList[i] = item;
				break;
			}
		}
	}
	
	/**
	 * This is a getter for a list of DVDs that this inventory contains
	 * 
	 * @return An array of DVD-Type elements
	 */
	public DVD[] getDVDs() {
		return dvdList;
	}
	
	/** This method adds a CD item to the inventory
	 * 
	 * @param item a CD item that you want to add to this inventory
	 */
	public void addCD(CD item) {
		for (int i = 0; i < cdList.length; i++) {
			if (cdList[i] == null) { // check if there is enough space to store the DVD
				cdList[i] = item;
				break;
			}
		}
	}
	
	/**
	 * This is a getter for a list of CDs that this inventory contains
	 * 
	 * @return An array of CD-Type elements
	 */
	public CD[] getCDs() {
		return cdList;
	}
	
	/** This method adds a DVD item to the inventory
	 * 
	 * @param item a DVD item that you want to add to this inventory
	 */
	public void addBluRay(BluRay item) {
		for (int i = 0; i < blurayList.length; i++) {
			if (blurayList[i] == null) { // check if there is enough space to store the BluRay
				blurayList[i] = item;
				break;
			}
		}
	}
	
	/**
	 * This is a getter for a list of DVDs that this inventory contains
	 * 
	 * @return An array of DVD-Type elements
	 */
	public BluRay[] getBluRay() {
		return blurayList;
	}
	
	/** This method return a String format for the items in the inventory
	 * 
	 * @return a string output that represents the items in the inventory
	 */
	public String toString() {
		String res = "Inventory:\n\nDVDs:\n";
		for (int i = 0; i < dvdList.length; i++) {
			if (dvdList[i] != null) {
				res += dvdList[i].toString() + "\n";
			}
		}
		res += "\nCDs:\n";
		for (int i = 0; i < cdList.length; i++) {
			if (cdList[i] != null) {
				res += cdList[i].toString() + "\n";
			}
		}
		res += "\nBluRays:\n";
		for (int i = 0; i < blurayList.length; i++) {
			if (blurayList[i] != null) {
				res += blurayList[i].toString() + "\n";
			}
		}
		return res;
	}
	
}




