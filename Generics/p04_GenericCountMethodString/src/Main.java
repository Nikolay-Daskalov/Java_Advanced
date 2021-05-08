import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {// Main
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());
        Data<String> data = new Data<>();
        for (int i = 0; i < n; i++) {
            String input = reader.readLine();
            data.Add(input);
        }
        System.out.println(data.Count());
    }
}