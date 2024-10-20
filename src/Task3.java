import java.util.Scanner;
public class Task3{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int [n];
        for(int i = 0; i < n; i++)
        {
            a[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++)
        {
            if(i == 0 || a[i] != a[i - 1])
                System.out.print(a[i] + " ");
        }
    }
}