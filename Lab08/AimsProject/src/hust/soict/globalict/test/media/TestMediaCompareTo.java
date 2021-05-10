package hust.soict.globalict.test.media;
import java.util.ArrayList;
import java.util.Collections;
import hust.soict.globalict.aims.media.Book;
import hust.soict.globalict.aims.media.CompactDisc;
import hust.soict.globalict.aims.media.DigitalVideoDisc;
import hust.soict.globalict.aims.media.Media;
public class TestMediaCompareTo {
	public static void main(String args[]) {
		ArrayList<Media> list = new ArrayList<Media>(); 
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King",87);
		list.add(dvd1);
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars",124);
		list.add(dvd2);
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Alddin",90);
		list.add(dvd3);
		CompactDisc cd1 = new CompactDisc("Senorita",39);
		list.add(cd1);
		CompactDisc cd2 = new CompactDisc("Closer",24);
		list.add(cd2);
		CompactDisc cd3 = new CompactDisc("Friends",48);
		list.add(cd3);
		Book b1 = new Book("Harry Potter");
		list.add(b1);
		Book b2 = new Book("The Giver");
		list.add(b2);
		Book b3 = new Book("The Call Of The Wild");
		list.add(b3);
		System.out.println("*************************************");
		System.out.println("The items currently in the order are:");
		System.out.println("*************************************");
		System.out.println("The items in sorted order are:");
		int i=0;
		for(Media media:list) {
			System.out.println((++i)+") "+media.getTitle());
		}
		Collections.sort(list);
		System.out.println("*************************************");
		System.out.println("The items in sorted order are:");
		i=0;
		for(Media media:list) {
			System.out.println((++i)+") "+media.getTitle());
		}
		System.out.println("*************************************");
	}
}
