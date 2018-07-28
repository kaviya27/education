package Player;

import java.util.*;

public class Array19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		List<Integer> al = new LinkedList<Integer>();
		for(int i=1;i<=n;i++) {
			int c = 0;
			if(n%i==0) {
				for(int j=1;j<=i;j++) {
					if(i%j==0)
						c++;
				}if(c==2)
					al.add(i);
			}
		}
		for(int i=0;i<al.size();i++) {
			System.out.print(al.get(i)+" ");	
		}
	}
}