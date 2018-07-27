package Player;

import java.util.ArrayList;
import java.util.*;

public class Array16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		ArrayList<Integer>al = new ArrayList<Integer>(n);
		for(int i=0;i<n;i++) {
			al.add(s.nextInt());
		}
		Map<Integer,Integer> m = new LinkedHashMap<Integer,Integer>();
		for (int i = 0; i < al.size();i++) {
			m.put( Collections.frequency(al, al.get(i)),al.get(i));
		}
		System.out.println(m.get(1));
	}

}
