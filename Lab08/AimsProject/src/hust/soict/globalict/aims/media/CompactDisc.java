package hust.soict.globalict.aims.media;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class CompactDisc extends Disc implements Playable{
	private String artist;
	private ArrayList<Track>  tracks=new ArrayList<Track>();
	public String getArtist() {
		return artist;
	}
	public CompactDisc() {
		super();
	}
	public CompactDisc(String title,float length) {
		super(title,length);
	}
	public CompactDisc(String id,String title,String category,String director,String artist,ArrayList<Track> tracks,float cost) {
		super(id,title,category,director,cost);
		this.artist=artist;
		this.tracks=tracks;
	}
	public void addTrack(Track input) {
		if(tracks.contains(input)) {
			System.out.println("This track is already in the list");
		}else {
			tracks.add(input);
		}
	}
	public void removeTrack(Track input) {
		if(tracks.contains(input)) {
			tracks.remove(input);
		}else System.out.println("This track not exits in the list");
	}
	public void play() {
		System.out.println("Playing CD:"+this.getTitle());
		System.out.println("CD length:"+this.getLength());
		for(int i=0;i<tracks.size();i++) {
			tracks.get(i).play();
		}
	}
	public void play(String name,float length) {
		System.out.println("Playing CD:"+name);
		System.out.println("CD length:"+length);
	}
	public float getLength() {
		float sum=0;
		for(int i=0;i<tracks.size();i++) {
			sum+=tracks.get(i).getLength();
		}
		return sum;
	}
	
	public ArrayList<Track> getTracks() {
		return tracks;
	}
	public void setTracks(ArrayList<Track> tracks) {
		this.tracks = tracks;
	}
	public Media createNewItem() {
		String id=JOptionPane.showInputDialog("Enter id:");
		String title=JOptionPane.showInputDialog("Enter title");
		String category=JOptionPane.showInputDialog("Enter category:");
		String director=JOptionPane.showInputDialog("Enter director:");
		String artist=JOptionPane.showInputDialog("Enter artist:");
		 int input = JOptionPane.showConfirmDialog(null, "Do you want to add information of tracks:","", JOptionPane.YES_NO_OPTION);
		 ArrayList<Track>  tracks=new ArrayList<Track>();
		 if(input==0) {
			 String numbers=JOptionPane.showInputDialog("Enter numbers of tracks:");
			 for(int i=1;i<=Integer.parseInt(numbers);i++) {
				 String track_title=JOptionPane.showInputDialog("Enter title of track "+i+":");
				 String track_length=JOptionPane.showInputDialog("Enter length of track "+i+":");
				 Track track=new Track(track_title,Integer.parseInt(track_length));
				 tracks.add(track);
			 }
		 }
		String cost=JOptionPane.showInputDialog("Enter cost:");
		return (new CompactDisc(id,title,category,director,artist,tracks,Float.parseFloat(cost)));
	}
	public void displayItem() {
		System.out.println("CD Id:"+this.getId());
		System.out.println("CD Title:"+this.getTitle());
		System.out.println("CD Category:"+this.getCategory());
		System.out.println("CD Director:"+this.getDirector());
		System.out.println("CD Artist:"+this.getArtist());
		System.out.println("CD Tracks list:");
		int i=1;
		for(Track track:tracks) {
			System.out.println("Track "+i+":");
			track.display();
			i++;
		}
		System.out.println("CD Length:"+this.getLength());
		System.out.println("CD Cost:"+this.getCost());
	}
	public int compareTo(Media obj) {
		CompactDisc o=(CompactDisc)obj;
		if(this.getTracks().size()==o.getTracks().size()) {
			return (int) (this.getLength()-o.getLength());
		}else {
			return this.getTracks().size()-o.getTracks().size();
		}
	}
}