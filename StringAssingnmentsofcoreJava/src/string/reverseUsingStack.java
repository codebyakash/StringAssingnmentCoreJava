package string;
import java.util.Stack;
public class reverseUsingStack {
		public static void main(String[] args) {
			String str ="MADAM";
			Stack<Character> sb =new Stack<>();
			for(int i=0;i<str.length();i++) {
				sb.push(str.charAt(i));
				while(!sb.isEmpty()) {
					System.out.print(sb.pop());
				}
			}
		}

	}