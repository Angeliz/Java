package circulation;

public class One {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age=0;
		double sum=0;
		double profit= 0;
		double a= 1;
		while(age<=10)
		{
			a= a*1.05;
			profit = 20000*a;
			age=age+1;
			sum= sum+profit;
		}
		System.out.println("10����������Ϊ"+profit+"����ʮ��������ܶ�Ϊ"+sum);
	}

}
