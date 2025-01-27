// public class SearchInRotatedArray {

//     public static int getPivot(int[] arr) {
//         int l = 0, r = arr.length - 1;
//         while (l < r) {
//             int mid = (l + r) / 2;
//             if (arr[mid] > arr[mid + 1]) {
//                 return mid;
//             }
//             if (arr[mid] < arr[mid - 1]) {
//                 return mid - 1;
//             }
//             if (arr[mid] > arr[l]) {
//                 l = mid + 1;
//             } else {
//                 r = mid - 1;
//             }
//         }
//         return l;
//     }

//     public static void main(String[] args) {
//         int[] arr = { 5, 6, 7, 8, 9, 10, 1, 2, 3 };
//         int pivot = getPivot(arr);

//         if (pivot != -1) {
//             System.out.println("Pivot element is: " + arr[pivot] + " at index: " + pivot);
//         } else {
//             System.out.println("The array is not rotated.");
//         }
//     }

// }

public class SearchInRotatedArray {

    public static int search(int[] nums, int target) {
        int l = 0, r = nums.length - 1;
        while (l <= r) {
            int mid = (l + r) / 2;

            // check if mid element is target
            if (nums[mid] == target) {
                return mid;
            }

            // check if left half is sorted
            if (nums[l] <= nums[mid]) {
                if (nums[l] <= target && target < nums[mid]) {
                    r = mid - 1;
                } else {
                    l = mid - 1;
                }
            }
            // otherwise right half is sorted
            else {
                // if target lies within the right half
                if (nums[mid] < target && target <= nums[r]) {
                    l = r - 1;
                } else {
                    r = mid - 1;
                }
            }
        }
        // if target is not present
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = { 5, 6, 7, 8, 9, 10, 1, 2, 3 };
        int target = 1;

        int index = search(nums, target);

        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
}