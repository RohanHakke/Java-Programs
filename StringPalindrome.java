import java.util.*;
class StringPalindrome{
	public static String isPalindrome(String str){
		String rev = "";
		for (int i = 0;i< str.length() ;i++ ) {
			rev =  str.charAt(i) + rev;
		}
		String result = (str.equals(rev))?"Palindrome":"Not Palindrome";
		return result;

	}
	public static void main(String[] args) {
		System.out.print("Enter String : ");
		String str = new Scanner(System.in).next();
		System.out.println("your String " + str + " is " + StringPalindrome.isPalindrome(str));	
		
	}
}