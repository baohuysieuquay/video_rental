package video_rental.lib.data;

public class Customer {
	private String firstName;
	private String lastName;
	private int age;
	private static int total = 1000;
	private int customerNr;
	private DVD[] borrowedDVDs = new DVD[10];
	private CD[] borrowedCDs = new CD[10];
	private BluRay[] borrowedBluRay = new BluRay[10];
	
	public Customer(String first, String last, int age) {
		this.firstName = first;
		this.lastName = last;
		this.age = age;
		this.cusNrGenerate();
	}

	public void cusNrGenerate() {
		this.customerNr = ++total;
	}
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getCustomerNr() {
		return customerNr;
	}
	
	public void addDVD(DVD item) {
		for (int i = 0; i < borrowedDVDs.length; i++) {
			if (borrowedDVDs[i] == null) { // check if there is enough space to store the DVD
				borrowedDVDs[i] = item;
				break;
			}
		}
	}
	public DVD[] getDVDs() {
		return this.borrowedDVDs;
	}
	
	public void addCD(CD item) {
		for (int i = 0; i < borrowedCDs.length; i++) {
			if (borrowedCDs[i] == null) { // check if there is enough space to store the DVD
				borrowedCDs[i] = item;
				break;
			}
		}
	}
	public CD[] getCDs() {
		return this.borrowedCDs;
	}
	
	public void addBluRay(BluRay item) {
		for (int i = 0; i < borrowedBluRay.length; i++) {
			if (borrowedBluRay[i] == null) { // check if there is enough space to store the DVD
				borrowedBluRay[i] = item;
				break;
			}
		}
	}
	public BluRay[] getBluRay() {
		return this.borrowedBluRay;
	}

	@Override
	public String toString() {
		String res = "Borrowed DVDs and CDs:\n\nDVDs:\n";
		for (int i = 0; i < borrowedDVDs.length; i++) {
			if (borrowedDVDs[i] != null) {
				res += borrowedDVDs[i].toString() + "\n";
			}
		}
		res += "\nCDs:\n";
		for (int i = 0; i < borrowedCDs.length; i++) {
			if (borrowedCDs[i] != null) {
				res += borrowedCDs[i].toString() + "\n";
			}
		}
		return res;
	}
	
}
