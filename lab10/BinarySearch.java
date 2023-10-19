	/**
* A class that kth positive integer that is missing from this array
* All methods are static and belong to the class.
*
* @author	Jumana Suleiman 
* @version	05/12/2022
*/
// Implement concept of BinarySearch algorithm to solve the problem.
import java.util.Arrays;
public class BinarySearch {
    /**
	* Prints out a String representation of an array.
	*
	* @param	int[]	arr
	* @param	int	k
	
	* @return	int
	*/
    
    public static int findKthPositive(int[] arr, int k) {
    //Initialize search boundaries: left = 0, right = arr.length - 1.
    	int left = 0; 
    	int right = arr.length -1;
    	int pivot = left + (right - left) / 2;
	//While left <= right:
    	while(left <= right){
		//Choose the pivot index in the middle: pivot = left + (right - left) / 2. Note that in Java we couldn't use straightforward pivot = (left + right) / 2 to avoid the possible overflow. 		In Python, the integers are not limited, and we're fine to do that.
		//If the number of positive integers which are missing before is less than k arr[pivot] - pivot - 1 < k - continue to search on the right side of the array: left = pivot + 1.
		if(arr[pivot] - (pivot + 1) <k)
			left = pivot +1;
		//Otherwise, continue to search on the left: right = pivot - 1.
		else 
			right = pivot -1;
	}
	//At the end of the loop, left = right + 1, and the kth missing number is in-between arr[right] and arr[left]. The number of integers missing before arr[right] is arr[right] - right - 1. Hence, 		the number to return is arr[right] + k - (arr[right] - right - 1) = k + left.
    	return k + left;
    }
}
