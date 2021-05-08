import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {// Main
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());
        Data<Integer> data = new Data<>();
        for (int i = 0; i < n; i++) {
            int input = Integer.parseInt(reader.readLine());
            data.Add(input);
        }

        String[] toSwap = reader.readLine().split("\\s+");
        int index1 = Integer.parseInt(toSwap[0]);
        int index2 = Integer.parseInt(toSwap[1]);
        data.Swap(index1, index2);
        System.out.print(data.toString());

        reader.close();
    }
}