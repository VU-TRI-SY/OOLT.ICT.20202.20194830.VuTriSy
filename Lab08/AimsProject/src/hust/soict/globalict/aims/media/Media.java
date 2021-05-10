package hust.soict.globalict.aims.media;
import java.util.Scanner;
abstract public class Media implements Comparable<Media>{
	private String id;
	private String title;
	private String category;
	private float cost;
	Scanner sc=new Scanner(System.in);
	public Media() {
	}
	public Media(String title){
		this.title = title;
	}
	public Media(String title, String category){
		this(title);
		this.category = category;
	}
	public Media(String id,String title, String category, float cost) {
		super();
		this.id=id;
		this.title = title;
		this.category = category;
		this.cost = cost;
	}
	public String getId() {
		return id;
	}
	public String getTitle() {
		return title;
	}
	public String getCategory() {
		return category;
	}
	public float getCost() {
		return cost;
	}
	abstract public Media createNewItem();
	abstract public void displayItem();
	public boolean equals(Object o) {
		if(o instanceof Media) {
			Media c=(Media) o;
			return this.id==c.id;
		}else return false;
	}
}

