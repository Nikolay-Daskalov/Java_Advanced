import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Set<String> uniqueUsernames = new LinkedHashSet<>();

        while (n-- > 0) {
            String input = scanner.nextLine();
            uniqueUsernames.add(input);
        }

        uniqueUsernames.forEach(System.out::println);
    }
}