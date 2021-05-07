package Jar;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = Integer.parseInt(scanner.nextLine());

        Jar<String> jar = new Jar<String>();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter text: ");
            jar.add(scanner.nextLine());
        }

        System.out.println("Texts: ");
        while (!jar.isEmpty()) {
            System.out.println(jar.remove());
        }
    }
}