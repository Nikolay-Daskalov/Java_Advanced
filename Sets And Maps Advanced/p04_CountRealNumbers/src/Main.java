import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<Double, Integer> realNumbersCount = new LinkedHashMap<>();
        Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToDouble(Double::parseDouble)
                .forEach(number -> {
                    realNumbersCount.putIfAbsent(number, 0);
                    realNumbersCount.put(number, realNumbersCount.get(number) + 1);
                });

        for (Map.Entry<Double, Integer> entry : realNumbersCount.entrySet()) {
            System.out.printf("%.1f -> %d%n", entry.getKey(), entry.getValue());
        }
    }
}
