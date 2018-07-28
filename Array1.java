package hunter;

import java.util.*;
import java.util.Scanner;

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int a[] = new int[n];
		ArrayList<Integer> al = new ArrayList<Integer>();
		for (int i = 0; i < a.length; i++) {
			a[i] = s.nextInt();
			al.add(a[i]);
		}
		TreeSet h = new TreeSet(al);
		ArrayList<Integer>b = new ArrayList<Integer>();
		b.addAll(h);
		System.out.println(b);
		for (int i = 0; i < b.size(); i++) {
			if(Collections.frequency(al, b.get(i))!=1) {
				System.out.print(b.get(i));
			if(i!=b.size()-1)
				System.out.print(" ");
			}
		}
	}

}
