import java.util.Scanner;
public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        while (b != 0) {
            int sum = a ^ b;
            int buf = (a & b) << 1;
            a = sum;
            b = buf;
        }
        System.out.println(a);
    }
}
