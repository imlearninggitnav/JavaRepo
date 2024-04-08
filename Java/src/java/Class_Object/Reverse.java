package java.Class_Object;

import java.util.Scanner;

public class Reverse {
	int n;
	void getData(int i) {
		n=i;
	}
	
	void putData() {
		int rev=0;
		while(n>0) {
			rev= (rev*10)+ n%10;
			n= n/10;
			
			}
		System.out.println("reverse="+ rev);
		
	}

	public static void main(String[] args) {
		// program to find revese of a given number
		Reverse aa = new Reverse();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num to find reverse:");
		int m= sc.nextInt();
		aa.getData(m);
		aa.putData();
		
	}

}
