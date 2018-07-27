import java.util.Scanner;

public class Sum64 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int sum = a+b;
		if(sum%2==0)
			System.out.println("Even");
		else
			System.out.println("Odd");
	}

}
