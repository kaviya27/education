package Player;

import java.util.Scanner;

public class String24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String a = s.next();
		boolean is = false;
		for(int i=0;i<a.length();i++) {
			if(Character.isAlphabetic(a.charAt(i)))
			{
				is=true;
				break;
			}
		}if(is==false)
			System.out.println("yes");
		else
			System.out.println("no");
	}

}
