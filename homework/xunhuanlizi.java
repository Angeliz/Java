package third;

import java.util.Scanner;

public class xunhuanlizi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);
		//计数循环
		//算平均数
		int number;
		int sum = 0;
		int count = 0;
		number = in.nextInt();
		while( number!=-1)
		{
			sum = sum+number;
			count = count+1;
			number = in.nextInt();
		}
		System.out.println("平均数="+(double)sum/count);
		
		do
		{
			number = in.nextInt();
			if(number != -1)
			{
				sum =sum+number;
				count = count+1;
			}
		}
		while( number!=-1);
		if (count>0)
		{
			System.out.println("平均数是"+(double)sum/count);
		}
		
		
		
		
	}

}
