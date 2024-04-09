package java.Constructor;

import java.util.Scanner;

public class Add {
	int a,b;
	Add(int x, int y){
		a=x;
		b=y;
	}
	void output() {
		int c;
		c=a+b;
		System.out.println("Addition:"+c);
	}

	public static void main(String[] args) {
		// 
		int m,n;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first num:");
		m = sc.nextInt();
		System.out.println("Enter second num:");
		n = sc.nextInt();
		
		Add aa= new Add(m,n);
		
		aa.output();
	}

}
