package homework;
import java.util.Scanner;
public class Text {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		int rest=0;
		while(number>=10)
		{
			rest=number%10+rest;
			number=number/10;
			
			System.out.println("rest="+rest+",number="+number);
		}
		int result=number+rest;
		System.out.println("result="+ result);
		in.close();
		
		
	}

}
