package homework;

import java.util.*;

public class Five {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("请输入一个整数：");
		int number = in.nextInt();
		int result = number%2;
		if(result==0)
		{
			System.out.println(number+"是整数");
		}
		else
		{
			System.out.println(number+"不是整数");
		}
		in.close();
	}

}
