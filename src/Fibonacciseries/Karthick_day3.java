package Fibonacciseries;

public class Karthick_day3 {
		
		public static void ispalindrome(int num)
		{
		int r;
		int t=num;
		int rev=0;
		while(num>0)
		{
			r=num%10;
			rev=(rev*10)+r;
			num=num/10;
			}
		if(t==rev)
		{
			System.out.println(t+ " is palindrome");
		}
		else
		{
			System.out.println(t+" is not palindrome");
		}
		}

		public static void main(String[] args) {
			
	ispalindrome(151);
	ispalindrome(152);
	ispalindrome(252);
	ispalindrome(254);
		}


}


