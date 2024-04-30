package string;

public class insertString {
public static void main(String[] args) {
	String str1="I am student of iftm university";
	String str2="I am Akash, ";
	for(int i=0;i<str1.length();i++) {
		str2+=str1.charAt(i);
	}
	System.out.println(str2);
}
}
