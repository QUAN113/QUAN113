import java.util.*;
import java.util.Scanner;
 // Compiler version JDK 11.0.2

 public class StringToCharArrayExample {

 public static void main(String args[]) {
   String s1 ;
Scanner ip= new Scanner(System.in);
    // Su dung nextLine nhap du lieu kieu String
    System.out.println("Nhap chuoi cua ban: ");
    s1 = ip.nextLine();
  

  char[] ch = s1.toCharArray();

  for (int i = 0; i < ch.length; i++) {

   System.out.println(ch[i]);

  }

 }

}

