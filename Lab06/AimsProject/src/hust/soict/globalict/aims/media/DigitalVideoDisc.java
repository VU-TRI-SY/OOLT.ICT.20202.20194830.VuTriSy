package hust.soict.globalict.aims.media;
public class DigitalVideoDisc extends Media {
	DigitalVideoDisc(String title){
		super(title);
	}
	DigitalVideoDisc(String title, String category){
		super(title, category);
	}
	public void displayInformation() {
		System.out.println(this.getId()+"-"+this.getTitle()+"-"+
	this.getCategory()+"-"+this.getCost());
	}
}
