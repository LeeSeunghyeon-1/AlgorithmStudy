package week007.day1;

public class SJG_01 {
    public static int[] solution(int[] arr, int[][] queries) {
        for (int[] query : queries) {
            int i = query[0];
            int j = query[1];
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        return arr;
    }
}