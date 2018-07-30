package pl.kordulewski.codility.lesson_00_demo_task;

/**
 * Test Score: 100% (free evaluation report)
 *
 * The best benchmark result.
 */
public class Solution7 implements SolutionInterface {
    
    private static final int CRITICAL_SIZE = 500000;
    
    public int solution(int[] A) {
        if (A.length < CRITICAL_SIZE) {
            return new Solution1().solution(A);
        } else {
            return new Solution6().solution(A);
        }
    }
    
}
