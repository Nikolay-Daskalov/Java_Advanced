package Box;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {// Main
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());

        for (int i = 0; i < n; i++) {
            String input = reader.readLine();
            Box<String> box = new Box<>(input);
            System.out.println(box.toString());
        }

        reader.close();
    }
}