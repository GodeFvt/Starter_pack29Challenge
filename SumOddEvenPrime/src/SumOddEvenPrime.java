import java.util.Scanner;

public class SumOddEvenPrime {

    // เมธอดสำหรับตรวจสอบว่าเลข num เป็นเลขเฉพาะหรือไม่
    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= num * num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ป้อนตัวเลขที่ต้องการหาผลบวก: ");
        int n = scanner.nextInt();

        int sumOdd = 0;
        int sumEvenPrime = 0;

        System.out.println("ผลบวกของเลขคู่และเลขคี่ที่น้อยกว่าหรือเท่ากับ " + n + " คือ:");

        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                // เลขคู่
                System.out.println(i + " (เลขคู่)");
                sumEvenPrime += isPrime(i) ? i : 0;
            } else {
                // เลขคี่
                System.out.println(i + " (เลขคี่)");
                sumOdd += i;
            }
        }

        System.out.println("ผลบวกของเลขคู่ที่เป็นจำนวนเฉพาะที่น้อยกว่าหรือเท่ากับ " + n + " คือ: " + sumEvenPrime);
        System.out.println("ผลบวกของเลขคี่ที่มีค่าน้อยกว่าหรือเท่ากับ " + n + " คือ: " + sumOdd);
    }
}
