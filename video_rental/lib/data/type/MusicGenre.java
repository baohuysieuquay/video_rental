package video_rental.lib.data.type;

/**
 * This is an enum of the music genre
 * 
 * @author Nguyen, Gia Bao
 *
 */
public enum MusicGenre {
	POP("Genre: Pop"), 
	BALLAD("Genre: Ballad"), 
	COUNTRY("Genre: Country"), 
	ROCK("Genre: Rock"), 
	RAP ("Genre: Rap");
	
	/**
	 * This is a variable shows the String value of the enum value
	 * 
	 */
	private final String genre;
	
	/**
	 * This is a constructor of the music genre enum
	 * 
	 * @param genre the genre of music
	 */
	private MusicGenre(String genre) {
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
