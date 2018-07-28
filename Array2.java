package hunter;
import java.util.*;
public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int a[] = new int[n];
		String b = "";
		int c = 0;
		for (int i = 0; i < a.length; i++) {
			a[i] = s.nextInt();
			b+=a[i];
			if(a[i]==0)
				c++;
		}
		if(c==a.length) {
			System.out.println("0");
		}else {
			char ch[] = b.toCharArray();
			Arrays.sort(ch);
		for (int i = ch.length-1; i>=0; i--) {
			System.out.print(ch[i]);
		}
	}
	}
}
