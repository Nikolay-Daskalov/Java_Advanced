import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Integer> map = new LinkedHashMap<>();
        while (n-- > 0) {
            String[] tokens = scanner.nextLine().split(",\\s+");
            map.put(tokens[0], Integer.parseInt(tokens[1]));
        }

        final String condition = scanner.nextLine();
        final int age = Integer.parseInt(scanner.nextLine());
        final String format = scanner.nextLine();

        switch (condition) {
            case "older":
                map.entrySet().stream()
                        .filter(p -> p.getValue() >= age)
                        .forEach(p -> {
                            if (format.equals("name")) {
                                System.out.println(p.getKey());
                            } else if (format.equals("age")) {
                                System.out.println(p.getValue());
                            } else {
                                System.out.printf("%s - %d%n", p.getKey(), p.getValue());
                            }
                        });
                break;
            case "younger":
                map.entrySet().stream()
                        .filter(p -> p.getValue() <= age)
                        .forEach(p -> {
                            if (format.equals("name")) {
                                System.out.println(p.getKey());
                            } else if (format.equals("age")) {
                                System.out.println(p.getValue());
                            } else {
                                System.out.printf("%s - %d%n", p.getKey(), p.getValue());
                            }
                        });
                break;
        }

        scanner.close();
    }
}