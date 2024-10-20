import java.util.Scanner;
public class Main{
    public static void fun(int n, char s, char f, char buf) {
        if (n == 1) {
            System.out.println("Move disk 1 from " + s + " to " + f);
            return;
        }
        fun(n - 1, s, buf, f);
        System.out.println("Move disk " + n + " from " + s + " to " + f);
        fun(n - 1, buf, f, s);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fun(n, 'A', 'C', 'B');
    }
}