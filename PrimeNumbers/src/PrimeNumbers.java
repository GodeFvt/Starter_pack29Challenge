import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {

        int N ; // ค่า N ที่เราต้องการหาจำนวนเฉพาะที่น้อยกว่าหรือเท่ากับ N

        Scanner sc = new Scanner(System.in);
        System.out.print("Insert Prime Number : ");
        Scanner in = new Scanner(System.in); // สร้างตัวแปร Scanner
        N = in.nextInt(); //รับค่า N เข้ามาทางแป้นพิมพ์

        // ใช้ for loop เพื่อวนลูปตั้งแต่ 2 ถึง N
        for (int i = 2; i <= N; i++) {
            boolean isPrime = true; // สร้างตัวแปร isPrime เพื่อเก็บสถานะของจำนวนเฉพาะ

            // ใช้ for loop เพื่อตรวจสอบว่า i มีหารลงตัวหรือไม่
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    isPrime = false; // ถ้ามีตัวเลขที่หารลงตัว i แล้วกำหนดให้ isPrime เป็น false
                    break; // ออกจากลูปทันทีเนื่องจากไม่ต้องตรวจสอบตัวเลขที่เหลือ
                }
            }

            // พิมพ์จำนวนเฉพาะที่น้อยกว่าหรือเท่ากับ N
            if (isPrime) {
                System.out.println(i);
            }
        }
    }
}
