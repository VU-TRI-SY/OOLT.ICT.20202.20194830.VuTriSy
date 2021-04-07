package hust.soict.globalict.aims;
import hust.soict.globalict.aims.disc.DigitalVideoDisc;
import hust.soict.globalict.aims.order.Order;
import hust.soict.globalict.aims.utils.MyDate;
public class Aims {
	public static void main(String[] args) {
		if(Order.checkNbOrder()==true) {
			System.out.println("Cannot make new order!");
		}else {
			Order anOrder=new Order();
			anOrder.setDateOrdered(new MyDate(20,2,2001));
			DigitalVideoDisc dvd1=new DigitalVideoDisc("The Lion King","Animation",
					"Roger Allers",87,19.95f);
			anOrder.addDigitalVideoDisc(dvd1);
			DigitalVideoDisc dvd2=new DigitalVideoDisc("Star Wars","Science Fiction"
					,"Grogre Luca",87,24.95f);
			anOrder.addDigitalVideoDisc(dvd2);
			DigitalVideoDisc dvd3=new DigitalVideoDisc("Aladin","Animation","John",120,
					18.99f);
			anOrder.addDigitalVideoDisc(dvd3);
			anOrder.display();	
		}
	}
}

