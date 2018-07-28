package hunter;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Array7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = s.nextInt();
		}
		for (int i = 0; i < a.length; i++) {
			if(i%2==0) {
				if(a[i]%2==1)
					System.out.print(a[i]+" ");
			}
			if(i%2==1) {
				if(a[i]%2==0)
					System.out.print(a[i]+" ");
			}
		}
	}

}
