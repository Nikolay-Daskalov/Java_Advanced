import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<Character, Integer> map = new TreeMap<>();

        for (int i = 0; i < input.length(); i++) {
            char current = input.charAt(i);
            map.putIfAbsent(current, 0);
            map.put(current, map.get(current) + 1);
        }

        map.forEach((key, value) -> {
            System.out.printf("%c: %d time/s%n", key, value);
        });
    }
}