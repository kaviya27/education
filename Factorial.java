import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int fact = 1;
		if(n==0) {
			System.out.println(1);
		}else {
		for(int i=1;i<=n;i++) {
			fact*=i;
		}
		System.out.println(fact);
	}
	}
}
