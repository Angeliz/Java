package third;

import java.util.Scanner;

public class Age {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        final int MINOR = 35;
        System.out.print("������������䣺");
        Scanner in = new Scanner(System.in);
        
        int age = in.nextInt();
        
        System.out.println("��������ǣ�"+age);
        
        if ( age < MINOR)
        {
        	System.out.print("���������õģ�");        	
        }
        System.out.println("�����������ľ������磬�ú���ϧ�ɡ�");
        
        
        //�Ƚ����Ĵ�С
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
        
        
        //�ж��Ƿ񼰸�
        final int PASS = 60;
        System.out.print("��������ĳɼ���");
        
        int score = in.nextInt();
        
        if ( score < PASS)
        {
        	System.out.println("������");
        }
        else
        {
        	System.out.println("����");
        }
        
        
        //��ӡ��Ʊ
        int balance = 0;
        while(true)
        {	
	        System.out.print("��Ͷ�ң�");
	        int amount = in.nextInt();
	        balance = balance + amount;
	        if ( balance >= 10)
	        {
	        	System.out.println("*****************");
	        	System.out.println("*Java�Ǽ���·ר��*");
	        	System.out.println("*   ��ָ����λƱ  *");
	        	System.out.println("*    Ʊ��10Ԫ       *");
	        	System.out.println("*****************");
	        	System.out.println("���㣺" + (balance-10) + "Ԫ" );
	        	balance = 0;
	        }
	       
        }   
        		
	}

}
