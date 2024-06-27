package task3;

import java.util.Scanner;

public class OnlineExamSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isLoggedIn = false;
        
        while (true) {
            if (!isLoggedIn) {
                System.out.println("1. Login");
                System.out.println("2. Exit");
                System.out.print("Choose option: ");
                
                int choice = scanner.nextInt();
                scanner.nextLine(); // Consume newline
                
                switch (choice) {
                    case 1:
                        // Implement login logic here
                        isLoggedIn = true;
                        break;
                    case 2:
                        System.out.println("Exiting program...");
                        return;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                        break;
                }
            } else {
                System.out.println("1. Update Profile and Password");
                System.out.println("2. Select Answers for MCQs");
                System.out.println("3. Logout");
                System.out.print("Choose option: ");
                
                int choice = scanner.nextInt();
                scanner.nextLine(); // Consume newline
                switch (choice) {
                case 1:
                    // Call ProfileUpdate.java
                    ProfileUpdate.main(args);
                    break;
                case 2:
                    // Call MCQSelection.java
                    MCQSelection.main(args);
                    break;
                case 3:
                    // Call Logout.java
                    LogOut.main(args);
                    isLoggedIn = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }
}
}
