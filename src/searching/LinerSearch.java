package searching;

public class LinerSearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 5, 3, 2};
        int target = 4;
        //search
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println("True");
                break;
            }
        }
    }
}
