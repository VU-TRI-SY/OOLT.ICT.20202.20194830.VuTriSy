package hust.soict.globalict.aims.disc;

public class DigitalVideoDisc {
	private String title;
	private String category;
	private String directory;
	private int length;
	private float cost;
	public DigitalVideoDisc(String title) {
		super();
		this.title = title;
	}
	public DigitalVideoDisc(String title, String category, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.cost = cost;
	}
	public DigitalVideoDisc(String title, String category, String directory, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.directory = directory;
		this.cost = cost;
	}
	public DigitalVideoDisc(String title, String category, String directory, int length, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.directory = directory;
		this.length = length;
		this.cost = cost;
	}
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCategory() {
		return category;
	}
	public String getDirectory() {
		return directory;
	}
	public int getLength() {
		return length;
	}
	
	public void setCost(float cost) {
		this.cost = cost;
	}
	public float getCost() {
		return cost;
	}
	public boolean search(String title_in) {
		String[] str_int=title_in.split(" ");
		String[] str=title.split(" ");
		for(int i=0;i<str_int.length;i++) {
			int check=0;
			for(int j=0;j<str.length;j++) {
				if(str_int.equals(str)) {
					check=1;
					break;
				}
			}
			if(check==0) return false;
		}
		return true;
	}
}
