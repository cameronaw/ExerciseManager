public class Exercise01_07 {
    public static void main(String[] args) {
        System.out.println("PI with an accuracy of roughly " + Math.floor((1 - 1.0/11) * 10000) / 100 + "%:\t" + calculatePI(11));
        System.out.println("PI with an accuracy of roughly " + Math.floor((1 - 1.0/13) * 10000) / 100 + "%:\t" + calculatePI(13));
        System.out.println("PI with an accuracy of roughly " + Math.floor((1 - 1.0/1000) * 10000) / 100 + "%:\t" + calculatePI(1000));
    }

    public static double calculatePI(double accuracy) {
        double pi = 0;
        for(double i = 1; i <= accuracy; i+=2) {
            pi = (i % 4) == 1 ? pi + (1/i) : pi - (1/i);
        }
        return pi*4;
    }
}
