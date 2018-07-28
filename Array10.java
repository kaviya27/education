package hunter;

import java.util.ArrayList;
import java.util.Scanner;

public class Array10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int n1 = s.nextInt();
		int a[] = new int[n];
		int a1[] = new int[n1];
		for (int i = 0; i < a.length; i++) {
			a[i] = s.nextInt();
		}
		for(int i=0;i<a1.length;i++) {
			a1[i] = s.nextInt();
		}
		int c=0;
		for(int i=0;i<a1.length;i++) {
			for(int j=0;j<a.length;j++) {
				if(a1[i]==a[j])
					c++;
			}
		}
		if(c==a1.length)
		System.out.println("Yes");
		else
		System.out.println("No");
	}

}
