import java.util.Scanner;

public class Binary62 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		String b = Integer.toString(a);
		int c=0;
		for(int i=0;i<b.length();i++) {
			if(b.charAt(i)=='0'||b.charAt(i)=='1')
			{
			c++;
			}
		}
		if(c==b.length())
			System.out.println("Yes");
		else
			System.out.println("No");
	}

}
