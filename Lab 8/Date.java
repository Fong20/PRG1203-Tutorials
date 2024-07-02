//Model class Date

public class Date {

	//Declare attributes
	private int day, month, year;
	private static final String[] monthNames = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
	
	//Maximum days of each month
	private static final int[] monthDays = {31, 28 , 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	//Declare constructors
	//set default month and day to 1, year to 2012
	public Date() {
		this(1,1,2012);
	}
	
	//Constructor to receive 
	public Date(int dd, int mm, int yyyy){
		setYear(yyyy);
		setMonth(mm);
		setDay(dd);
		
	}
	
	//Constructor to receive month in String, day and year in integer
	public Date(String mm, int dd, int yyyy) {
		setYear(yyyy);
		convertFromMonthName(mm);
		setDay(dd);
	}
	
	//Constructor to receive two integer values, day number of the year
	public Date(int ddd, int yyyy) {
		setYear(yyyy);
		convertFromDayOfYear(ddd);
		
	}
	
	
	//Setters 
	public void setDay(int dd) {
		if (dd >= 1 && dd <= daysInMonth()) {
			day = dd;
		}
		
		else {
			throw new IllegalArgumentException("Invalid day!");
		}
	}
	
	public void setMonth(int mm) {
		if (mm >= 1 && mm <= 12) {
			month = mm;
		}
		
		else {
			throw new IllegalArgumentException("Invalid month!");
		}
	}
		

	public void setYear(int yyyy) {
		if (yyyy >= 1990 && yyyy <= 2100) {
			year = yyyy;
		}
		
		else {
			throw new IllegalArgumentException("Invalid year!");
		}
	}
	
	public String toString() {
		return String.format("%d/%d/%d", day, month, year);
	}
	
	public String toDayDateString() {
		return String.format("%d, %d", convertToDayOfYear(), year);
	}
	
	
	public String toMonthNameDateString() {
		return String.format("%s %d, %d",monthNames[month - 1], day, year);
	}
	
	//Additional methods
	private void convertFromMonthName(String monthName) {
		for (int index = 0 ; index < 12 ; index++) {
			if (monthName.equals(monthNames[index])) {
				setMonth(index + 1); //Set index + 1 to get the correct month in integer
			}
			
			else {
				setMonth(1); //If enter invalid month, set to default month which is January
			}
		}
	}
	
	private int daysInMonth() {
		return leapYear() && month == 2? 29 : monthDays[month - 1]; //month -1 is the index to obtain the number of days of each month in the particular array monthDays
	}
	
	private boolean leapYear() {
		if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
			return true; 
			
		}
			
		else  {
			return false;
		}
			
	}
	
	private void convertFromDayOfYear(int ddd) { //Convert day of year to the proper day and month
		int totalDay = 0;
		
		if (ddd < 1 || ddd >366) {
			ddd = 1;
			setMonth(1);
		}
		
		//To convert from day of the year to month and day, add in the number of days to the totalDay and compare it to ddd
		for (int m = 1; m < 13 && (totalDay + daysInMonth()) < ddd; ++m ) {
			totalDay += daysInMonth(); 
			setMonth(m + 1);
		}
			
		setDay(ddd - totalDay); 
		
	}
	
	
	private int convertToDayOfYear() { //Convert month and day to day of year
		int ddd = 0;
		
		for (int m = 1; m < month; ++m) {
			if (leapYear() && m == 2) {
				ddd += 29;
			}
			
			else {
				ddd += monthDays[m - 1];
			}
		}
		//add the value of ddd with the day provided
		ddd += day;
		return ddd;
		
	}
}

