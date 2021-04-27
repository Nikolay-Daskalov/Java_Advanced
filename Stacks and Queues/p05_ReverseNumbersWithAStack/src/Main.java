import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> list = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();

        for (Integer integer : list) {
            arrayDeque.push(integer);
        }

        while (!arrayDeque.isEmpty()) {
            if (arrayDeque.size() == 1) {
                System.out.println(arrayDeque.pop());
            } else {
                System.out.print(arrayDeque.pop() + " ");
            }
        }
    }
}