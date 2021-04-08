package hust.soict.globalict.aims;
import java.util.Scanner;
import hust.soict.globalict.aims.media.*;
import  hust.soict.globalict.aims.order.Order;
public class Aims{
	public static void showMenu() {
		System.out.println("Order Management Application: ");
		System.out.println("--------------------------------");
		System.out.println("1. Create new order");
		System.out.println("2. Add item to the order");
		System.out.println("3. Delete item by id");
		System.out.println("4. Display the items list of order");
		System.out.println("0. Exit");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2-3-4");
	}
	public static void main(String[] args) {
		Order anOrder = null;
		int hasOrder=0;
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
	
		while(true) {
			showMenu();
			switch(sc.nextInt()) {
				case 1:
					if(Order.checkNbOrders()!=true) {
						anOrder=new Order();
						hasOrder=1;
					}
					else System.out.println("Cannot make new order");
					break;
				case 2:
					if(hasOrder==1) {
						sc.nextLine();
						System.out.print("Enter ID:");String id=sc.nextLine();
						System.out.print("Enter title:");String title=sc.nextLine();
						System.out.print("Enter category:");String category=sc.nextLine();
						System.out.print("Enter cost:");float cost=sc.nextFloat();
						anOrder.addItem(new Media(id,title,category,cost));
					}else {
						System.out.println("Not have order to add this item into");
					}
					break;
				case 3:
					if(hasOrder==1) {
						System.out.println("Enter ID of item that you nees to delete:");
						anOrder.removeItem(sc.next());
					}else {
						System.out.println("Not have order to do this action");
					}
					break;
				case 4:
					if(hasOrder==1) {
						anOrder.display();
					}else {
						System.out.println("Not have order to do this action");
					}
					break;
				case 0:
				System.exit(0);
				break;
				default:
					System.out.println("This option is invalid!");
					break;
			}
		}
	}
}

