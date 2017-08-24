package homework;

import java.util.Scanner;

public class Three {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("请依次输入圆柱的半径和高：");
		int r = in.nextInt();
		int h = in.nextInt();
		System.out.println("v="+Math.PI*r*r*h);
		in.close();
	}

}
