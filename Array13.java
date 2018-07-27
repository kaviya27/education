package Player;

import java.util.Scanner;

public class Array13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int sum = 0;
		while(n!=0) {
			int temp=n%10;
			sum = sum + (temp*temp);
			n/=10;
		}System.out.println(sum);
	}

}
