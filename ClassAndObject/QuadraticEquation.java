import java.util.Scanner;

public class QuadraticEquation {
	private int a,b,c;
	public void setA(int a)
	{
		this.a=a;
	}
	public void setB(int b)
	{
		this.b=b;
	}
	public void setC(int c)
	{
		this.c=c;
	}

	public int getA()
	{
		return this.a;
	}
	public int getB()
	{
		return this.b;
	}
	public int getC()
	{
		return this.c;
	}
	
	public double getDiscriminant()
	{
		
		double m = b*b-4*a*c;
		return m;
	}
	
	public double getRoot1()
	{
		double m=getDiscriminant();
		if(m>=0)
		{
			double r1 = (-b+Math.sqrt(b*b-4*a*c))/2*a;
			return r1;
		}
		else
		{
			return 0;
		}
		
	}
	public double getRoot2()
	{
		double m=getDiscriminant();
		if(m>=0)
		{
			double r2 = (-b-Math.sqrt(b*b-4*a*c))/2*a;
			return r2;
		}
		else
		{
			return 0;
		}
		
	}
	
	public void calculatee()
	{
		double m=getDiscriminant();
		System.out.println(m);
		double r1=getRoot1();
		double r2=getRoot2();
		if (m>0)
		{
			System.out.println(r1+","+r2);
		}
		else if(m==0)
		{
			System.out.println(r1);
		}
		else
		{
			System.out.println("The equation has no roots");
		}
		
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		QuadraticEquation x = new QuadraticEquation();
		System.out.println("«Î ‰»Îa£¨b£¨c");
		x.a=in.nextInt();
		x.b=in.nextInt();
		x.c=in.nextInt();
		x.calculatee();
		
				
	}

}
