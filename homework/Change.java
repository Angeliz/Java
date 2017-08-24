package practice;
import java.util.Scanner;

public class Change {
	String a;
	public void conversion()
	{
		String a=this.a;
		int b =Integer.valueOf(a);
		System.out.println(b);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		String s=in.next();
		
		Change A=new Change();
		A.a=s;
		A.conversion();
		
	}

}
