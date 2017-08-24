package homework;

import java.util.Scanner;

public class two {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int sum= 0;
		int amount = 0;
		while(amount<=n)
		{
			sum = sum+amount;
			amount = amount+1;
		}
		System.out.println("sum="+sum);
	}

}
