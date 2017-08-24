package test;

import java.util.Scanner;

public class Hello {
	class t{
		
	}
//	int a;
//	static int b;
//    static void A()
//    {
//    	b++;
//    	System.out.println("hello");
//    }
//    static void B()
//    {
//    	Hello.A();
//    }
    //public String C()
 //   {
   // 	return "hey";
//    }
  //  public void D()
   // {
    //	String x = C();
    	//System.out.println(x);
   // }
//    public void C()
//    {
//    	
//    	System.out.println("hey");
//    }
//    public void D()
//    {
//    	C();
//    }
//	int b=2;
//	int [] a= new int[3];
	
//	public static void arraycopy(Object copyFrom,int srcIndex,Object copyTo,int destIndex,int length)
//	{
//		
//	}
	
	
	public static void main(String args[]){
		
//		 Hello a=new Hello();
//		 a.D();
//		 boolean s=a instanceof Hello;
//		 System.out.println(s);
		
//		char[]m={'d','e', 'c', 'a', 'f', 'f', 'e', 'i', 'n', 'a', 't','e', 'd'};
//		char[]copyFrom=m;
//		char[] copyTo=new char[7];
//		System.arraycopy(copyFrom, 2, copyTo, 0, 7);
//		System.out.println(new String(copyTo));
		Scanner in=new Scanner(System.in);
		int x = in.nextInt();
		boolean isPrime=true;
		if(x==1)
		{
			isPrime=false;
		}
		else
		{
			for(int i=2;i<x;i++)
			{
				if(x%i==0)
				{
					isPrime=false;
					break;
				}
			}
		}
		if(isPrime)
		{
			System.out.println("是素数");
		}
		else
		{
			System.out.println("不是素数");
		}
		
		
		if(x==1||x%2==0&&x!=2)
		{
			isPrime=false;
		}
		else
		{
			for(int i=3;i<x;i+=2)
			{
				if(x%i==0)
				{
					isPrime=false;
					break;
				}
			}
		}
		
		for(int i=3;i<Math.sqrt(x);i+=2)
		{
			if(x%i==0)
			{
				isPrime=false;
				break;
			}
		}
		
	}
	
}
