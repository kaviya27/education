import java.util.Scanner;

public class AppendDot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String a = s.next();
		StringBuilder sb = new StringBuilder();
		sb.append(a).append(".");
		System.out.println(sb);
	}

}
