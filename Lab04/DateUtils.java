package oolt_lab;

public class DateUtils {
	public static int compare(MyDate date1,MyDate date2) {
		if(date1.year_i<date2.year_i) {
			return 1;
		}else {
			if(date1.year_i>date2.year_i) {
				return -1;
			}else {
				if(date1.month_i<date2.month_i) {
					return 1;
				}else {
					if(date1.month_i>date2.month_i) {
						return -1;
					}else {
						if(date1.day_i<date2.day_i) {
							return 1;
						}else {
							if(date1.day_i>date2.day_i) {
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
	
}
	

