
public enum WeekDays {
	MONDAY, 
	TUESDAY, 
	WEDNESDAY, 
	THURSDAY, 
	FRIDAY;
	    
	public static WeekDays getWeekDayInString(String day) {
		
		if (day.equalsIgnoreCase("monday"))
			return WeekDays.MONDAY;
		
		if (day.equalsIgnoreCase("tuesday"))
			return WeekDays.TUESDAY;
		
		if (day.equalsIgnoreCase("wednesday"))
			return WeekDays.WEDNESDAY;
		
		if (day.equalsIgnoreCase("thursday"))
			return WeekDays.THURSDAY;
		
		if (day.equalsIgnoreCase("friday"))
			return WeekDays.FRIDAY;
		
		return WeekDays.FRIDAY;
	}
}
