// Question 8.15
public class Rational {

    private int numer;
    private int denomin;

    public Rational() {
        numer = 1;
        denomin = 1;
    }

    public Rational(int num, int denom) {
        numer = num;
        denomin = denom;
        reduce();
    }

    private void reduce() {
        int gcd = 0;
        int gcdNbr;

        if (numer < denomin)
            gcdNbr = numer;
        else
            gcdNbr = denomin;

        for (int div = gcdNbr; div >= 2; div--) {
            if (numer % div == 0 && denomin % div == 0) {
                gcd = div;
                break;
            }
        }

        if (gcd != 0) {
            numer = numer / gcd;
            denomin = numer / gcd;
            System.out.println(numer + ", " + denomin + ", ");
        }
    }

    public Rational adding(Rational inputted) {
        int denomResults = denomin * inputted.denomin;
        int numResults = numer * inputted.denomin + denomin * inputted.numer;

        return new Rational(numResults, denomResults);
    }

    public Rational subtracting(Rational inputted) {
        int denomResults = denomin * inputted.denomin;
        int numResults = numer * inputted.denomin - denomin * inputted.numer;

        return new Rational(numResults, denomResults);
    }

    public Rational multiplying(Rational inputted) {
        return new Rational(numer * inputted.numer, denomin * inputted.denomin);
    }

    public Rational dividing(Rational inputted) {
        return new Rational(numer * inputted.denomin, denomin * inputted.numer);
    }

    public String toString() {
        return numer + "/" + denomin;
    }

    public String floatToString(int precis) {
        double dbFormat = (double) numer / denomin;
        return String.format("%." + precis + "f", dbFormat);
    }
}