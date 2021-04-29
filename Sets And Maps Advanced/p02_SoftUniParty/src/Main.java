import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<String> normalSet = new TreeSet<>();
        Set<String> vipSet = new TreeSet<>();
        String input = scanner.nextLine();

        while (!input.equals("PARTY")) {
            if (Character.isDigit(input.charAt(0))) {
                vipSet.add(input);
            } else {
                normalSet.add(input);
            }
            input = scanner.nextLine();
        }

        while (!input.equals("END")) {
            if (Character.isDigit(input.charAt(0))) {
                vipSet.remove(input);
            } else {
                normalSet.remove(input);
            }
            input = scanner.nextLine();
        }

        System.out.println(normalSet.size() + vipSet.size());

        for (String string : vipSet) {
            System.out.println(string);
        }

        for (String string : normalSet) {
            System.out.println(string);
        }
    }
}