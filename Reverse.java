import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String a = s.next();
		StringBuilder sb = new StringBuilder();
		sb.append(a);
		sb.reverse();
		System.out.println(sb);
	}

}
