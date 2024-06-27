package task3;

import java.util.Scanner;

public class ProfileUpdate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter new username: ");
        String newUsername = scanner.nextLine();
        
        System.out.print("Enter new password: ");
        String newPassword = scanner.nextLine();
        
        // Update logic (e.g., update database with new credentials)
        System.out.println("Profile updated successfully!");
    }
}
