package Player;

import java.util.*;

public class Isomorphic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String a = s.next();
		String b = s.next();
		HashSet<Character> h = new HashSet<Character>();
		HashSet<Character> h1 = new HashSet<Character>();
		for(int i=0;i<a.length();i++) {
			h.add(a.charAt(i));
			h1.add(b.charAt(i));
		}
		if(h.size()==h1.size())
			System.out.println("Yes");
		else
			System.out.println("No");
	}

}
