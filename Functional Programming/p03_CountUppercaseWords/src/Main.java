import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> collect = Arrays.stream(scanner.nextLine().split("\\s+"))
                .filter(s -> Character.isUpperCase(s.charAt(0)))
                .collect(Collectors.toList());

        System.out.println(collect.size());
        for (String string : collect) {
            System.out.println(string);
        }

        scanner.close();
    }
}