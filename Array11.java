package Player;

import java.util.Scanner;

public class Array11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String b = s.next();
		String a[] = {"sunday","monday","tuesday","wednesday","thursday","friday","saturday"};
			if(b.equalsIgnoreCase(a[0])||b.equalsIgnoreCase(a[a.length-1]))
				System.out.println("Yes");
			else
				System.out.println("No");
	}

}
