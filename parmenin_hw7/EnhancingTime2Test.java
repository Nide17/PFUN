// Question 8.7
public class EnhancingTime2Test {
    public static void main(String[] args) {
        EnhancingTime2 t1 = new EnhancingTime2();
        EnhancingTime2 t2 = new EnhancingTime2(11, 25, 50);

        System.out.println("Constructed with:");
        displayTime("t1: all default arguments", t1);
        displayTime("t2: Specified hours, minutes, and seconds", t2);

        // Incrementing
        t2.tick();
        displayTime("Incrementing by one second:", t2);

        t2.incrementMinute();
        displayTime("Incrementing by one minute:", t2);

        t2.incrementHour();
        displayTime("Incrementing by one hour:", t2);
    }

    // displays a EnhancingTime2 object in 24-hour and 12-hour formats
    private static void displayTime(String header, EnhancingTime2 t) {
        System.out.printf("%s%n %s%n  %s%n",
                header, t.toUniversalString(), t.toString());
    }
}