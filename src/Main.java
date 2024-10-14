import java.util.Scanner;
public class Main {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        while(n > 0)
        {
            if(n % 10 != 0 && cnt == 0)
                cnt++;
            if(cnt != 0 && n % 10 == 0 || n % 10 != 0)
                System.out.print(n % 10);
            n /= 10;
        }
    }
}