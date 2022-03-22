import java.util.Scanner;
public class ReverseStringDemo {

public static void main(String[] args) {
String s ;
Scanner ip= new Scanner(System.in);
    // Su dung nextLine nhap du lieu kieu String
    System.out.println("Nhap chuoi cua ban: ");
    s = ip.nextLine();

StringBuilder sb = new StringBuilder(s);

sb.reverse();

String text = sb.toString();

System.out.println("Original string: " + s);

System.out.println("Reversed string: " + text);

}

}

