package Player;
import java.util.*;
public class Palindrome{
public static void main(String args[]){
Scanner s = new Scanner(System.in);
String a = s.next();
StringBuilder sb = new StringBuilder();
sb.append(a);
sb.reverse();
if(a.equals(sb.toString())){
System.out.println("Yes");
}
else
System.out.println("no");
}
}
