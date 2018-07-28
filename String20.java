package Player;

import java.util.Scanner;

public class String20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String a = s.next();
		for(int i=0;i<a.length();i++) {
			if(a.charAt(i)=='z')
				System.out.print("c");
			else if (a.charAt(i)=='Z')
				System.out.print("C");
			else if(a.charAt(i)=='Y')
				System.out.print("B");
			else if (a.charAt(i)=='y')
				System.out.print("b");
			else if (a.charAt(i)=='X')
				System.out.print("A");
			else if (a.charAt(i)=='x')
				System.out.print("a");
			else
			System.out.print((char)(a.charAt(i)+3));
		}
	}

}
