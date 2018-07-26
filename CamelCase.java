import java.util.Scanner;

public class CamelCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String a = s.nextLine();
		String c = "";
		String b[] = a.split(" ");
		for (int i = 0; i < b.length; i++) {
		System.out.print(b[i].substring(0, 1).toUpperCase()+b[i].substring(1).toLowerCase());
		if(i!=b.length-1)
			System.out.print(" ");
		}
	}
}