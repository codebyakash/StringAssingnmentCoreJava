package string;

	public class EnumConvert {

	    enum Day {
	        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
	    }

	    public static void main(String[] args) {
	        Day day = Day.TUESDAY;
	        String dayString = day.name();
	        System.out.println("Enum to string: " + dayString);
	    }
	}

