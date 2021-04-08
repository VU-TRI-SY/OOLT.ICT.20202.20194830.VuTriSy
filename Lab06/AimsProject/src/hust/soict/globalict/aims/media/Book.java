package hust.soict.globalict.aims.media;
import java.util.*;
public class Book extends Media{
	private List<String> authors=new ArrayList<String>();
	Book(String title){
		super(title);
	}
	public Book(String title, String category){
		super(title, category);
	}
	public Book(String title, String category, List<String>authors){
		super(title, category);
		this.authors= authors;
	}
	
	public boolean addAuthor(String authorName) {
		return authors.contains(authorName);
	}
	public void removeAuthor(String authorName) {
		if(authors.contains(authorName)==true) {
			authors.remove(authorName);
			System.out.println("Remove succesfully!");
		}else {
			System.out.println("The author is not present!");
		}
	}
	public void displayInformation() {
		System.out.println(this.getId()+"-"+this.getTitle()+"-"+
	this.getCategory()+"-"+this.getCost());
		System.out.print("Authors:");
		for(int i=0;i<authors.size();i++) {
			System.out.print(authors.get(i)+" ");
		}
		System.out.println();
	}
}
