import java.util.Scanner;

/*This small project is an experiment to see if I can add swtich cases to my choose your own adventure game */
public class switchtest{


    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        playerTurn(scanner);

        scanner.close();
    }


    private static void playerTurn(Scanner scanner){
        String userInput;
        while(true){
            System.out.println("Please select your choice");
            userInput = scanner.nextLine();
            if(isValid(userInput)){
                break;
            }
            
            else{
                System.out.println("Not a valid choice");
            }
            
        }
    }


    private static boolean isValid(String userInput) {
        switch(userInput){
            case "a":
                return true;
            case "b":
                return true;
            case "c":
                return true;
            default:
                return false;
        }
        
    }

    // check if char matches palyer input 
}