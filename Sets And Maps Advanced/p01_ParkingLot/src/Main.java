import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<String> parkingLot = new LinkedHashSet<>();
        String input = scanner.nextLine();
        while (!input.equals("END")) {

            String[] tokens = input.split(", ");
            if (tokens[0].equals("IN")) {
                parkingLot.add(tokens[1]);
            } else {
                parkingLot.remove(tokens[1]);
            }

            input = scanner.nextLine();
        }

        if (parkingLot.isEmpty()) {
            System.out.println("Parking Lot is Empty");
            return;
        }
        for (String string : parkingLot) {
            System.out.println(string);
        }
    }
}