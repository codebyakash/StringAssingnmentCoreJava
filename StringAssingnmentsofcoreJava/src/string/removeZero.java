package string;

public class removeZero {
public static void main(String[] args) {
	String str="8077034803";  //My Mo.
	for(int i=0;i<str.length();i++) {
		if(str.charAt(i)!='0') {
			System.out.print(str.charAt(i));
		}
	}
}
}
