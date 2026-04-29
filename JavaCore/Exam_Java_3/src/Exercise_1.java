import java.util.Random;
import java.util.Scanner;

public class Exercise_1 {
    public static void question1() {
        float salary1 ;
        float salary2 ;
        salary1 =(float) 5240.5 ;
        salary2 =(float) 10970.055;
        System.out.println("Lương 1:" + salary1 + "|| Lương 2: " + salary2);
        System.out.printf("%.1f"+ salary1);
        System.out.println("%.3f" + salary2);
    }
    public static void question2() {
        Random random = new Random();
        int number = random.nextInt(10000);
        String formatNumder = String.format("@05d" + number);
        System.out.println("Số ngẫu nhiên của bạn là " + number);
    }
    public static void question3() {
        
    }
    public static void question4() {
        int a, b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập a = ");
        a = scanner.nextInt();
        do {
            System.out.println("Nhập b = ");
            b = scanner.nextInt();
            if (b == 0) {
                System.out.println("Vui lòng nhập b khác 0 !");
            }
        } while (b == 0);

        scanner.close();

        System.out.println("Thương: " + (float) a / (float) b);
    }




}

