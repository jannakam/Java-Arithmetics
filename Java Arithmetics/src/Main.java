public class Main {
    public static void main(String[] args) {
        double amountKWD = 86;
        double amountinUSD = amountKWD * 3.25;
        System.out.printf("%.0f KWD = %.1f USD\n", amountKWD, amountinUSD);

        double amountinEUR = 68;
        double USDtoKWD = amountinUSD / 3.25;
        double EURtoKWD = amountinEUR * 0.3333;

        // SPICY CHALLENGE
        System.out.printf("%.2f USD = %.0f KWD\n", amountinUSD, USDtoKWD);
        System.out.printf("%.0f EUR = %.2f KWD\n", amountinEUR, EURtoKWD);

    }
}