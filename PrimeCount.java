import java.util.Scanner;

public class PrimeCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int start = s.nextInt();
		int end = s.nextInt();
		int counter = 0;
		for(int i = start;i<=end;i++) {
			int cnt = 0;
			for(int j=1;j<=i;j++) {
				if(i%j==0)
					cnt++;
			}if(cnt==2) {
				counter++;
			}
		}System.out.println(counter);
	}

}
