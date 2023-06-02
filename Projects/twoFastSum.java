import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/*
 * version 1.0 
 * added twosum method 
 * 
 * version 1.1 
 * updated the two sum method to use a hashmap for a faster and more efficient program
 * 
 * version 2.0
 * added lengthOfLongestSubstring method to find the length of the longest substring in any given string
 * 
 * version 2.1
 * updated lengthOfLongestSubstring mthod to use indexOf in order to increase both speed and efficiency of the sliding window
 * algorithm
 * 
 * version 3.0 
 * added a sudoku board
 * 
 * version 3.1
 * created helper method isNumberInRow to help find numbers in a row for the sudoku solver
 * created helper method isNumberInCol to help find numbers in a col for the sudoku solver
 * created helper method isNumberInBox to help find numbers in local box
 * created helper method isValidPlacement to help check if the number to be placed is valid or not
 * created solveBoard method that uses the previously mentioned helper methods to recursivly solve a sudoku board
 * created printBoard method to print out the sudou board
 * 
 * version 3.2
 * created a fibonacci series method
 * 
 * version 3.2.1
 * added a long[] to help immplement memoization in the fibonacci series
 * using longs this method can find up to the 92nd fibonacci number
 * 
 * version 3.3
 * added Insertion sort algorithm
 */

public class twoFastSum {

    private static final int GRID_SIZE = 9;
    private static long[] fibonacciCache;
    
    public static void main(String[] args) {

        /* 
        // fib
        int n = 50;
        fibonacciCache = new long[n+1];

        for(int i = 0; i <= n; i++){
            System.out.println("Fibonacci number "+ fibonacci(i));
        }
        */

        //insertion sort
        Random rand = new Random();
        int[] numbers = new int[10];
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = rand.nextInt(100);
        }
        System.out.println("Before: ");
        for(int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }
        insertionSort(numbers);

        System.out.println("\nAfter: ");
        for(int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }

        /*
        // twoSums
        int[] test = new int[]{5,2,4};
        int tar = 6;
        twoSum(test, tar);

        //length of longestSubstring
        String stest = "abcabcbb";
        lengthOfLongestSubstring(stest);

        //Sudoku
        int[][] board = {
            {7,0,2,0,5,0,6,0,0},
            {0,0,0,0,0,3,0,0,0},
            {1,0,0,0,0,9,5,0,0},
            {8,0,0,0,0,0,0,9,0},
            {0,4,3,0,0,0,7,5,0},
            {0,9,0,0,0,0,0,0,8},
            {0,0,9,7,0,0,0,0,5},
            {0,0,0,2,0,0,0,0,0},
            {0,0,7,0,4,0,2,0,3}
        };

        printBoard(board);

        if(solveBoard(board)){
            System.out.println("Solved successfully ");
        }
        else{
            System.out.println("Unsolvable");
        }

        printBoard(board);
        
        */

    }
    
    
    //prints out sudoku board
    private static void printBoard(int[][] board) {
        for(int row = 0; row < GRID_SIZE; row++ ){
            if(row % 3 == 0 && row != 0){
                System.out.println("-----------");
            }
            for(int col = 0; col < GRID_SIZE; col++){
                if(col % 3 == 0 && col != 0){
                    System.out.print("|");
                }
                System.out.print(board[row][col]);
            }
            System.out.println();
        }
    }



    public static int[] twoSum(int[] nums, int target){
        Map<Integer,Integer> complements = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            Integer complementIndex = complements.get(nums[i]);
            if(complementIndex != null){
                return new int[]{i, complementIndex};
            }
            complements.put(target - nums[i], i);
            //System.out.println(complements);
        }
        return nums;
    }
    /*
     * {5,2,4}
     * 6
     * HashMap
     * K -> V
     * 1 -> 0
     * 4 -> 1
     */

    //Longest substring without repeating characters
    // also known as the sliding window algorithm
    public static int lengthOfLongestSubstring(String s){
        int maxLength = 0;
         
        for(int rightp = 0, leftp = 0; rightp < s.length(); rightp++){
            int locOfFirstChar = s.indexOf(s.charAt(rightp), leftp);
            if(locOfFirstChar != rightp){
                leftp = locOfFirstChar + 1;
            }
            maxLength = Math.max(maxLength, rightp - leftp +1);
            
        }
        return maxLength;
    }

    private static boolean isNumberInRow(int[][] board, int number, int row){
        for(int i = 0; i < GRID_SIZE; i++){
            if(board[row][i] == number){
                return true;
            }
        }
        return false;
    }

    private static boolean isNumberInCol(int[][] board, int number, int col){
        for(int i = 0; i < GRID_SIZE; i++){
            if(board[i][col] == number){
                return true;
            }
        }
        return false;
    }

    private static boolean isNumberInBox(int[][] board, int number, int row, int col){
        int localBoxRow = row - row % 3;
        int localBoxCol = col - col % 3;

        for(int i = localBoxRow; i < localBoxRow; i++){
            for(int j = localBoxCol; j < localBoxCol + 3; j++){
                if(board[i][j] == number){
                    return true;
                }
            }
        }

        return false;
    }

    private static boolean isValidPlacement(int[][] board, int number, int row, int col){

        return !isNumberInRow(board, number, row) && !isNumberInCol(board, number, col) && !isNumberInBox(board, number, row, col);
    }

    private static boolean solveBoard(int[][] board){
        for(int row = 0; row < GRID_SIZE; row++){
            for(int col= 0; col < GRID_SIZE; col++){
                if(board[row][col] == 0){
                    for(int numtoTry = 1; numtoTry <= GRID_SIZE; numtoTry++){
                        if(isValidPlacement(board, numtoTry, row, col)){
                            board[row][col] = numtoTry;
                            if(solveBoard(board)){
                                return true;
                            }
                            else{
                                board[row][col] = 0;
                            }
                        }
                    }
                    return false;
                }
            }
        }
        return true;
        
    }

    private static long fibonacci(int n){
        if(n <= 1){
            return n;
        }
        if(fibonacciCache[n] != 0){
            return fibonacciCache[n];
        }

        long nthFibonacciNumber = (fibonacci(n-1) + fibonacci(n-2));
        fibonacciCache[n] = nthFibonacciNumber;

        return nthFibonacciNumber;
    }

    private static void insertionSort(int[] inputArray){
        for(int i = 1; i < inputArray.length; i++){
            int currentValue = inputArray[i];

            int j = i - 1;
            while(j >= 0 && inputArray[j] > currentValue){
                inputArray[j+ 1] = inputArray[j];
                j--;
            }
            inputArray[j + 1] = currentValue;
        }
    }

}
