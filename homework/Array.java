package practice;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String array[]={"Java ","is ","an ","object ","orientsd ","programming ","language"};
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]);
		}
		int sum=0;
		for(int i = 0;i<array.length;i++)
		{
			sum=sum+array[i].length();
		}
		double average=sum/array.length;
		System.out.println();
		System.out.println(average);
	}

}
