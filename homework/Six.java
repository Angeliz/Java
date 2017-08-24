package homework;

import java.util.Scanner;

public class Six {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("请输入三个数：");
		int x = in.nextInt();
		int y = in.nextInt();
		int z = in.nextInt();
		if (x<=y) 
		{
			if(z<=x)
			{
				System.out.println(z+","+x+","+y);
			}
			else if(z<=y)
			{
				System.out.println(x+","+z+","+y);
			}
			else
			{
				System.out.println(x+","+y+","+z);
			}
		}
		else
		{
			if(x<z)
			{
				System.out.println(y+","+x+","+z);
			}
			else if(z<y)
			{
				System.out.println(z+","+y+","+x);
			}
			else
			{
				System.out.println(y+","+z+","+x);
			}
		}
		in.close();
		
	}

}
