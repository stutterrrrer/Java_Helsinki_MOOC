public class Song {

	private String artist;
	private String name;
	private int durationInSeconds;

	public Song(String artist, String name, int durationInSeconds) {
		this.artist = artist;
		this.name = name;
		this.durationInSeconds = durationInSeconds;
	}

	public boolean equals(Object compared) {
		if (this == compared) {
			return true;
		} else if (!(compared instanceof Song)) {
			return false;
		} else {
			// having confirmed the compared is of the same class: convert it from Object type to Song type:
			Song comparedSong = (Song) compared;
			return this.artist.equals(comparedSong.artist) &&
					this.name.equals(comparedSong.name) &&
					this.durationInSeconds == comparedSong.durationInSeconds;
		}
	}


	@Override
	public String toString() {
		return this.artist + ": " + this.name + " (" + this.durationInSeconds + " s)";
	}
}
