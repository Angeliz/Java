package third;

import java.util.Scanner;

public class fenzhi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		
		//��ʼ��
		Scanner in = new Scanner(System.in);
		
		//�ֶκ���
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
			System.out.println("���");
			break;
		case 3:
			System.out.println("���Ϻ�");
		case 4:
			System.out.println("�ټ�");
			break;
		default :
			System.out.println("����ʲô����");
			break;
		}
	}

}
