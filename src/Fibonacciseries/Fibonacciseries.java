package Fibonacciseries;

public class Fibonacciseries {
	
	
	public static void fibseries(int num)
	{
    int c=num;
    if(c==0)
    {
    	System.out.println("Fibonacci series of "+num+" is 0");
    }
    else if(c<0)
	{
	System.out.println("please enter the positive integer");
	}
	else
	{
	System.out.println("Fibonacci series of "+num +" is");
	int a=0;
	int b=1;
	int t=a+b;
	System.out.println(a);
	System.out.println(b);
	System.out.println(t);
	for(int i=3;i<=c;i++)
	{
		a=b;
		b=t;
		t=a+b;
		System.out.println(t);
	}
	}
	System.out.println("************");
	}

	public static void main(String[] args) {
	fibseries(5);
	fibseries(-1);
	fibseries(0);
	fibseries(9);
}
}
