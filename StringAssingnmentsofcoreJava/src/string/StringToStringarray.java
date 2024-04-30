package string;

public class StringToStringarray {
public static void main(String[] args) {
	String str="I am Akash";
	String[] st=str.split(" ");
	for(int i=0;i<st.length;i++) {
		System.out.print(st[i]+" ");
	}
}
}
