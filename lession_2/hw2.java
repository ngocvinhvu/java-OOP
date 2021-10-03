public class LastLaugh {
    public static void main(String args[]) {
        int maxDenominator = 50000;
        double sum = 1.0;
        for (int denominator = 1; denominator <= maxDenominator; ++denominator) {
            sum += (1 / (denominator + 1));
        }
        sum = round(sum, 5);
        System.out.println(sum);
    }
}