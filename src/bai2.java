public class bai2 {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};

        System.out.print("arr : ");
        int sum = 0;

        int max = arr[0];

        for (int i : arr) {

            sum += i;

            System.out.print(i + " ");
            if (max < i) {

                max = i;

            }

        }

        System.out.println(" ");

        System.out.println("sum arr = " + sum);

        System.out.println("max arr = " + max);

    }

}