import java.util.Scanner;
public class LotteryRunner {
    public static void main(String[] args) {

        // Instance Variables
        Scanner s = new Scanner(System.in);
        Lottery lottery = new Lottery();
        int userNumber;
        int winnings;

        // User Input
        System.out.println("Enter your lottery pick: ");
        userNumber = s.nextInt();

        winnings = lottery.determineWinnings(userNumber);

    }
}
