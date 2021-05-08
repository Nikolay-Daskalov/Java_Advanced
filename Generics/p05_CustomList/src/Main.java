import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {// Main
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String input = reader.readLine();
        Data<String> data = new Data<>();
        while (!input.equals("END")) {

            String[] tokens = input.split("\\s+");

            switch (tokens[0]) {
                case "Add":
                    data.Add(tokens[1]);
                    break;
                case "Remove":
                    data.Remove(Integer.parseInt(tokens[1]));
                    break;
                case "Contains":
                    System.out.println(data.Contains(tokens[1]));
                    break;
                case "Swap":
                    data.Swap(Integer.parseInt(tokens[1]), Integer.parseInt(tokens[2]));
                    break;
                case "Greater":
                    System.out.println(data.countGreaterThan(tokens[1]));
                    break;
                case "Max":
                    System.out.println(data.GetMax());
                    break;
                case "Min":
                    System.out.println(data.GetMin());
                    break;
                case "Print":
                    data.Print();
                    break;
            }

            input = reader.readLine();
        }

        reader.close();
    }
}
//Arrays.deepEquals(); -> Compare two matrix!