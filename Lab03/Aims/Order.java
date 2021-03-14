package OOLT;

public class Order {
	public static final int MAX_NUMBERS_ORDERED = 10;
	private DigitalVideoDisc itemsOrdered[]=new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	private int qtyOrdered;
	
	public Order() {
		qtyOrdered = 0;
	}
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if(qtyOrdered<MAX_NUMBERS_ORDERED) {
			itemsOrdered[qtyOrdered]=disc;
			qtyOrdered++;
			System.out.println("The disc has been added");
		}else {
			System.out.println("The order is almost full");
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
	public float totalCost() {
		float sum=0;
		for(int i=0;i<qtyOrdered;i++) {
			sum+=itemsOrdered[i].getCost();
		}
		return sum;
	}
}
