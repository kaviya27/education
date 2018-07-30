package hunter;

import java.util.Arrays;
import java.util.Scanner;

public class Array12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int r = s.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = s.nextInt();
		}
		Arrays.sort(a);
		System.out.println(a[a.length-r]);
	}

}
