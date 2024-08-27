// Sample Input 2:
// 7
// 1 2 3 4 5 6 7
// 9
// Sample Output 2:
// -1
package Recursion2;

public class BinarySearch {

    public static int search(int[] nums, int target) {
        // Start the binary search with the entire range of the array
        return helper(nums, target, 0, nums.length - 1);
    }
    
    public static int helper(int[] nums, int target, int low, int high) {
        // Base case: if the range is invalid
        if (low > high) {
            return -1; // Target not found
        }
    
        // Calculate the middle index
        int mid = (low+high) / 2;
    
        // Check if the middle element is the target
        if (nums[mid] == target) {
            return mid; // Return the index of the target
        } 
        // If the target is greater, search in the right half
        else if (nums[mid] < target) {
            return helper(nums, target, mid + 1, high);
        } 
        // If the target is smaller, search in the left half
        else {
            return helper(nums, target, low, mid - 1);
        }
    }
    
    public static void main(String[] args) {
            
        int num[] = {2,4,1,6,4,32,5,3,6,4,56,64};
        int target = 4;
        System.out.println(search(num, target));
    }
    }