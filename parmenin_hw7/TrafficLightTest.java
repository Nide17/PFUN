// Question 8.10

public class TrafficLightTest {
    public static void main(String args[]) {
        System.out.println("Light\tDuration");

        for (TrafficLight tl : TrafficLight.values())
            System.out.printf("%s\t%d\n", tl, tl.getTime());
    }
}
