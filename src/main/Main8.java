package main;


import java.util.Scanner;

public class Main8 {
    public String k;
    private String input;

    public Main8(String input) {
        this.input = input;

    }

    public void modification() {
        int weight = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) >= 'A' && input.charAt(i) <= 'Z') {
                int a = input.charAt(i);
                System.out.print(a + "+");
                weight += a;
            }
        }
        System.out.print("\b" + "=");
        System.out.println(weight);
    }

}

class upperWeight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().trim();
        Main8 obj1 = new Main8(input);
        obj1.modification();
    }
}
