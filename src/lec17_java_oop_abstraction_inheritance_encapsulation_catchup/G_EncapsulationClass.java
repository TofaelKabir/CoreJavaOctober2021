package lec17_java_oop_abstraction_inheritance_encapsulation_catchup;

public class G_EncapsulationClass {

	private String mediaType;
	private int duration;
	private String title;
	private float rating;
	
	public G_EncapsulationClass(String title, String mediaType, int duration, float rating) {
		this.mediaType = mediaType;
		this.duration = duration;
		this.title = title;
		this.rating = rating;
	}

	public String getMediaType() {
		return mediaType;
	}

	public void setMediaType(String mediaType) {
		this.mediaType = mediaType;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public float getRating() {
		return rating;
	}

	public void setRating(float rating) {
		this.rating = rating;
	}
	
	
}
