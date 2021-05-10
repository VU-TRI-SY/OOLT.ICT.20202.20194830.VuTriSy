package hust.soict.globalict.aims.media;
public class Track implements Playable, Comparable<Track>{
	private String title;
	private int length;
	public Track(String title) {
		super();
		this.title = title;
	}
	public Track(String title, int length) {
		super();
		this.title = title;
		this.length = length;
	}
	public String getTitle() {
		return title;
	}
	public int getLength() {
		return length;
	}
	public void play() {
		System.out.println("Playing track: "+this.getTitle());
		System.out.println("Track length: "+this.getLength());
	}
	public void display() {
		System.out.println("Title:"+this.getTitle());
		System.out.println("Length:"+this.getLength());
	}
	public boolean equals(Object o) {
		if(o instanceof Track) {
			Track c=(Track) o;
			return this.title==c.title&&this.length==c.length;
		}else return false;
	}
	public int compareTo(Track track) {
        return (this.getTitle()).compareTo(track.getTitle());
    }
}
