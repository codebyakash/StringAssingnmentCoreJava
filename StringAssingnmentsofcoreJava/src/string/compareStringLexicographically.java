package string;

public class compareStringLexicographically {
		public static void main(String[] args){
			String str1 = "BAcL";
			String str2 = "BALL";
			int n=0;
			int num=0;
			for(int i=0;i<=n;i++) {
			int s1=(int)str1.charAt(n);
			int s2=(int)str2.charAt(n);
			num=s1-s2;
			if(num==0) {
				i++;
			}
			}
			if(num>0) {
				System.out.println("First String is Greater");
			}
				else
				if(num==0) {
					System.out.println("Both String are equal");
				}
					else	
					System.out.println("First String is Smaller");
		}
	}

