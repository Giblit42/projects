public class leetCodePQ{
    
        public static void main(String[] args) {
            
            int[] nums1 = new int[]{1,3};
            int[] nums2 = new int[]{2};

            double result = findMedianSortedArray(nums1, nums2);

            System.out.println(result);

        }
    // This class contians practice Leet code questions
    


    /*Problem 1 
     * Median of two sorted arrays 
     * 
     * Given two sorted arrays nums1 and nums2  of size n and m respectivly 
     * return the median of  the two sorted arrays 
     * 
     * the overall runtime should be O(log(m + n))
     */
    public static double findMedianSortedArray(int[] nums1, int[] nums2){
        int[] mergedNums = merge(nums1, nums2);

        //if odd return middle element
        if(mergedNums.length % 2 == 1){
            return mergedNums[mergedNums.length / 2];
        }
        //if even find the average of the middle two elements
        
        return ((double)mergedNums[mergedNums.length / 2] + (double)mergedNums[(mergedNums.length / 2) - 1]) / 2;
    }

    public static int[] merge(int[] nums1, int[] nums2){
        // will need to loops to combine both arrays into one array
        int[] sortedNums = new int[nums1.length + nums2.length];
        int i = 0; //pointer for nums1
        int j = 0; // pointer for nums2
        int k = 0; // iterator for loop
        while(i < nums1.length && j < nums2.length){
            if(nums1[i] < nums2[j]){
                sortedNums[k] = nums1[i];
                i++;
            }
            else{
                sortedNums[k] = nums2[j];
                j++;
            }
            k++;
        }
        //anything else remaining in nums1
        while(i < nums1.length){
            sortedNums[k] = nums1[i];
            i++;
            k++;
        }
        //anything else remaining in nums2
        while(j < nums2.length){
            sortedNums[k] = nums2[j];
            j++;
            k++;
        }
        for(int l = 0; l < sortedNums.length; l++){
            System.out.println(sortedNums[l]);
        }
        
        return sortedNums;
    }
}