package third;

import java.util.Scanner;

public class xunhuan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		
		
		//������
        int number = in.nextInt();
        int count = 0;
        while( number > 0 )
        {
        	number = number/10;
        	count = count + 1;
        }
        System.out.println(count);
        
        //do-whileѭ��
        do
        {
        	number = number/10;
        	count = count + 1;
        }while( number > 0 );
        System.out.println(count);
        
        
        
        //��Ʊѭ��
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
