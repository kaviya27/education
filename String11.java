package hunter;

import java.util.Scanner;

public class String11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String b = s.nextLine();
		String a[] = b.split(" ");
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < a.length; i++) {
			sb.setLength(0);
			sb.append(a[i]);
			sb.reverse();
			a[i] = sb.toString();
		}for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
			if(i!=a.length-1)
				System.out.print(" ");
		}
	}

}
