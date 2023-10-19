
/**
 * Do not copy your answers from online sources.
 * Doing so will have consequences on rest of your courseworks.
 */
import java.util.ArrayList;
 public class Solution {
    /**
     * Given a signed x, return x with its digits reversed. Example: 321 => 123
     * Example: -3210 => -123
     */

    public int reverseInt(int x) {
        int save = 0;
        while(x != 0) {  
            int remainder = x % 10;
            save = save * 10 + remainder; 
            x /= 10;  
                }  
                return save;
            }  

    /**
     * Given a non-empty array of decimal digits representing a non-negative
     * integer, increment one to the integer.
     *
     * Example: Input: digits = [1,2,3] Output: [1,2,4]
     *
     * Example: Input: digits = [1,2,9] Output: [1,3,0]
     */

    public int[] plusOne(int[] digits) {
        ArrayList<Integer> storage = new ArrayList<Integer>();
        if (digits == null || digits.length == 0) {
            int[] nonEmp = {1};
            return nonEmp;
                }
                int remainder = 0;
                for (int i = digits.length - 1; i >= 0; i--) {
                        if (i == digits.length - 1) {
                                remainder = remainder + digits[i] + 1;
                        } else {
                                remainder+= digits[i];
                        }
                        storage.add(0, remainder % 10);
                        remainder /= 10;
                }
                if (remainder == 1) {
                        storage.add(0, 1);
                }
                int outputArray[] = new int[storage.size()];
                for (int i = 0; i < storage.size(); i++) {
                        outputArray[i] = storage.get(i);
                }
                return outputArray;
        }

}