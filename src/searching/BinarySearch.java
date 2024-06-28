package searching;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6, 7, 8};
        int target = 1;
        System.out.println(binarySearch(arr, target));

    }

    // it only works on sorted arrays
    public static boolean binarySearch(int[] arr, int target) {
        int s = 0;
        int e = arr.length - 1;

        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (arr[mid] == target) {
                return true;
            }
            if (target < arr[mid]) {
                e = mid-1;
            } else {
                s = mid+1;
            }
        }
        return false;
    }
}
