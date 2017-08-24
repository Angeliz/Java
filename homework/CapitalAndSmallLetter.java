package practice;

import java.util.Scanner;
public class CapitalAndSmallLetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("ÇëÊäÈëÒ»¸ö×Ö·û´®£º");
		Scanner in=new Scanner(System.in);
		String A=in.next();
		for(int i=0;i<A.length();i++)
		{
			char ch = A.charAt(i);
			boolean s=Character.isUpperCase(ch);
			if(s==true)
			{
				ch=Character.toLowerCase(ch);
			}
			else
			{
				ch=Character.toUpperCase(ch);
			}
			System.out.println(ch);
		}
		in.close();
	}

}
