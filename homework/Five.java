package homework;

import java.util.*;

public class Five {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("������һ��������");
		int number = in.nextInt();
		int result = number%2;
		if(result==0)
		{
			System.out.println(number+"������");
		}
		else
		{
			System.out.println(number+"��������");
		}
		in.close();
	}

}
