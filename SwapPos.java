import java.util.Scanner;

public class SwapPos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String a = s.next();
		String b = "",c = "";
		for(int i=0;i<a.length();i++) {
			if(i%2==0)
				b+=a.charAt(i);
				if(i%2!=0)
					c+=a.charAt(i);
		}
		int j=0,k=0;
		for(int i=0;i<a.length();i++) {
			if(i<c.length())
				System.out.print(c.charAt(k++));
			if(i<b.length())
				System.out.print(b.charAt(j++));
		}
	}

}
