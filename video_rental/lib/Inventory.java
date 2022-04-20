package video_rental.lib;
import video_rental.lib.data.*;

public class Inventory {

	DVD[] dvdList = new DVD[10];
	CD[] cdList = new CD[10];
	
	public void addDVD(DVD item) {
		for (int i = 0; i < dvdList.length; i++) {
			if (dvdList[i] == null) {
				dvdList[i] = item;
				break;
			}
		}
	}
	
	public DVD[] getDVDs() {
		return dvdList;
	}
	
	public void addCD(CD item) {
		for (int i = 0; i < cdList.length; i++) {
			if (cdList[i] == null) {
				cdList[i] = item;
				break;
			}
		}
	}
	
	public CD[] getCDs() {
		return cdList;
	}
	
	public String str() {
		String res = "Inventory:\n\nDVDs:\n";
		for (int i = 0; i < dvdList.length; i++) {
			if (dvdList[i] != null) {
				res += dvdList[i].str() + "\n";
			}
		}
		res += "\nCDs:\n";
		for (int i = 0; i < cdList.length; i++) {
			if (cdList[i] != null) {
				res += cdList[i].str() + "\n";
			}
		}
		return res;
	}
	
}




