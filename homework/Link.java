package practice;

public class Link {
	public void link(String x,StringBuffer y)
	{
		System.out.println(x+y+"ABC");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="abc";
		StringBuffer b=new StringBuffer("123") ;
		Link A=new Link();
		A.link(a, b);
	}

}
