public class binarySearch {

    /*In order for Binary search to work your array has to be sorted.  
     * Since the array is already sorted we start at the middle of the
     *  array and move left or right depending on if the number we are 
     * looking for is bigger or smaller than the element we are currently
     *  viewing
    */

    public static void main(String[] args){

        int[] intArr = new int[]{1,2,4,5,7,9,11};
        int numToFind = 3;

        System.out.print(BinarySearch(intArr, numToFind));

    }

    // even though it is unconventional to capitalize a method I needed to otherwise it would have been a constructor
    private static int BinarySearch(int[] intArr, int numToFind){
        int lowPointer = 0;
        int highPointer = intArr.length -1;

        while(lowPointer <= highPointer){
            int middlePosition = (lowPointer + highPointer) / 2;
            int middleNum = intArr[middlePosition];

            if(numToFind == middleNum){
                return middlePosition;
            }
            if(numToFind < middleNum){
                highPointer = middlePosition -1;
            }
            else{
                lowPointer = middlePosition + 1;
            }
        }
        return -1;
    }
    
}
