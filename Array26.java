package hunter;

import java.util.Scanner;

public class Array26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int a[] = new int[n];
		String b[] = new String[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = s.nextInt();
			b[i]=""+a[i];
		}
		for(int i=b.length-1;i>=0;i--) {
			System.out.print(b[i]);
			if(i!=0)
				System.out.print("->");
		}
	}

}
