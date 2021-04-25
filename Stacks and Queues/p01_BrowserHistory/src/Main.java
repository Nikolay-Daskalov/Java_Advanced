import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> test = new ArrayDeque<>();

        String input = scanner.nextLine();

        while (!input.equals("Home")) {

            if (input.equals("back")) {
                if (test.size() <= 1) {
                    System.out.println("no previous URLs");
                } else {
                    test.pop();
                    System.out.println(test.peek());
                }
            } else {
                System.out.println(input);
                test.push(input);
            }

            input = scanner.nextLine();
        }
    }
}