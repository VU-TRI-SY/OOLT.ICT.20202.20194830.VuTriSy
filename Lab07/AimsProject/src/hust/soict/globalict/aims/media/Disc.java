package hust.soict.globalict.aims.media;

abstract class Disc extends Media{
	private float length;
	private String director;
	public float getLength() {
		return length;
	}
	public String getDirector() {
		return director;
	}
	public Disc(String director,float length) {
		super();
		this.length = length;
		this.director = director;
	}
	public Disc() {
		super();
	}
	public Disc(String id,String title,String category,String director,float cost) {
		super(id,title,director,cost);
	}
	public Disc(String id,String title,String category,String director,float length,float cost) {
		super(id,title,category,cost);
		this.length=length;
		this.director=director;
	}
}
