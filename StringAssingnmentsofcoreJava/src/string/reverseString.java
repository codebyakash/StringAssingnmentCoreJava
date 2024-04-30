package string;

public class reverseString {
public static void main(String[] args) {
	String str="apple";
	String str2="";
	for(int i=str.length()-1;i>=0;i--) {
		str2+=str.charAt(i);
	}
	str=str2;
	System.out.println(str);
}
}
