import java.util.Arrays;
import java.util.Scanner;
import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        UnaryOperator<Double> unaryOperator = vat -> vat * 1.20;
        System.out.println("Prices with VAT:");
        Arrays.stream(scanner.nextLine().split(",\\s+"))
                .map(Double::parseDouble)
                .map(unaryOperator)
                .forEach(d -> {
                    System.out.printf("%.2f%n", d);
                });

        scanner.close();
    }
}