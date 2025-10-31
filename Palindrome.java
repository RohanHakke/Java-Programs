import java.util.*;

class Palindrome{
	public static String isPalindrome(int num){
	int temp = 0;
	int demo = num;
	for (; ; ) {
		if(num == 0) break;
		temp=temp*10 + num%10;	
		num=num/10;
	}

	String result = (demo == temp )? "Palindrome":"Not Palindrome";
	return result;

	}
	public static void main(String[] args) {
		System.out.print("Enter Number : ");
		int num = new Scanner(System.in).nextInt();
		System.out.println("Your number "+num + " is " +Palindrome.isPalindrome(num));
	}
}