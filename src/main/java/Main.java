import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine().trim();

        if (name.isEmpty()) {
            System.out.println("Hello! (No name provided)");
        } else {
            System.out.println("Hello, " + name + "!");
        }

        scanner.close();
    }
}

