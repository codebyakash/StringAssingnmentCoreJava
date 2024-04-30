package string;
import java.util.Scanner;
public class getCharacterString {
	 static Scanner sc=new Scanner(System.in);
public static void main(String[] args) {
	String str="Akash";
	System.out.println("String: "+str);
	System.out.println("Enter index number which character do you want to print:");
	int num=sc.nextInt();
	num-=1;	
	if(num<str.length()&&num>=0) {
	char ch=str.charAt(num);
	System.out.println(ch);
	}
	else
		System.out.println("you Enter out of String index");
}
}
