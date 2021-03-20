package oolt_lab;

public class MyDate {
	int day_i;
	int month_i;
	int year_i;
	String day_s;
	String month_s;
	String year_s;
	public MyDate(int day_i, int month_i, int year_i) {
		super();
		this.day_i = day_i;
		this.month_i = month_i;
		this.year_i = year_i;
	}
	public MyDate(String day_s, String month_s, String year_s) {
		super();
		this.day_s = day_s;
		this.month_s = month_s;
		this.year_s = year_s;
	}
	public void print() {
		System.out.println(month_s+" "+day_s+" "+year_s);
	}
	public void print_i() {
		System.out.println(day_i+"/"+month_i+"/"+year_i);
	}
}
