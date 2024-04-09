package java.Loops;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) throws IOException{
		// program to print first n natural numbers and find thier sum
//		Scanner sc= new Scanner(System.in);
//		System.out.println("Enter number:");
//		int n = sc.nextInt();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter number:");
		int n = Integer.parseInt(br.readLine());
		int i=1;
		int sum=0;
		System.out.println("Here is your output:");
		while(i<=n) {
			System.out.println(i);
			sum=sum+i;
			i=i+1;
		}
		System.out.println("Sum="+sum);

	}

}
