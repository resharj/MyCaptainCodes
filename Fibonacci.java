package fibonacci;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0,b=1,f;
		System.out.println("Enter the number upto which you want the series:-");
		Scanner fb=new Scanner(System.in);
		f=fb.nextInt();
		System.out.println("Fibonacci series upto "+f+" digits:-");
		System.out.print(a+" "+b);
		for(int i=1;i<=(f-2);i++) {
			int c;
			c=a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
		}
	}

}
