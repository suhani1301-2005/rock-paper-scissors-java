import java.util.Random;
import java.util.Scanner;

public class RockPaperScissorsGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        String[] choices = {"Rock", "Paper", "Scissors"};
        int userScore = 0, compScore = 0;
        boolean playAgain = true;

        System.out.println("🎮 Welcome to Rock-Paper-Scissors Game!");
        System.out.println("Type Rock, Paper, or Scissors. Type Exit to quit.");

        while (playAgain) {
            System.out.print("\n👉 Enter your choice: ");
            String userChoice = sc.next().toLowerCase();

            if (userChoice.equals("exit")) {
                playAgain = false;
                break;
            }

            // Check valid input
            if (!(userChoice.equals("rock") || userChoice.equals("paper") || userChoice.equals("scissors"))) {
                System.out.println("❌ Invalid input! Please enter Rock, Paper, or Scissors.");
                continue;
            }

            // Computer choice
            int compIndex = rand.nextInt(3);
            String compChoice = choices[compIndex];
            System.out.println("🤖 Computer chose: " + compChoice);

            // Compare results
            if (userChoice.equals("rock")) {
                if (compChoice.equalsIgnoreCase("Rock")) {
                    System.out.println("😐 It's a Tie!");
                } else if (compChoice.equalsIgnoreCase("Scissors")) {
                    System.out.println("✅ You Win this round!");
                    userScore++;
                } else {
                    System.out.println("❌ Computer Wins this round!");
                    compScore++;
                }
            } else if (userChoice.equals("paper")) {
                if (compChoice.equalsIgnoreCase("Paper")) {
                    System.out.println("😐 It's a Tie!");
                } else if (compChoice.equalsIgnoreCase("Rock")) {
                    System.out.println("✅ You Win this round!");
                    userScore++;
                } else {
                    System.out.println("❌ Computer Wins this round!");
                    compScore++;
                }
            } else if (userChoice.equals("scissors")) {
                if (compChoice.equalsIgnoreCase("Scissors")) {
                    System.out.println("😐 It's a Tie!");
                } else if (compChoice.equalsIgnoreCase("Paper")) {
                    System.out.println("✅ You Win this round!");
                    userScore++;
                } else {
                    System.out.println("❌ Computer Wins this round!");
                    compScore++;
                }
            }

            // Display Scoreboard
            System.out.println("📊 Scoreboard -> You: " + userScore + " | Computer: " + compScore);
        }

        System.out.println("\n🏁 Final Score -> You: " + userScore + " | Computer: " + compScore);
        if (userScore > compScore) {
            System.out.println("🎉 Congratulations! You are the overall winner!");
        } else if (compScore > userScore) {
            System.out.println("🤖 Computer Wins the game! Better luck next time.");
        } else {
            System.out.println("😐 The game ended in a Tie!");
        }

        sc.close();
    }
}
