import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(",\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        System.out.println("Count = " + Arrays.stream(numbers).count());
        System.out.println("Sum = " + Arrays.stream(numbers).sum());

        scanner.close();
    }
}