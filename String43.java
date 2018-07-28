package Player;

import java.util.Scanner;

public class String43 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String s1 = s.next();
		String s2 = s.next();
		if(s1.contains(s2))
			System.out.println("Yes");
		else
			System.out.println("No");
	}

}
