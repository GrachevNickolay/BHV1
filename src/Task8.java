import java.util.Scanner;
public class Task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char s = 'A', f = 'C', buf = 'B';
        if (n % 2 == 0) {
            char c = f;
            f = buf;
            buf = c;
        }
        int sum = (int) Math.pow(2, n) - 1;
        for (int i = 1; i <= sum; i++) {
            char x1, x2;
            if (i % 3 == 1) {
                x1 = s;
                x2 = f;
            }
            else if (i % 3 == 2) {
                x1 = s;
                x2 = buf;
            }
            else {
                x1 = buf;
                x2 = f;
            }
            int ans = 0;
            if (i % 2 == 1) {
                ans = (i + 1) / 2;
            }
            else {
                ans = i / 2;
            }
            System.out.println("Move disk " + ans + " from " + x1 + " to " + x2);
        }
    }
}