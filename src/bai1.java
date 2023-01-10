import java.util.Scanner;
public class bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhập vào 1 số: ");
        int numbers = scanner.nextInt();
        for (int i = 2; i < numbers; i++) {
            boolean kiemtra = true;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    kiemtra = false;
                    break;
                }
            }
            if (kiemtra) {
                System.out.println(i);
            }
        }
    }
}