package hunter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Array6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int a[] = new int[n];
		List<Integer> al = new ArrayList<Integer>();
		for (int i = 0; i < a.length; i++) {
			a[i] = s.nextInt();
			al.add(a[i]);
		}
		for (int i = 0; i < a.length; i++) {
			if(Collections.frequency(al, al.get(i))!=1) {
				System.out.println(al.get(i));
				break;
			}
		}
	}

}
