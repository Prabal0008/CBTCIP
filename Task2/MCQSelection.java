package task3;
import java.util.Scanner;

public class MCQSelection {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Sample MCQs
        System.out.println("Choose the correct answer:");
        System.out.println("1. What is capital of India?");
        System.out.println("   a) Delhi");
        System.out.println("   b) Mumbai");
        System.out.println("   c) Pune");
        System.out.println("   d) Banglore");
        System.out.print("Your answer: ");
              
        String answer = scanner.nextLine();
        
        // Process answer (validate and store)
        System.out.println("Answer selected: " + answer);
    }
}

