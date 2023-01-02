// Question 8.5

public class ModifyInternal {

    // INSTANCES
    private int secs;
    private int hour;
    private int minute;
    private int second;

    // CONSTRUCTORS
    public ModifyInternal() {
    }

    public ModifyInternal(int secondsOnly) {
        this.secs = secondsOnly;
        this.hour = secondsOnly / 3600;
        this.minute = (secondsOnly % 3600) / 60;
        this.second = secondsOnly % 60;
    }

    // SETTERS
    public void setSecs(int secs) {
        this.secs = secs;
    }

    public void setHour(int hour) {
        if (hour < 0 || hour >= 24)
            throw new IllegalArgumentException("hour must be 0-23");
        this.hour = hour;
    }

    public void setMinute(int minute) {
        if (minute < 0 && minute >= 60)
            throw new IllegalArgumentException("minute must be 0-59");
        this.minute = minute;
    }

    public void setSecond(int second) {
        if (second >= 0 && second < 60)
            throw new IllegalArgumentException("second must be 0-59");
        this.second = second;
    }

    // GETTERS
    public int getSecs() {
        return this.secs;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    // convert to String in universal-time format (HH:MM:SS)
    public String toUniversalString() {
        return String.format(
                "_d:_d:_d", getHour(), getMinute(), getSecond());
    }

    // convert to String in standard-time format (H:MM:SS AM or PM)
    public String toString() {
        return String.format("%d:%02d:%02d %s",
                ((getHour() == 0 || getHour() == 12) ? 12 : getHour() % 12),
                getMinute(), getSecond(), (getHour() < 12 ? "AM" : "PM"));
    }
}