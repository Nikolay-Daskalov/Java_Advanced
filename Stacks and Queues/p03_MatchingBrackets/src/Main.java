import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();

        String input = scanner.nextLine();

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '(') {
                arrayDeque.push(i);
            } else if (input.charAt(i) == ')') {
                System.out.println(input.substring(arrayDeque.pop(), i + 1));
            }
        }
    }
}