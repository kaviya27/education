package hunter;

import java.util.*;

public class Array4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int a[] = new int[n];
		List<Integer> al = new ArrayList<Integer>();
		Map<Integer,Integer> l = new TreeMap<Integer,Integer>();
		for (int i = 0; i < a.length; i++) {
			a[i] = s.nextInt();
			al.add(a[i]);
		}
		for (int i = 0; i < a.length; i++) {
			l.put(Collections.frequency(al, al.get(i)), al.get(i));
		}
		System.out.println(l.get(1));
	}

}
