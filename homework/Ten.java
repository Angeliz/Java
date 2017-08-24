package homework;

import java.util.Scanner;

public class Ten {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		int y = in.nextInt();
		int z = in.nextInt();
		int min = x, max = x;
		if (y < min) {
			min = y;
		}
		if (z < min) {
			min = z;
		}
		if (y > max) {
			max = y;
		}
		if (z > max) {
			max = z;
		}
		System.out.println("min: " + min + ", max: " + max);
		in.close();
	}
}
