package test;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        boolean result=true;
        int sum=0;
        for(int x=1;x<1000;x++)
        {
	        if(x==1||x%2==0&&x!=2)
	        {
	        	result=false;
	        }
	        for(int i=3;i<Math.sqrt(x);i+=2)
	        {
	        	if(x%i==0)
	        	{
	        		result=false;
	        	}
	        }
	        if(result=true)
	        {
	        	sum=sum+x;
	        }
        }
        System.out.println(sum);
        
	}

}
