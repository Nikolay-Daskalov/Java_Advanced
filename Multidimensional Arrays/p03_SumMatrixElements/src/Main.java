import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] rolsAndCols = ReadArray(scanner, ", ");

        int rows = rolsAndCols[0];
        int cols = rolsAndCols[1];

        int[][] matrix = ReadMatrixInt(scanner, rows, cols);

        int sum = 0;
        for (int[] ints : matrix) {
            for (int number : ints) {
                sum += number;
            }
        }
        System.out.printf("The sum is: %s%n", sum != 0 ? sum : "matrix is empty!");
    }

    private static int[][] ReadMatrixInt(Scanner scanner, int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        for (int row = 0; row < matrix.length; row++) {
            matrix[row] = ReadArray(scanner, ", ");
        }
        return matrix;
    }

    private static int[] ReadArray(Scanner scanner, String s) {
        return Arrays.stream(scanner.nextLine()
                .split(s))
                .mapToInt(Integer::parseInt).toArray();
    }
}