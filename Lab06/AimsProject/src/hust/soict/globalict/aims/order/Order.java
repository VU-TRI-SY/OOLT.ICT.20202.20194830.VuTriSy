package hust.soict.globalict.aims.order;
import java.util.ArrayList;
import hust.soict.globalict.aims.media.Media;
public class Order {
	public static final int MAX_NUMBERS_ORDERS = 10;
	public static final int  MAX_LIMITTED_ORDERS=5;
	private ArrayList<Media> itemsOrdered = new ArrayList<Media>();
	public static int nbOrders=0;
	public Order() {
			super();
			nbOrders++;
	}
	public void addItem(Media media) {
		itemsOrdered.add(media);
	}
	public void addItem(Media m1,Media m2) {
		itemsOrdered.add(m1);
		itemsOrdered.add(m2);
	}
	public void addItem(Media[] media) {
		for(Media m:media) {
			itemsOrdered.add(m);
		}
	}
	public boolean removeItem(Media media) {
		if(itemsOrdered.contains(media)) {
			itemsOrdered.remove(media);
			return true;//remove successfully
		}
		else return false;//remove falsely
	}
	public boolean removeItem(String id) {
		for(int i=0;i<itemsOrdered.size();i++) {
			Media media=itemsOrdered.get(i);
			if(media.getId().equals(id)) {
				itemsOrdered.remove(i);
				return true;//remove successfully
			}
		}
		return false;//remove falsely
	}

	public void display() {
		for(int i=0;i<itemsOrdered.size();i++) {
			Media media=itemsOrdered.get(i);
		System.out.println(i+1+":"+media.getId()+"-"+media.getTitle()+"-"+media.getCategory()+"-"
		+media.getCost()+"$");
		}
	}
	public static boolean checkNbOrders() {
		return (nbOrders>=MAX_LIMITTED_ORDERS);
	}
}

