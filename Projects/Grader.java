public class Grader {

        //works allongside with graderTest to give examples of how to test your own code
    public char determineLeterGrade(int numberGrade){

        if(numberGrade < 0){
            throw new IllegalArgumentException("number grade cannot be less than zero");
        }

        else if(numberGrade < 60){
            return 'F';
        }

        else if(numberGrade < 70){
            return 'D';
        }

        else if(numberGrade < 80){
            return 'C';
        }
        else if(numberGrade < 90){
            return 'B';
        }

        else{
            return 'A';
        }
    }
    
}
