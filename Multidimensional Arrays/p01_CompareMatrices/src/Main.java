import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] rolsAndCols = ReadArray(scanner, "\\s+");

        int rows = rolsAndCols[0];
        int cols = rolsAndCols[1];

        int[][] matrix1 = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            matrix1[i] = ReadArray(scanner, "\\s+");
        }

        rolsAndCols = ReadArray(scanner, "\\s+");

        int rows2 = rolsAndCols[0];
        int cols2 = rolsAndCols[1];

        if (rows != rows2) {
            System.out.println("not equal");
            return;
        }
        if (cols != cols2) {
            System.out.println("not equal");
            return;
        }

        int[][] matrix2 = new int[rows2][cols2];

        for (int i = 0; i < rows2; i++) {
            matrix2[i] = ReadArray(scanner, "\\s+");
        }

        for (int row = 0; row < rows; row++) {
            int[] current1 = matrix1[row];
            int[] current2 = matrix2[row];
            for (int col = 0; col < cols; col++) {
                if (current1[col] != current2[col]) {
                    System.out.println("not equal");
                    return;
                }
            }
        }

        System.out.println("equal");
    }

    private static int[] ReadArray(Scanner scanner, String splitBy) {
        return Arrays.stream(scanner.nextLine()
                .split(splitBy))
                .mapToInt(Integer::parseInt).toArray();
    }
}