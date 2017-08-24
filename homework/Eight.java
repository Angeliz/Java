package homework;

import java.util.Scanner;

public class Eight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);
        System.out.println("请输入0，1，2中的两个数：");
        int a = in.nextInt();
        int b = in.nextInt();
        int win=0;
        if (a-b==0)
        {
        	System.out.println("平局");
        }
        else
        {
        	if (a-b==1)
        	{
        		win = a;
        	}
        	else if(a-b==-1)
        	{
        		win = b;
        	}
	        else if(a-b==2)
	        {
	        	win = b;
	        }
	        else if(a-b==-2)
	        {
	        	win = a;
	        }
        	 System.out.println(win+"胜");
        }
        in.close();
	}
}
