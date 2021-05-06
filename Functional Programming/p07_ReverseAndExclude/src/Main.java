import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> list = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        int n = Integer.parseInt(scanner.nextLine());

        Collections.reverse(list);

        Predicate<Integer> predicate = integer -> integer % n != 0;

        list.stream()
                .filter(predicate)
                .forEach(integer -> System.out.print(integer + " "));

        scanner.close();
    }
}