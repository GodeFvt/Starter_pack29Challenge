import java.util.Scanner;

public class MinMaxExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("ป้อนค่า a: ");
        int a = scanner.nextInt();

        System.out.print("ป้อนค่า b: ");
        int b = scanner.nextInt();

        System.out.print("ป้อนค่า c: ");
        int c = scanner.nextInt();

        int min = a;
        int max = a;

        if (b < min) {
            min = b;
        }
        if (c < min) {
            min = c;
        }

        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }

        System.out.println("ค่าต่ำสุด (Min): " + min);
        System.out.println("ค่าสูงสุด (Max): " + max);
    }
}
