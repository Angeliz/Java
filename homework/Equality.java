package practice;

public class Equality {
	public void isEquality(double x, double y)
	{
		if (x == Double.POSITIVE_INFINITY || x == Double.NaN&&y== Double.POSITIVE_INFINITY ||y==Double.NaN)
		{
			System.out.println("不能判断");
		}
		else
		{
			if(x==y)
			{
				System.out.println(x+"，"+y);
			}
			else
			{
				System.out.println("不相等");
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Equality A=new Equality();
		A.isEquality(3.0, 3.0);
	}

}
