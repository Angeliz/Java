package homework;

import java.util.Scanner;

public class Four {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("������һ����0-1000֮�����");
		int number = in.nextInt();
		int rest=0;
		while(number>=10)
		{
			rest=number%10+rest;
			number=number/10;
			System.out.println(rest + ", " + number);
			
		}
		int result=number+rest;
		System.out.println("result="+ result);
		in.close();
	}

}
