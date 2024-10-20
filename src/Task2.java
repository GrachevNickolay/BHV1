import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        boolean flag = true;
        String ans = "";
        int n = s.length();
        for(int i = 0; i < n; i++) {
            int cnt = 1;
            while(i + 1 < n && s.charAt(i) == s.charAt(i + 1)) {
                cnt++;
                i++;
            }
            if(cnt > 1 || flag == true) {
                ans += String.valueOf(s.charAt(i)) + cnt;
                flag = true;
            }
            else {
                int x = i;
                while (i + 1 < n && s.charAt(i) != s.charAt(i + 1)) {
                    cnt++;
                    i++;
                }
                ans += "-" + cnt + s.substring(x, i + 1);
                flag = false;
            }
        }
        System.out.println(ans);
    }
}