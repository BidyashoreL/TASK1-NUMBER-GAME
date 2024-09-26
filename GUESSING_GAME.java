import java.util.Random;
import java.util.Scanner;

public class GUESSING_GAME {
    private static void displayWelcomeMessage() {
        System.out.println("        *****");
        System.out.println("WELCOME TO GUESSING GAME");
        System.out.println("LET'S TEST OUR THINKING POWER AND TEST OUR LUCK");
        System.out.println("LET'S PICK A NUMBER BETWEEN 1 to 100");
    }

    private static boolean askUserToPlayAgain() {
        Scanner x = new Scanner(System.in);
        System.out.print("Do you want to play again? ");
        System.out.println("ENTER Y FOR YES");
        System.out.println("ENTER N FOR NO");
        System.out.print("(y/n): ");
        String y = x.next();

        return y.equalsIgnoreCase("y");
    }

    public static void main(String[] args) {
        Random r = new Random();
        Scanner scanner = new Scanner(System.in);

        int totalRounds = 0;
        int totalScore = 0;

        while (true) {
            int answer = r.nextInt(100) + 1;
            int attempts = 0;
            int k=5;
            displayWelcomeMessage();

            for(int i=0;i<k;i++){
                System.out.println("Enter the number:");
                int guess=scanner.nextInt();

                if (answer==guess){
                    System.out.println("YOU HAVE GUESSED THE CORRECT NUMBER");
                    System.out.println(" ");
                    totalScore++;
                    break;

                }else if(guess<answer && i!=k-1){
                    System.out.println("Your guess is too low, please try again.");
                }else if (guess>answer && i!=k-1){
                    System.out.println("Your guess is too high, please try again.");
                }
            }
            System.out.println(" ");
            System.out.println("THE CORRECT NUMBER TO BE GUESSED WAS "+answer);

            totalRounds++;

            if (!askUserToPlayAgain()) {
                break;
            }
        }

        System.out.println("YOU HAVE PLAYED " + totalRounds + " ROUNDS & SCORED " + totalScore + " POINTS.");
        System.out.println("               THANK YOU ");
        System.out.println("             -------------");
    }
}
