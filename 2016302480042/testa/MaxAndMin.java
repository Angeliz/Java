package org.whuims.testa;

import java.util.Scanner;

public class MaxAndMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int[] array = new int[a];
        for(int i = 0; i < a; i++)
        {
           array[i] = in.nextInt();
        }
        in.close();
        int maxNumber = array[0], minNumber = array[0], sum = 0;
        for(int n:array)
        {
                sum += n;
                if (n > maxNumber) 
                {
                    maxNumber = n;
                }else if (n < minNumber) 
                {
                    minNumber = n;
                }
        }
        int meanNumber = sum/a;
        System.out.println("max: "+ maxNumber + "\nmin: " + minNumber + "\nmean: " + meanNumber);
	}

}
