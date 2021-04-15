package hust.soict.globalict.aims.media;
import java.util.*;

import javax.swing.JOptionPane;
public class Book extends  Media{
	private List<String> authors=new ArrayList<String>();
	public Book() {
		super();
	}
	public Book(String id,String title, String category,List<String>authors,float cost) {
		super(id,title,category,cost);
		this.authors=authors;
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
	public Media createNewItem() {
		String id,title,category;
		String cost;
		String author;
		String numbers;
		List<String> authors=new ArrayList<String>();
		id=JOptionPane.showInputDialog("Enter id:");
        title=JOptionPane.showInputDialog("Enter tile:");
        category=JOptionPane.showInputDialog("Enter category:");
        numbers=JOptionPane.showInputDialog("Enter the numbers of authors:");
        for(int  i=1;i<=Integer.parseInt(numbers);i++) {
        	author=JOptionPane.showInputDialog("Enter author "+i+":");
        	authors.add(author);
        }
        cost=JOptionPane.showInputDialog("Enter cost:");
		return (new Book(id,title,category,authors,Float.parseFloat(cost)));
	}
	public void displayItem() {
		System.out.println("Book Id:"+getId());
		System.out.println("Book Title:"+this.getTitle());
		System.out.println("Book Author:");
		for(int i=0;i<authors.size();i++) {
			System.out.println((i+1)+") "+authors.get(i));
		}
		System.out.println("Book Cost:"+this.getCost());
	}
}
