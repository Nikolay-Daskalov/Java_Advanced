import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        if (number == 0) {
            System.out.println(0);
            return;
        }

        ArrayDeque<Integer> binary = new ArrayDeque<>();
        while (number != 0) {
            int zeroOrOne = number % 2;
            binary.push(zeroOrOne);
            number /= 2;
        }

        while (!binary.isEmpty()) {
            System.out.print(binary.pop());
        }

        System.out.println();
    }
}