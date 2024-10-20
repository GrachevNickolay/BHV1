import java.util.Scanner;
public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[n][];
        for (int i = 0; i < n; i++) {
            a[i] = new int[i + 1];
            for (int j = 0; j <= i; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        for (int i = a.length - 2; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                a[i][j] += Math.max(a[i + 1][j], a[i + 1][j + 1]);
            }
        }
        int ans = a[0][0];
        System.out.println(ans);
    }
}
