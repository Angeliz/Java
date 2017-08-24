package circulation;


public class Two {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		int number =100;
		int a=0;
		while(number<=1000)
		{
			int rest = number%5;
			int rests = number%6;
			if(rest==0)
			{
				if(rests!=0)
				{
					System.out.print(number+"  ");
					a=a+1;
				}
			}
			else
			{
				if(rests==0)
				{
					System.out.print(number+"  ");
					a=a+1;
				}
			}
			number=number+1;
			if(a==10)
			{
				System.out.println();
				a=0;
			}
		}
	}

}
