package third;

import java.util.Scanner;

public class xunhuan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		
		
		//数数字
        int number = in.nextInt();
        int count = 0;
        while( number > 0 )
        {
        	number = number/10;
        	count = count + 1;
        }
        System.out.println(count);
        
        //do-while循环
        do
        {
        	number = number/10;
        	count = count + 1;
        }while( number > 0 );
        System.out.println(count);
        
        
        
        //车票循环
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
