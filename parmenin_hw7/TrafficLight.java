// Question 8.10
public enum TrafficLight {
    RED(50),
    GREEN(40),
    YELLOW(5);

    private final int dur;

    TrafficLight(int durSeconds) {
        dur = durSeconds;
    }

    public int getTime() {
        return dur;
    }
}