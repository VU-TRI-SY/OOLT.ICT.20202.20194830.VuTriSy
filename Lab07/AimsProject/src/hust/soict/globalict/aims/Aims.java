package hust.soict.globalict.aims;
import java.util.Scanner;

import javax.swing.JOptionPane;

import hust.soict.globalict.aims.media.*;
import  hust.soict.globalict.aims.order.Order;
public class Aims{
	public static void showAdminMenu() {
		System.out.println("Product Management Application: ");
		System.out.println("--------------------------------");
		System.out.println("1. Create new order");
		System.out.println("2. Add item to the order");
		System.out.println("3. Delete item by id");
		System.out.println("4. Display the items list of order");
		System.out.println("0. Exit");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2-3-4");
	} 
	/*public static void showMenu() {
		System.out.println("Order Management Application: ");
		System.out.println("--------------------------------");
		System.out.println("1. Create new order");
		System.out.println("2. Add item to the order");
		System.out.println("3. Delete item by id");
		System.out.println("4. Display the items list of order");
		System.out.println("0. Exit");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2-3-4");
	}*/
	public static void main(String[] args) {
		Order anOrder = null;
		int hasOrder=0;
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		while(true) {
			showAdminMenu();
			switch(scan.nextInt()) {
			case 1:
				anOrder=new Order();
				hasOrder=1;
				break;
			case 2:
				if(hasOrder==1) {
					System.out.println("Which item your want to add:");
					System.out.println("1.Book");
					System.out.println("2.DigitalVideoDisc");
					System.out.println("3.CompactDisc");
					switch(scan.nextInt()) {
					case 1: 
						Book book=new Book();
						anOrder.addItem(book.createNewItem());
						break;
					case 2:
						DigitalVideoDisc dvd=new DigitalVideoDisc();
						dvd=(DigitalVideoDisc) dvd.createNewItem();
						anOrder.addItem(dvd);
				        int input = JOptionPane.showConfirmDialog(null, "Do you want to play this DVD","", JOptionPane.YES_NO_OPTION);
				        if(input==0) dvd.play();
						break;
					case 3:
						CompactDisc cd=new CompactDisc();
						cd =(CompactDisc) cd.createNewItem();
						anOrder.addItem(cd);
						int input1 = JOptionPane.showConfirmDialog(null, "Do you want to play this CD","", JOptionPane.YES_NO_OPTION);
						if(input1==0) cd.play();
						break;
					}
				} else System.out.println("There is no order to add item.");
				break;
			case 3:
				String id=JOptionPane.showInputDialog("Enter ID of item you want to delete:");
				if(anOrder.removeItem(id)) {
					System.out.println("Remove successfully");
				}else System.out.println("Not exist this item");
				break;
			case 4:
				if(hasOrder==1) {
					int i=1;
					for(Media media:anOrder.getItemsOrdered()) {
						System.out.println(i+":");
						media.displayItem();
						System.out.println();
						i++;
					}
				}else System.out.println("There is no order to display");
				break;
			case 0:
				System.exit(0);
				break;
			}
			
		}
	}
}

