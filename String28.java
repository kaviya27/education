package hunter;

import java.util.*;

public class String28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String a = s.next();
		List<Character> l = new ArrayList<Character>();
		Set<Character> h = new LinkedHashSet<Character>();
		for (int i = 0; i < a.length(); i++) {
			h.add(a.charAt(i));
		}
		l.addAll(h);
		for (int i = 0; i < l.size(); i++) {
			System.out.print(l.get(i));
		}
	}

}
