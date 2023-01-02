// Question 8.5

public class ModifyInternalTest {
    public static void main(String[] args) {
        ModifyInternal tSec = new ModifyInternal(4000);
        displayTime("ModifyInternal object with seconds specified", tSec);
    }

    // displays a ModifyInternal object in 24-hour and 12-hour formats
    private static void displayTime(String header, ModifyInternal t) {
        System.out.printf("%s%n %s%n  %s%n",
                header, t.toUniversalString(), t.toString());
    }
}