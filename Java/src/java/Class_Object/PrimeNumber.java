package java.Class_Object;

import java.util.Scanner;

public class PrimeNumber {
	int n;
	
	void getData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num to check for prime:");
		n = sc.nextInt();
		sc.close();
		
	}
	
	void putData() {
		int i,count=0;
		for(i=1;i<=n;i++) {
			if(n%i==0)
				count=count+1;
		}
		if(count==2)
			System.out.println("Prime");
		else
			System.out.println("Not prime");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrimeNumber p = new PrimeNumber();
		p.getData();
		p.putData();

	}

}
