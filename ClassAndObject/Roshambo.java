
public class Roshambo {
	private int a;
	private int b;
	
	public int win()
	{
		if (a-b==0)
        {
        	return -1;
        }
        else
        {
        	if (a-b==1)
        	{
        		return a;
        	}
        	else if(a-b==-1)
        	{
        		return b;
        	}
	        else if(a-b==2)
	        {
	        	return b;
	        }
	        else if(a-b==-2)
	        {
	        	return a;
	        }
	        else {
	        	return -1;
	        }
        }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Roshambo r = new Roshambo();
		r.a = 1;
		r.b = 2;
		System.out.println(r.win());
	}

}
