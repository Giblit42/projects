import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class leetCodePQTest {

    @Test
    void testMerge() {
        leetCodePQ solution = new leetCodePQ();
        int[] result = solution.merge(new int[]{1,3}, new int[]{2});
        assertArrayEquals(new int[] {1,2,3}, result);
    }
    
    
}
