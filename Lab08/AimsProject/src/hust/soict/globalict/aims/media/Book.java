package hust.soict.globalict.aims.media;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;

import javax.swing.JOptionPane;
public class Book extends Media{
	private List<String> authors = new ArrayList<String>();
	private String content;
	List<String> contentTokens = new ArrayList<String>();
	Map<String,Integer> wordFrequency = new TreeMap<String,Integer>();
	public Book() {
		super();
	}
	public Book(String content) {
		this.content = content;
	}
	public Book(String id,String title, String category,List<String>authors,float cost) {
		super(id,title,category,cost);
		this.authors=authors;
	}
	public Book(String id,String title, String category,List<String>authors,float cost,String content) {
		super(id,title,category,cost);
		this.authors=authors;
		this.content = content;
	}
	public List<String> getContentTokens() {
		return contentTokens;
	}
	public Map<String, Integer> getWordFrequency() {
		return wordFrequency;
	}
	public String getContent() {
		return content;
	}
	
	public List<String> getAuthors() {
		return authors;
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
	public int compareTo(Media o) {
		return this.getTitle().compareTo(o.getTitle());
	}
	public String processContent() {
		String regex = "[!._,'@? ]";
        StringTokenizer str = new StringTokenizer(this.content,regex);
		StringBuffer result = new StringBuffer();
		 while(str.hasMoreTokens()) {
	            String s=str.nextToken();
	            contentTokens.add(s);
	    }
		contentTokens.sort(null);
		for(String s:contentTokens) {
			result.append(s+" ");
			wordFrequency.put(s,s.length());
		}
		result.append("\n");
		for (Map.Entry<String, Integer> e : wordFrequency.entrySet()) result.append(e.getKey() + " "+ e.getValue()+"\n");
		String ans = result.toString();
		return ans;
	}
	public String toString() {
        return String.format(this.getId()+"\n"+this.getTitle()+"\n"+this.getCategory()+"\n"+this.getAuthors()+"\n"+
	this.getCost()+"\n"+this.content+"\n"+this.processContent());
    }
}
