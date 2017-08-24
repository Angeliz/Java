package third;

import java.util.Scanner;

public class Age {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        final int MINOR = 35;
        System.out.print("请输入你的年龄：");
        Scanner in = new Scanner(System.in);
        
        int age = in.nextInt();
        
        System.out.println("你的年龄是："+age);
        
        if ( age < MINOR)
        {
        	System.out.print("年轻是美好的，");        	
        }
        System.out.println("年龄决定了你的精神世界，好好珍惜吧。");
        
        
        //比较数的大小
        int x = in.nextInt();
        int y = in.nextInt();
        int max;
        if ( x > y )
        {
        	max = x;
        }
        else
        {
        	max = y;
        }
        System.out.println(max);
        
        
        //判断是否及格
        final int PASS = 60;
        System.out.print("请输入你的成绩：");
        
        int score = in.nextInt();
        
        if ( score < PASS)
        {
        	System.out.println("不及格");
        }
        else
        {
        	System.out.println("及格");
        }
        
        
        //打印车票
        int balance = 0;
        while(true)
        {	
	        System.out.print("请投币：");
	        int amount = in.nextInt();
	        balance = balance + amount;
	        if ( balance >= 10)
	        {
	        	System.out.println("*****************");
	        	System.out.println("*Java城际铁路专线*");
	        	System.out.println("*   无指定座位票  *");
	        	System.out.println("*    票价10元       *");
	        	System.out.println("*****************");
	        	System.out.println("找零：" + (balance-10) + "元" );
	        	balance = 0;
	        }
	       
        }   
        		
	}

}
