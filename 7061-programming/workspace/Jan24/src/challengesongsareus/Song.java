package challengesongsareus;

public class Song {

	//variables
	private String title;
	private String artist;
	private int highestPosition;
	
	//getters and setters
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public int getHighestPosition() {
		return highestPosition;
	}
	public void setHighestPosition(int highestPosition) {
		this.highestPosition = highestPosition;
	}
	
	//constructor
	public Song(String title, String artist, int highestPosition) {
		this.title = title;
		this.artist = artist;
		this.highestPosition = highestPosition;
	}
	
	//methods
	public void allDetails() {
		System.out.println("Song Details_______");
		System.out.println("Title: " + this.title);
		System.out.println("Artist: " + this.artist);
		System.out.println("Highest Position: " + this.highestPosition);
	}
}
