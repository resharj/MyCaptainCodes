package primeNumbers;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int p,cnt=0;
		System.out.println("Enter a value:-");
		Scanner ip=new Scanner(System.in);
		p=ip.nextInt();
		for(int i=2;i<p;i++) {
			if(p%i==0) {
				cnt=1;
				System.out.println(p+" is not a prime number.");
				break;
			}
		}
		if(cnt==0) {
			System.out.println(p+" is a prime number.");
		}
	}

}
