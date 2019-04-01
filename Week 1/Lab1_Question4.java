import java.util.Random;

public class Lab1_Question4 {
    public static void main(String [] args){

    Random rand = new Random();

    int computerRoll = rand.nextInt(6)+1;
    int userRoll = rand.nextInt(6)+1;

    int computerWins = 0;
    int userWins = 0;

    String message = "Winner";
    // why is winner gray?

    for (int i = 1; i < 11; i++) {
        if (computerRoll > userRoll) {
            computerWins = computerWins + 1;
            message = "Computer";
        } else if (computerRoll < userRoll) {
            userWins = userWins + 1;
            message = "User";
        } else {
            message = "Tie";
        }

        System.out.println("Roll " + i);
        System.out.println("    Computer roll: "+computerRoll);
        System.out.println("    User roll: "+userRoll);
        System.out.println("    The winner is : " + message);

        computerRoll = rand.nextInt(6)+1;
        userRoll = rand.nextInt(6)+1;

    }
        System.out.println(" ");
        System.out.println("Computer total wins: "+computerWins);
        System.out.println("User total wins: " + userWins);

        String winner = "name";
         if (computerWins > userWins) {
            winner = "The grand winner is the COMPUTER";
        } else if (computerWins < userWins) {
             winner = "The grand winner is the USER";
        } else {
             winner = "It is a Tie";
        }
        System.out.println(" ");
        System.out.println(winner);

    }

}