import java.util.Random;

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
}
