package org.Task;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Task1Same {

    Set<String> set = new HashSet<>();
    Scanner scanner = new Scanner(System.in);  // Reuse the same scanner instance

    void addUser() {
        System.out.println("To add user ID, enter 'y': ");
        char ch = scanner.next().charAt(0);
        scanner.nextLine(); // Consume the leftover newline character
        while (ch == 'y') {
            System.out.println("Enter the user ID to add: ");
            String userId = scanner.nextLine();  // Read the user ID as a whole line
            set.add(userId);
            System.out.println("User added: " + userId);
            System.out.println("Enter again 'y/n' to continue adding: ");
            ch = scanner.next().charAt(0);
            scanner.nextLine(); // Consume the leftover newline character
//            System.out.println("Current users: " + set.toString());
        }
    }

    void checkUser() {
        System.out.println("Enter user ID to check: ");
        String user = scanner.nextLine();
        if (set.contains(user)) {
            System.out.println("User ID has already visited.");
        } else {
            System.out.println("New user.");
        }
    }

    void display() {
        System.out.println("Current user IDs: " + set.toString());
    }

    public static void main(String[] args) {
        Task1Same t = new Task1Same();
        Scanner s = t.scanner;  // Use the scanner that already exists in the class

        while (true) {
            System.out.println("Enter a function (1 to add, 2 to check, 3 to display, 4 to exit): ");
            int function = s.nextInt();
            s.nextLine(); // Consume the leftover newline character

            switch (function) {
                case 1:
                    t.addUser();
                    break;
                case 2:
                    t.checkUser();
                    break;
                case 3:
                    t.display();
                    break;
                case 4:
                    System.out.println("Exiting the program...");
                    return;  // Exit the program
                default:
                    System.out.println("Invalid option.");
            }
        }
    }
}
