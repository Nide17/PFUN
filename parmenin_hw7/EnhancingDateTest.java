// Question 8.8
public class EnhancingDateTest {
    public static void main(String args[]) {

        EnhancingDate t = new EnhancingDate(11, 25, 2022);
        System.out.println(t);

        for (int i = 1; i <= 69; i++) {
            t.nextDay();
            System.out.printf("Adding one day: %s\n", t.toString());
        }
    }
}