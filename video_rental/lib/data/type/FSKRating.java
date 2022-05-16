package video_rental.lib.data.type;

/**
 * This is an enum of FSK Rating
 * 
 * This enum describes the restriction to audiences by ages
 * 
 * @author Nguyen, Gia Bao
 *
 */
public enum FSKRating {
	FROM_0("For all ages"), 
	FROM_6("For 6+ only"), 
	FROM_12("For 12+ only"), 
	FROM_16("For 16+ only"), 
	FROM_18("For 18+ only");
	
	/**
	 * This is a variable shows the String value of the enum value
	 * 
	 */
	private final String age;
	
	/**
	 * This is a constructor of the FSK Rating enum
	 * 
	 * @param age the "age" variable of this enum
	 */
	private FSKRating(String age) {
		this.age = age;
	}
	
	/**
	 * This method shows if the DVD is allowed for the given audience
	 * 
	 * @param usersAge the age of the given audience
	 * @return a boolean variable shows if the DVD is allowed for the audience
	 */
	public boolean isAllowed(int usersAge) {
		switch(this) {
		case FROM_0:
			return true;	
		case FROM_6:
			if (usersAge < 6) {
				return false;
			} else {
				return true;
			}
		case FROM_12:
			if (usersAge < 12) {
				return false;
			} else {
				return true;
			}
		case FROM_16:
			if (usersAge < 16) {
				return false;
			} else {
				return true;
			}
		case FROM_18:
			if (usersAge < 18) {
				return false;
			} else {
				return true;
			}
		default:
			return true;
		}
	}
	
	/**
	 * This is basically an Override of toString() method
	 * 
	 * @return the "age" variable of this enum in String type
	 */
	public String str() {
		return this.age;
	}
}
