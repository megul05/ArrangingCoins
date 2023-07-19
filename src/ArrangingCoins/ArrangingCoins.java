package ArrangingCoins;

import java.util.*;

public class ArrangingCoins {
	
	public static int arrange(int number)
	{
		int row =1;
		int count =0;
		while(number > row)
		{
			number -= row;
			row++;
			count++;
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		System.out.println(arrange(number));

	}

}
