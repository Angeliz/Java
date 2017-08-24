package practice;

public class DoubleDimensionalArray {
	double array[][]={{1,2,3,4},
					   {5,6,7,8},
					   {9,10,11,12},
					   {13,14,15,16}
				     };
	public void dispiay()
	{
		for(int i= 0;i<array.length;i++)
		{
			for(int j=0;j<array[i].length;j++)
			{
				System.out.print(array[i][j]+"  ");
			}
			System.out.println();
		}
	}
	
	
	
	public void getMax()
	{
		double getMax=array[0][0];
		for(int i= 0;i<array.length;i++)
		{
			for(int j=0;j<array[i].length;j++)
			{
				if(array[i][j]>getMax)
				{
					getMax=array[i][j];
				}
			}
		}
		System.out.println(getMax);
	}
	
	
	public void lineMax()
	{
		double lineMax=array[0][0];
		int i =0;
		while(i<array.length&&i<array[i].length)
		{
			if(array[i][i]>lineMax)
			{
				lineMax=array[i][i];
			}
			i++;
		}
		System.out.println(lineMax);	
	}
	
	public void linesMax()
	{
		int i=0;
		int j=array.length-1;
		double linesMax=array[0][3];
		while(i<array.length&&j>=0)
		{
			if(array[i][i]>linesMax)
			{
				linesMax=array[i][j];
			}
			i++;
			j--;
		}
		System.out.println(linesMax);
				
				
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 DoubleDimensionalArray A=new  DoubleDimensionalArray();
		 A.dispiay();
		 A.getMax();
		 A.lineMax();
		 A.linesMax();
	}

}
