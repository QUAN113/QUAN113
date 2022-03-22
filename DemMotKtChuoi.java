import java.util.Scanner;
 public class Array {   
   public static void main(String[] args) {   
     
       Scanner sc = new Scanner(System.in);   
       System.out.println("Nhap chuoi cua ban: ");
         String s = sc.nextLine();   
         System.out.println("Nhap ky tu cua ban: ");
      char c = sc.next().charAt(0);   
       int answer = 0;   
         for (int i = 0; i < s.length(); i++) {     
        if(s.charAt(i) == c)
         {       
        answer ++; 
         System.out.println("vi tri thu " + answer );  
          }   
          }   
  System.out.print("xuat hien " +  answer + " lan");   } }