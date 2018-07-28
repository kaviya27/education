package hunter;

import java.util.Scanner;

public class String13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String b = s.nextLine();
		StringBuilder sb = new StringBuilder();
		sb.append(b);
		sb.reverse();
		if(b.equalsIgnoreCase(sb.toString()))
			System.out.println("yes");
		else
			System.out.println("no");
	}

}
