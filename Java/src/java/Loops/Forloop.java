package java.Loops;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Forloop {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter number:");
		int n = Integer.parseInt(bf.readLine());
		int sum=0;
		
		for(int i=1;i<=n;i++) {
			System.out.println(i);
			sum = sum+i;
			
			
			
		}
		System.out.println("Sum = "+sum);

	}

}
