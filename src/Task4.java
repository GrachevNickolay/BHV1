import java.util.Arrays;
import java.util.Scanner;
public class Task4 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        for(int i = 0; i < s1.length(); i++){
            if(c1[i] >= 'a' && c1[i] <= 'z'){
                c1[i] = (char) (c1[i] - 'a' + 'A');
            }
        }
        for(int i = 0; i < s2.length(); i++){
            if(c2[i] >= 'a' && c2[i] <= 'z'){
                c2[i] = (char) (c2[i] - 'a' + 'A');
            }
        }
        Arrays.sort(c1);
        Arrays.sort(c2);
        if(Arrays.equals(c1, c2)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}