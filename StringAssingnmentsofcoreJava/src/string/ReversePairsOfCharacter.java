package string;

public class ReversePairsOfCharacter {
public static void main(String[] args) {
	String str = "Hello, world!";
    char[] ch= str.toCharArray();
    for (int i = 0; i < ch.length - 1; i+=2) {
        char temp = ch[i];
        ch[i] = ch[i + 1];
        ch[i + 1] = temp;
    }
    
    System.out.print("Original string: " + str + "\nString after swapping pairs: ");
    System.out.println(ch);
	}
}

