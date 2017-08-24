package circulation;

public class Four {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 9; i > 0; i--) 
		{
			for (int j = i; j > 0; j--)
			{
				System.out.print(i + " * " + j + "=" + (i*j) + "    ");
			}
			System.out.println();
		}
	}

}
