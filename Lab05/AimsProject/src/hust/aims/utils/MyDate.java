package hust.soict.globalict.aims.utils;

public class MyDate {
	int day;
	int month;
	int year;
	String days;
	String months;
	String years;
	
	public MyDate(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public MyDate(String days, String months, String years) {
		super();
		this.days = days;
		this.months = months;
		this.years = years;
	}
	

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void print() {
    	String Month;
    	String Day;
    	switch(month) {
    		case 1: Month="January";
    		break;
    		case 2:Month="Febuary";
    		break;
    		case 3: Month="March";
    		break;
    		case 4:Month="April";
    		break;
    		case 5:Month="May";
    		break;
    		case 6:Month="June";
    		break;
    		case 7:Month="July";
    		break;
    		case 8:Month="August";
    		break;
    		case 9:Month="September";
    		break;
    		case 10:Month="October";
    		break;
    		case 11:Month="November";
    		break;
    		case 12:Month="December";
    		break;
    		default:Month="Invalid month";
    		break;
    	}
    	if(day>31||day<1){
    		Day="Invalid day";
    	}else {
    		if(day%10==1) {
    			Day=day+"st";
    		}else {
    			if(day%10==2) {
    				Day=day+"nd";
    			}else Day=day+"th";
    		}
    	}
    	System.out.println(Month+" "+Day+" "+year);
    	
    }
    public void printf_free_format() {
    	System.out.println(day+"/"+month+"/"+year);
    }
	
}
