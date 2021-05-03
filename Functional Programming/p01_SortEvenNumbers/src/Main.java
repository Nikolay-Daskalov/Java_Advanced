import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String collect = null;
        try {
            collect = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToDouble(Double::parseDouble)
                    .filter(number -> number % 2 == 0)
                    .sorted()
                    .mapToObj(String::valueOf)
                    .collect(Collectors.joining(", "));
        } catch (Exception e) {
            System.out.println("Enter valid input next time!");
            return;
        }

        System.out.println("The even numbers are: " + (collect.isEmpty() ? "none" : collect));
    }
}