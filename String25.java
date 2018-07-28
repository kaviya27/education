package Player;

import java.util.*;

public class String25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		String a[] = new String[n];
		ArrayList<Integer> al = new ArrayList<Integer>();
		Map<Integer,String> m = new TreeMap<Integer,String>();
		for (int i = 0; i < a.length; i++) {
			a[i]=s.next();
			al.add(a[i].length());
			m.put(a[i].length(), a[i]);
		}
		Collections.sort(al);
		for (int i = 0; i < al.size(); i++) {
			System.out.print(m.get(al.get(i))+" ");
		}
	}
}
