package Arrays;

public class MissingNum {

    public static int findMissing(int[] arr) {
        int n = arr.length + 1;

        int totalSum = (n * (n + 1)) / 2; // expected sum
        int currentSum = 0;

        for (int i = 0; i < arr.length; i++) {
            currentSum += arr[i];
        }

        return totalSum - currentSum;
    }

    public static void main(String[] args) {
        int result = findMissing(new int[]{8, 2, 4, 5, 3, 7, 1});
        System.out.println(result);
    }
}