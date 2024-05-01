package string;
import java.util.Scanner;

public class StringToSubString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int len = str.length() / num;
        int q = str.length() - len * num;
        int m = 0;

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < len; j++) {
                System.out.print(str.charAt(m));
                m++;
            }
            if (q > 0) {
                System.out.print(str.charAt(m));
                m++;
                q--;
            }
            System.out.println();
        }
    }
}
