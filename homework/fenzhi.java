package third;

import java.util.Scanner;

public class fenzhi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		
		//初始化
		Scanner in = new Scanner(System.in);
		
		//分段函数
		int x = in.nextInt();
		int f;
		
			if ( x < 0)
		{
			f = -1;	
		}
			
		else if ( x == 0)
		{
			f = 0;
		}
		else
		{
			f = 2*x;
		}
		System.out.println( f );
		
		
		//switch-case
		int tape = in.nextInt();
		switch( tape )
		{
		case 1:
		case 2:
			System.out.println("你好");
			break;
		case 3:
			System.out.println("晚上好");
		case 4:
			System.out.println("再见");
			break;
		default :
			System.out.println("啊？什么啊？");
			break;
		}
	}

}
