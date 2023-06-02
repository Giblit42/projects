import java.util.Random;

public class yatzee {
    /*
     * This class will demonstrate randomly rolling a dice between 1 and 6
     * then storring it in an array to represent 5 dice rolled 
     * and finally Yahtzee rules will be applied so you can see how many points you earned 
     * and there will be a computer player as well
     */
     
    public static void main(String[] args) {
        int minNum = 1;
        int maxNum = 6;
        int currentRolledNum = 0;
        int[] coppiedArray =  new int[5]; // the purpose of this array 
         

        for(int i = 0; i < 5; i++){ // this for loop will roll the die one at a time 
            currentRolledNum = diceRoll(minNum, maxNum);// store the currently rolled number 
            coppiedArray[i] = currentRolledNum;
            printDiceRolls(currentRolledNum);
            fiveDiceRoll(currentRolledNum);
        } 
        
        highestScore(fiveDiceRoll(currentRolledNum));
        
        
         
    }

    private static int diceRoll(int min, int max){ // this method will roll a 6 -sided dice and get a random number between 1 and 6
        Random rand = new Random();

        int rolledNum = rand.nextInt((max - min) + 1) + min;

        return rolledNum;
    }

    private static int[] fiveDiceRoll(int currentRolledNum){ // this array stores the last five roles that the player made 
        int[] fiveDice = new int[5];
        int ptr = 0;
        fiveDice[ptr] = currentRolledNum;
        //System.out.println("five dice roll " + fiveDice[ptr]);
        ptr++;
        return fiveDice;
    }

    private static void printDiceRolls(int currentRolledNum){
        if(currentRolledNum == 1){
            System.out.println("* * * * *");
            System.out.println("*       *");
            System.out.println("*   #   *");
            System.out.println("*       *");
            System.out.println("* * * * *\n");       
        }
        if(currentRolledNum == 2){
            System.out.println("* * * * *");
            System.out.println("*     # *");
            System.out.println("*       *");
            System.out.println("* #     *");
            System.out.println("* * * * *\n");
        }
        if(currentRolledNum == 3){
            System.out.println("* * * * *");
            System.out.println("*     # *");
            System.out.println("*   #   *");
            System.out.println("* #     *");
            System.out.println("* * * * *\n");
        }
        if(currentRolledNum == 4){
            System.out.println("* * * * *");
            System.out.println("* #   # *");
            System.out.println("*       *");
            System.out.println("* #   # *");
            System.out.println("* * * * *\n");
        }
        if(currentRolledNum == 5){
            System.out.println("* * * * *");
            System.out.println("* #   # *");
            System.out.println("*   #   *");
            System.out.println("* #   # *");
            System.out.println("* * * * *\n");
        }
        if(currentRolledNum == 6){
            System.out.println("* * * * *");
            System.out.println("* #   # *");
            System.out.println("* #   # *");
            System.out.println("* #   # *");
            System.out.println("* * * * *\n");
        }     
    }

    private static int highestScore(int[] fiveDiceRoll){
        //loop through stored dice rolls and calculate score of the user

        int oneCount = 0;
        int twoCount = 0;
        int threeCount = 0;
        int fourCount = 0;
        int fiveCount = 0;
        int sixCount = 0;

        for(int i = 0; i < fiveDiceRoll.length; i++){

            if(fiveDiceRoll[i] == 1){
                oneCount = oneCount + 1;
            }
            if(fiveDiceRoll[i] == 2){
                twoCount = twoCount + 1;
            }
            if(fiveDiceRoll[i] == 3){
                threeCount = threeCount + 1;
            }
            if(fiveDiceRoll[i] == 4){
                fourCount = fourCount + 1;
            }
            if(fiveDiceRoll[i] == 5){
                fiveCount = fiveCount + 1;
            }
            if(fiveDiceRoll[i] == 6){
                sixCount = sixCount + 1;
            }
        }

        /*UPPER SECTION */ //Might convert upper section into its own method
        
        //Aces(sum of dice with one's)
        int Aces = oneCount;
        System.out.println("This is Aces " + Aces);

        //Twos(sum of dice with two's)
        int Twos = twoCount;
        System.out.println("This is Twos " + Twos);

        //Threes(sum of dice with three's)
        int Threes = threeCount;
        System.out.println("This is Threes " + Threes);

        //Fours(sum of dice with four's)
        int Fours = fourCount;
        System.out.println("This is fours " + Fours);

        //Fives(sum of dice with five's)
        int Fives = fiveCount;
        System.out.println("This is fives " + Fives);

        //Sixes(sum of dice with six's)
        int Sixes = sixCount;
        System.out.println("This is sixes " + Sixes);

        if(Sixes > Fives && Sixes > Fours && Sixes > Threes && Sixes > Twos && Sixes > Aces){
            return Sixes;
        }
        if(Fives > Sixes && Fives > Fours && Fives > Threes && Fives > Twos && Fives > Aces){
            return Fives;
        }
        if(Fours > Sixes && Fours > Fives && Fours > Threes && Fours > Twos && Fours > Aces){
            return Fours;
        }
        if(Threes > Sixes && Threes > Fives && Threes > Fours && Threes > Twos && Threes > Aces){
            return Threes;
        }
        if(Twos > Sixes && Twos > Fives && Twos > Fours && Twos > Threes && Twos > Aces){
            return Twos;
        }
        if(Aces > Sixes && Aces > Fives && Aces > Fours && Aces > Threes && Aces > Twos){
            return Aces;
        }

        /*LOWER SECTION */

        //scoring for 3 of a kind(sum of all dice)

        //scoring for 4 of a kind(sum of all dice)

        //full house (three fo one number two of another)(25)
        
        //small straight sequence of 4 (30)

        //large straight sequence of 5 (40)

        //scoring for 5 of a kind (Yahtzee)(50 pts)

        //chance (sum of all dice)
        else{
            return 0;
        }
        
    }
}
