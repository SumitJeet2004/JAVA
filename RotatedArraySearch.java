public class RotatedArraySearch {
    public static int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2; // Calculate the mid index

            if (nums[mid] == target) {
                return mid; // Target found
            }

            // Check if the left half is sorted
            if (nums[left] <= nums[mid]) {
                // Target in the sorted left half?
                if (nums[left] <= target && target < nums[mid]) {
                    right = mid - 1; // Narrow down to the left half
                } else {
                    left = mid + 1; // Narrow down to the right half
                }
            } 
            // Else, the right half must be sorted
            else {
                // Target in the sorted right half?
                if (nums[mid] < target && target <= nums[right]) {
                    left = mid + 1; // Narrow down to the right half
                } else {
                    right = mid - 1; // Narrow down to the left half
                }
            }
        }
        return -1; // Target not found
    }

    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int target = 5;

        int index = search(nums, target);
        if (index != -1) {
            System.out.println("Target found at index: " + index);
        } else {
            System.out.println("Target not found");
        }
    }
}
