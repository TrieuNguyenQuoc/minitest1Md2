import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        System.out.println("arr: " + Arrays.toString(arr));

        int sum = sumArr(arr);
        System.out.println("sum arr = " + sum);

        int max = maxArr(arr);
        System.out.println("max arr = " + max);
    }
    public static int sumArr(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }
    public static int maxArr(int[] arr) {
        int max = arr[0];
        for (int i : arr) {
            if (max < i) {
                max = i;
            }
        }
        return max;
    }
}