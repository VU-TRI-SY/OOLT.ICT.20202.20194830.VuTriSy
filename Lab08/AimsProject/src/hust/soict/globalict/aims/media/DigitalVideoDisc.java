package hust.soict.globalict.aims.media;

import javax.swing.JOptionPane;

public class DigitalVideoDisc extends Disc implements Playable{
	public DigitalVideoDisc(){
		super();
	}
	public DigitalVideoDisc(String title,float length) {
		super(title,length);
	}
	public DigitalVideoDisc(String id,String title,String category,String director,float length,float cost) {
		super(id,title,category,director,length,cost);
	}
	public void play() {
		System.out.println("Playing DVD: "+this.getTitle());
		System.out.println("DVD length: "+this.getLength());
	}
	public Media createNewItem() {
		String id=JOptionPane.showInputDialog("Enter id:");
		String title=JOptionPane.showInputDialog("Enter title");
		String category=JOptionPane.showInputDialog("Enter category:");
		String director=JOptionPane.showInputDialog("Enter director:");
		String length=JOptionPane.showInputDialog("Entet length");
		String cost=JOptionPane.showInputDialog("Enter cost:");
		return (new DigitalVideoDisc(id,title,category,director,Float.parseFloat(length),Float.parseFloat(cost)));
	}
	public void displayItem() {
		System.out.println("DVD Id:"+this.getId());
		System.out.println("DVD Title:"+this.getTitle());
		System.out.println("DVD Category:"+this.getCategory());
		System.out.println("DVD Director:"+this.getDirector());
		System.out.println("DVD Length:"+this.getLength());
		System.out.println("DVD Cost:"+this.getCost());
	}
	
}
