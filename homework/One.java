package homework;

import java.util.Scanner;

public class one {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//求最大数
		int max;
		
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		int y = in.nextInt();
		int z = in.nextInt();
		
		if(x>y)
		{
			if(x>z)
			{
				max = x;
			}
			else
			{
				max = z;
			}
		}
		else 
		{
			if(y>z)
			{
				max = y;
			}
			else
			{
				max = z;
			}
		}
		System.out.println(max);

		
	}

}
