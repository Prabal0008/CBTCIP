package task;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GameGUI {

    private Game1 game1;
    private JFrame frame;
    private JTextField guessField;
    private JLabel infoLabel;
    private JButton guessButton;

    public GameGUI(Game1 game1) {
        this.game1 = game1;
    }

    public void init() {
        frame = new JFrame("Guess the Number Game");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        frame.add(panel);
        placeComponents(panel);

        frame.setVisible(true);
        game1.startNewRound();
        updateUI();
    }

    private void placeComponents(JPanel panel) {
        panel.setLayout(null);
        infoLabel = new JLabel("Round: " + game1.getRound() + " | Attempts left: " + game1.getAttemptsLeft());
        infoLabel.setBounds(10, 10, 380, 25);
        panel.add(infoLabel);

        guessField = new JTextField(10);
        guessField.setBounds(10, 50, 120, 25);
        panel.add(guessField);

        guessButton = new JButton("Guess");
        guessButton.setBounds(140, 50, 80, 25);
        guessButton.addActionListener(e -> handleGuess());
        panel.add(guessButton);
    }

    private void handleGuess() {
        try {
            int guessedNumber = Integer.parseInt(guessField.getText());
            boolean isCorrect = game1.guessNumber(guessedNumber);
            if (isCorrect || game1.isRoundOver()) {
                if (isCorrect) {
                    JOptionPane.showMessageDialog(frame, "Congratulations! You guessed the number.");
                } else {
                    JOptionPane.showMessageDialog(frame, "Out of attempts! The number was: " + game1.getNumberToGuess());
                }
                game1.startNewRound();
                updateUI();
            } else {
                updateUI();
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(frame, "Please enter a valid number.");
        }
    }

    private void updateUI() {
        infoLabel.setText("Round: " + game1.getRound() + " | Attempts left: " + game1.getAttemptsLeft());
        guessField.setText("");
        guessButton.setEnabled(game1.getAttemptsLeft() > 0);
    }
}


