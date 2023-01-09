public class bai2 {
    public static void main(String[] args) {
        int[] soNguyen = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(" tổng các phần tử của mảng là :");
        int result = 0;
        for (int i = 0; i < soNguyen.length; i++) {
            result = result + soNguyen[i];
        }
        System.out.println(result);
        int max = soNguyen[0];
        for (int i = 0; i < soNguyen.length; i++) {
            if (soNguyen[i] >= max) {
                max = soNguyen[i];
            } else {
                max = soNguyen[0];
            }
        }
        System.out.println(max);
    }
}