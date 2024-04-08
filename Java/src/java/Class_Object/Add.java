package java.Class_Object;

import java.util.Scanner;

public class Add {
	int a,b;
	
	public void getData() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number a:");
		a= sc.nextInt();
		System.out.println("Enter number b:");
		b = sc.nextInt();
		
	}
	public void putData() {
		System.out.println("Sum="+(a+b));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Add aa= new Add();
		aa.getData();
		aa.putData();
	}

}
