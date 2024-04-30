package string;

public class PalindromeString {
public static void main(String[] args) {
	String str="MaDAm isI mAdam";
    int start=0;
    int end=str.length()-1;
    int flag=0;
	while(start<end) {
	if((int)str.charAt(start)==(int)str.charAt(end)||((int)str.charAt(start)+32==(int)str.charAt(end))||((int)str.charAt(start)-32==(int)str.charAt(end))) {
		flag=0;
	
	}else
		flag=1;
	
	start++;
	end--;
	}
	if(flag==0) {
		System.out.println("It is a Palindrome");
	}
	else
		System.out.println("It is not a Palindrome");
	
}
}
