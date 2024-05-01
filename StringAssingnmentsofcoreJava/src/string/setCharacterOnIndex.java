package string;
import java.util.Scanner;
public class setCharacterOnIndex {
	static Scanner sc=new Scanner(System.in);
public static void main(String[] args) {
	String str="Akashkumar";
	System.out.println("Original String : "+str);
	System.out.println("Enter specific character: ");
	String ch=sc.next();
	System.out.println("Enter replacing character Number: ");
	int num=sc.nextInt();
	str=str.substring(0,num-1)+ch+str.substring(num);
	System.out.println(str);
}
}
