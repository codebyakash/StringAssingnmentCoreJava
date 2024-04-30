package string;

public class anagramString {
public static void main(String[] args) {
	String str1="TRIATVNGLE";
	String str2="IVNTEGRATL";
	int count=0;
	StringBuffer sb=new StringBuffer(str2);
	if(str1.length()==str2.length()) {
		for(int i=0;i<str1.length();i++) {
			for(int j=0;j<str2.length();j++) {
				if(str1.charAt(i)==sb.charAt(j)) {
					sb.setCharAt(j,'*');
					count++;
					break;
				}
			}
		}
	
	    if(str1.length()==count) {
		System.out.println("It is a anagram string");
	}
	    else 
		System.out.println("It is not a anagram string");
	}
	else 
		System.out.println("Length is not equal");
	}
}
