package string;
public class reverseStringleftFirstWord {
    public static void main(String[] args) {
        String str = "My name is Aman kumar";
        String[] st = str.split(" ");
        System.out.print(st[0] + " ");
        for (int i = 1; i < st.length; i++) {
            for (int j = st[i].length() - 1; j >= 0; j--) {
                System.out.print(st[i].charAt(j));
            }
            System.out.print(" "); 
        }
    }
}
