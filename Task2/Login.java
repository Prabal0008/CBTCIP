package task3;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        
        System.out.print("Enter password: ");
        String password = scanner.nextLine();
        
        // Add authentication logic here (e.g., check against a database)
        if (authenticate(username, password)) {
            System.out.println("Login successful!");
            // Proceed to profile update or MCQs selection
        } else {
            System.out.println("Login failed. Invalid username or password.");
        }
    }
    private static boolean authenticate(String username, String password) {
        // Sample authentication logic (replace with your actual logic)
        return username.equals("admin") && password.equals("password");
    }
}


