import java.util.Random;
import java.util.Scanner;
public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        
        String[] rps = {"rock", "paper", "scissors"}; // array of string type
        String computerMove;
        String playerMove;

        while (true) {
            System.out.println("Enter move (rock, paper, scissors).And To exit the game, type 'exit': ");
            playerMove = sc.nextLine().toLowerCase();

            if (playerMove.equals("exit")) {
                break;
            }

            if (!playerMove.equals("rock") && !playerMove.equals("paper") && !playerMove.equals("scissors")) {
                System.out.println("Invalid move, please try again.");
                continue;
            }

            int rand = random.nextInt(3);
            computerMove = rps[rand];

            System.out.println("Computer move: " + computerMove);

            if (playerMove.equals(computerMove)) {
                System.out.println("It's a tie!");
            } else if (playerMove.equals("rock") && computerMove.equals("scissors") ||
                       playerMove.equals("paper") && computerMove.equals("rock") ||
                       playerMove.equals("scissors") && computerMove.equals("paper")) {
                System.out.println("You win!");
            } else {
                System.out.println("You lose!");
            }
        }

        sc.close();
    }
}


