package video_rental.lib.data.type;

/**
 * This is an enum of the movie genres
 * 
 * @author Nguyen, Gia Bao
 *
 */
public enum MovieGenre {
	COMEDY("Genre: Comedy"), 
	ROMANTIC("Genre: Romantic"), 
	HORROR("Genre: Horror"), 
	ADVENTURE("Genre: Adventure"), 
	ACTION("Genre: Action");
	
	/**
	 * This is a variable shows the String value of the enum value
	 * 
	 */
	private final String genre;
	
	/**
	 * This is a constructor of the movie genre enum
	 * 
	 * @param genre the genre of the movie
	 */
	private MovieGenre(String genre) {
		this.genre = genre;
	}
	
	/**
	 * This is basically an Override of toString() method
	 * 
	 * @return the "genre" variable of this enum in String type
	 */
	public String str() {
		return this.genre;
	}
}
