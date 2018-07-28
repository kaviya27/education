package Player;

import java.util.Scanner;

public class Array42 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++) {
			a[i]=s.nextInt();
		}
		int c=1;
		for (int i = 0; i < a.length-1; i++) {
			if(a[i]<a[i+1]) {
				c++;
			}
		}if(c==a.length)
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}
