public class Aims {
	public static void main(String[] args) {
	
			Order anOrder =new Order(new MyDate(20,2,2001));
			DigitalVideoDisc dvd1=new DigitalVideoDisc("The Lion King","Animation",
				"Roger Allers",87,19.95f);
			anOrder.addDigitalVideoDisc(dvd1);
			DigitalVideoDisc dvd2=new DigitalVideoDisc("Star Wars","Science Fiction"
				,"Grogre Luca",87,24.95f);
			anOrder.addDigitalVideoDisc(dvd2);
			DigitalVideoDisc dvd3=new DigitalVideoDisc("Aladin","Animation","John",120,
				18.99f);
			anOrder.addDigitalVideoDisc(dvd3);
			System.out.print("Total Cost is: ");
			System.out.println(anOrder.totalCost());
			anOrder.display();
		
		
			Order anOrder1 =new Order(new MyDate(29,2,2021));
			DigitalVideoDisc dvd11=new DigitalVideoDisc("The Lion King","Animation",
				"Roger Allers",87,19.95f);
			anOrder1.addDigitalVideoDisc(dvd11);
			DigitalVideoDisc dvd21=new DigitalVideoDisc("Star Wars","Science Fiction"
				,"Grogre Luca",87,24.95f);
			anOrder1.addDigitalVideoDisc(dvd21);
			DigitalVideoDisc dvd31=new DigitalVideoDisc("Aladin","Anation","John",120,
				18.99f);
			anOrder1.addDigitalVideoDisc(dvd31);
			System.out.print("Total Cost is: ");
			System.out.println(anOrder.totalCost());
			anOrder1.display();
		
	}
}
