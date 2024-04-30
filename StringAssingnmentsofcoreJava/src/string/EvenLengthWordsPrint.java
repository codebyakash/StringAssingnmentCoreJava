package string;

public class EvenLengthWordsPrint {
    public static void main(String[] args) {
        String st = "Aakash is a good boy.";

        boolean inWord = false;
        int start = 0;

        for (int i = 0; i <= st.length(); i++) {
            if (i == st.length() ||st.charAt(i)==' ') {
                if (inWord) {
                    int ln = i - start;
                    if (ln % 2 == 0) {
                        for (int j = start; j < i; j++) {
                            System.out.print(st.charAt(j));
                        }
                        System.out.println();
                    }
                    inWord = false;
                }
            } else if (!inWord) {
                start = i;
                inWord = true;
            }
        }
    }
}

