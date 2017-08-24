package practice;
import java.util.*;

public class Test {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in=new Scanner(System.in);
		String str=in.next();
		ArrayList<Character> A=new ArrayList<Character>();
		ArrayList<Integer> B=new ArrayList<Integer>();
		char a=str.charAt(0);
		A.add(a);
		B.add(1);
		boolean isEquality=true;
		for(int i=1;i<str.length();i++)
		{
			char ch=str.charAt(i);
			int j=0;
			for(j=0;j<A.size();j++)
			{
				if(ch!=A.get(j))
				{
					 isEquality=false;
				}
				else
				{
					 isEquality=true;
					 break;
				}
			}
			if(isEquality==false)
			{
				A.add(ch);
				B.add(1);
			}
			else
			{
				B.set(j, B.get(j)+1);
			}
		}
		for(int m=0;m<A.size();m++)
		{
			System.out.println(A.get(m)+","+B.get(m));
		}
		
		
		
	}

}
