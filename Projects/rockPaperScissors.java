import java.util.Random;

public class rockPaperScissors{

    public static void main(String[] args){

        String rock = "rock";
        String paper = "paper";
        String scissors = "scissors";
        String[] computerMoves = new String[]{"rock", "paper", "scissors"};
        String computerMove = computerChoice(computerMoves);
        

        System.out.println(shoot(scissors, computerMove));
    }

    public static String shoot(String playerMove, String computerChoice){

        System.out.println("Rock....Paper...Scissors...Shoot!");
        System.out.println("You choose " + playerMove +"\n");
        System.out.println("Computer choose " + computerChoice);

        // if tie
        if((playerMove == "rock" && computerChoice == "rock") || (playerMove == "paper" && computerChoice == "paper") || (playerMove == "scissors" && computerChoice == "scissors")){
            return "there was a tie would you like to go again?";
        }
        //player wins
        if((playerMove == "rock" && computerChoice == "scissors") || (playerMove == "paper" && computerChoice == "rock") || (playerMove == "scissors" && computerChoice == "paper")){
            return "You win!";
        }
        // player loses
        else{
            return "you lose!";
        }
    }

    public static String computerChoice(String[] computerMoves){
        int rnd = new Random().nextInt(computerMoves.length);
        return computerMoves[rnd];
    }

}