package hust.soict.globalict.aims.utils;

public class DateUtils {
	public static int compare(MyDate date1,MyDate date2) {
		if(date1.year<date2.year) {
			return 1;
		}else {
			if(date1.year>date2.year) {
				return -1;
			}else {
				if(date1.month<date2.month) {
					return 1;
				}else {
					if(date1.month>date2.month) {
						return -1;
					}else {
						if(date1.day<date2.day) {
							return 1;
						}else {
							if(date1.day>date2.day) {
								return -1;
							}else {
								return 0;
							}
						}
					}
				}
			}
		}
	}
	public static void sort(MyDate[] date) {
		for(int i=0;i<date.length-1;i++) {
			if(compare(date[i],date[i+1])==-1) {
				int day_t=date[i].getDay();
				int month_t=date[i].getMonth();
				int year_t=date[i].getYear();
				date[i].setDay(date[i+1].getDay());
				date[i].setMonth(date[i+1].getMonth());
				date[i].setYear(date[i+1].getYear());
				date[i+1].setDay(day_t);
				date[i+1].setMonth(month_t);
				date[i+1].setYear(year_t);
			}
		}
	}
	
}
	

