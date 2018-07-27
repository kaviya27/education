import java.util.Arrays;
import java.util.Scanner;

public class Array63 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int a = 10;
		int arr[] = new int[a];
		for(int i=0;i<a;i++) {
			arr[i]=s.nextInt();
		}Arrays.sort(arr);
		System.out.println(arr[0]);
	}

}
