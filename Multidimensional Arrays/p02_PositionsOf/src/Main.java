import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] rolsAndCols = ReadArray(scanner, "\\s+");

        int rows = rolsAndCols[0];
        int cols = rolsAndCols[1];

        int[][] matrix = new int[rows][cols];

        for (int row = 0; row < matrix.length; row++) {
            matrix[row] = ReadArray(scanner, "\\s+");
        }

        int n = Integer.parseInt(scanner.nextLine());

        for (int row = 0; row < matrix.length; row++) {
            int[] currentArray = matrix[row];
            for (int col = 0; col < currentArray.length; col++) {
                if (currentArray[col] == n) {
                    System.out.printf("The position is: %d %d%.n", row, col);
                    return;
                }
            }
        }

        System.out.println("not found");
    }

    private static int[] ReadArray(Scanner scanner, String s) {
        return Arrays.stream(scanner.nextLine()
                .split(s))
                .mapToInt(Integer::parseInt).toArray();
    }
}