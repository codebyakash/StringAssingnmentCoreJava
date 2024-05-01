package string;

public class checkPanagram {
public static void main(String[] args) {
	String str="The QUICK brown fox JUMPS OVER the lazy dog";
	int count=0;
	if(str.length()>=26) {
	for(int i=97;i<=122;i++) {
		for(int j=0;j<str.length();j++) {
			if(((int)str.charAt(j)==i)||(int)str.charAt(j)==i-32) {
				count++;
				break;
			}
		}
	}
	if(count==26) {
		System.out.println("It is Panagram");
	}
	else {
		System.out.println("It is not Panagram");
	}
}
	else
		System.out.println("String must have minimum 26 character");
}
}