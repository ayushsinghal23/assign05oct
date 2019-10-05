
package main;

import java.util.Scanner;

public class Main6 {
    private String input;

    public Main6(String input) {
        this.input = input;

    }


    public void modification() {
        input = input.toUpperCase();
        System.out.println(input);

            }
    }


class uppperCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().trim();
        Main6 obj1 = new Main6(input);
        obj1.modification();
    }
}