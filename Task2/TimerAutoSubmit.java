package task3;
import java.util.Timer;
import java.util.TimerTask;

public class TimerAutoSubmit {
    public static void main(String[] args) {
        Timer timer = new Timer();
        int seconds = 60; // Example time limit
        
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                // Auto submit logic here
                System.out.println("Time's up! Submitting answers...");
                timer.cancel(); // Stop timer after submission
            }
        }, seconds * 1000);
    }
}
