public class Order {
	public static final int MAX_NUMBERS_ORDERS = 10;
	public static final int  MAX_LIMITTED_ORDERS=2;
	private DigitalVideoDisc itemsOrdered[]=new DigitalVideoDisc[MAX_NUMBERS_ORDERS];
	private  int qtyOrdered=0;
	private static int nbOrders=0;
	private  MyDate dateOrdered;
	public Order(MyDate dateOrdered) {
			super();
			this.dateOrdered = dateOrdered;
			nbOrders++;
	}
	
	public static int getNbOrders() {
		return nbOrders;
	}

	public MyDate getDateOrdered() {
		return dateOrdered;
	}

	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if(qtyOrdered<MAX_NUMBERS_ORDERS) {
			itemsOrdered[qtyOrdered]=disc;
			qtyOrdered++;
			System.out.println("The disc has been added");
		}else {
			System.out.println("The order is almost full");
		}
	}
	public void addDigitalVideoDisc(DigitalVideoDisc[] disc) {
		int n=disc.length;
		int i;
		if(qtyOrdered>=MAX_NUMBERS_ORDERS) {
			System.out.println("The order is full.");
		}else {
			for(i=0;i<n;i++) {
				itemsOrdered[qtyOrdered]=disc[i];
				qtyOrdered++;
				if(qtyOrdered==MAX_NUMBERS_ORDERS&&i<n-1) {
					System.out.println("The disc:");
					for(int j=i+1;j<n;j++) {
						System.out.println(disc[j].getTitle());
					}
					System.out.println("cannot be added to the current order because of full ordered items.");
					break;
				}
			}
		}
	}
	public void addDigitalVideoDisc(DigitalVideoDisc dvd1,DigitalVideoDisc dvd2) {
		if(qtyOrdered>=MAX_NUMBERS_ORDERS) {
			System.out.println("The order is full.");
		}else {
			if(qtyOrdered==9) {
				itemsOrdered[qtyOrdered]=dvd1;
				qtyOrdered++;
				System.out.println("The dvd "+dvd2.getTitle()+" that could not be added.");
			}else {
				itemsOrdered[qtyOrdered]=dvd1;
				itemsOrdered[qtyOrdered]=dvd2;
				qtyOrdered+=2;	
			}
		}
	}
	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		for(int i=0;i<qtyOrdered;i++) {
			if (itemsOrdered[i]==disc) {
				for(int j=i;j<qtyOrdered;j++) {
					itemsOrdered[j]=itemsOrdered[j+1];
				}
				qtyOrdered--;
				break;
			}
		}
	}
	public static boolean checkNbOrders(){
		return nbOrders==MAX_LIMITTED_ORDERS;
	}
	public void display() {
		float sum=0;
		System.out.println("***********************Order********************************************************");
		System.out.println("Date:");dateOrdered.print();
		System.out.println("Ordered Items:");
		for(int j=0;j<qtyOrdered;j++) {
			System.out.println(j+1+". DVD - "+itemsOrdered[j].getTitle()+" - "+itemsOrdered[j].getCategory()+" - "+itemsOrdered[j].getDirectory()+" - "+
					itemsOrdered[j].getLength()+": "+itemsOrdered[j].getCost()+"$");
			sum+=itemsOrdered[j].getCost();
		
		}
		System.out.println("Total cost:" +sum);
		System.out.println("***********************************************************************************");
	}
	public float totalCost() {
		float sum=0;
		for(int i=0;i<qtyOrdered;i++) {
			sum+=itemsOrdered[i].getCost();
		}
		return sum;
	}
}
