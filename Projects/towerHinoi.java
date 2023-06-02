

public class towerHinoi {
    
    /*This project will be an attempt at making the tower of hinoi problem
     * with visuals and using user interaction to solve it
     */

     public static void main(String[] args) {
        int N = 3;
        // Letters A, B, and C are the names of the rods
        hinoiTower(N, 'C', 'B', 'A');
     }

     /*
      * this first method will solve the tower of hinoi problem in seven moves recursively 
      */
     public static void hinoiTower(int n, char from_rod, char to_rod, char helper_rod){
         if(n == 0){
            return;
         }
         hinoiTower(n-1, from_rod, helper_rod, to_rod);
         System.out.println("Move disk " + n + " from rod " + from_rod + " to_rod " + to_rod);
         hinoiTower(n-1, helper_rod, to_rod, from_rod);
     }
}
