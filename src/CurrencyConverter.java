import java.util.Scanner;

public class CurrencyConverter {

    public static double convertCurrency(double amount, String fromCurrency, String toCurrency) {

        double rateUSDToVND = 24000;
        double rateVNDToUSD = 1 / rateUSDToVND;

        switch (fromCurrency.toUpperCase() + "->" + toCurrency.toUpperCase()) {
            case "USD->VND":
                return amount * rateUSDToVND;
            case "VND->USD":
                return amount * rateVNDToUSD;
            default:
                System.out.println("Không hỗ trợ loại tiền tệ này.");
                return -1;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số tiền cần chuyển đổi: ");
        double amount = scanner.nextDouble();

        System.out.print("Chuyển đổi từ (USD/VND): ");
        String fromCurrency = scanner.next();

        System.out.print("Chuyển đổi sang (USD/VND): ");
        String toCurrency = scanner.next();

        double convertedAmount = convertCurrency(amount, fromCurrency, toCurrency);

        if (convertedAmount != -1) {
            System.out.printf("Số tiền sau khi chuyển đổi từ %s sang %s là: %.2f\n",
                    fromCurrency, toCurrency, convertedAmount);
        }
    }
}
