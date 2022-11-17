package tilak;

public class PalindromeChecking {

	public static void main(String[] args) {
		String s="2552";
		String k="";
		for(int i=s.length()-1;i>=0;i--) {
			k+=s.charAt(i);
			
			
		}
		if(s.equals(k)) {
			System.out.println("its a palindrome");
		}
		else {
			System.out.println("Its not  a palindrome");
		}

	}

}
