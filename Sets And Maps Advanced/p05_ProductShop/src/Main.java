import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] tokens = scanner.nextLine().split(",\\s+");
        Map<String, Map<String, Double>> shops = new TreeMap<>();

        while (!tokens[0].equals("Revision")) {

            String shop = tokens[0];
            String product = tokens[1];
            double price = Double.parseDouble(tokens[2]);

            shops.putIfAbsent(shop, new LinkedHashMap<>());
            shops.get(shop).put(product, price);

            tokens = scanner.nextLine().split(",\\s+");
        }

        shops.forEach((key, value) -> {
            System.out.printf("%s ->%n", key);
            value.forEach((key1, value1) -> {
                System.out.printf("Product: %s, Price: %.1f%n", key1, value1);
            });
        });
    }
}
