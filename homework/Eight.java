package homework;

import java.util.Scanner;

public class Eight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);
        System.out.println("������0��1��2�е���������");
        int a = in.nextInt();
        int b = in.nextInt();
        int win=0;
        if (a-b==0)
        {
        	System.out.println("ƽ��");
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
        	 System.out.println(win+"ʤ");
        }
        in.close();
	}
}
