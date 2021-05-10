package hust.soict.globalict.test.media;

import java.util.ArrayList;
import java.util.List;

import hust.soict.globalict.aims.media.Book;

public class BookTest {
	public static void main(String args[]) {
		List<String> authors = new ArrayList<String>();
		authors.add("Victor");
		authors.add("William");
		Book book = new Book("Book123","The Call Of The Wild","novel",
				authors,23,"The Call of the Wild is a short adventure novel by Jack London, published in 1903 and set in Yukon, Canada, during the 1890s Klondike Gold Rush, when strong sled dogs were in high demand.");
		System.out.println(book);
	}
}
