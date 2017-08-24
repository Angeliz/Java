package third;

import java.util.Scanner;

public class zhengshufenjie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);
        int number;
        number = in.nextInt();
        do{
        	int dight = number%10;
        	System.out.print(dight);
        	number = number/10;
        }while(number>0);
        System.out.println();
	}

}
