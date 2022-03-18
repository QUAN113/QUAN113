
import java.util.Scanner;  // khai bao thu vien chua lop Scanner

public class Thaotacchuoi {
    String chuoi;
    String chuoi1;
    // Ham nhap du lieu tu ban phim
    void nhap(){ 
    //khai bao doi tuong ip thuoc lop Scanner
    Scanner ip= new Scanner(System.in);
    // Su dung nextLine nhap du lieu kieu String
    System.out.println("Nhap chuoi xoa khoang trang cua ban: ");
    chuoi = ip.nextLine();
    System.out.println("Nhap chuoi viet hoa moi ki dau cua ban: ");
    chuoi1 = ip.nextLine();
    ip.close();  // Dong doi tuong ip
    }
    
    void xoacach(){
      chuoi = chuoi.replaceAll(" ", "");
    }
    
    // Ham in du lieu ra man hinh
    void xuat(){
        System.out.print(" - -- - Thong tin sau khi xu ly: ----");
        System.out.println("\nchuoi xoa khoang trang: "+ chuoi );
        System.out.println("\nchuoi viet hoa moi ki tu dau: "+ chuoi1 );
         } 
   
   void hoa(){
    //khai báo một mảng, sau đó sử dụng phương thức toCharArray() 
    //để chuyển đổi message thành một mảng kiểu char
    char[] charArray = chuoi1.toCharArray();
    boolean foundSpace = true;
    //sử dụng vòng lặp for để duyệt các phần tử trong charArra
    for(int i = 0; i < charArray.length; i++) {
      // nếu phần tử trong mảng là một chữ cái
      if(Character.isLetter(charArray[i])) {
        // kiểm tra khoảng trắng có trước chữ cái
        if(foundSpace) {
          //đổi chữ cái thành chữ in hoa bằng phương thức toUpperCase()
          charArray[i] = Character.toUpperCase(charArray[i]);
          foundSpace = false;
        }
      }
      else {
        foundSpace = true;
      }
    }
    // chuyển đổi mảng char thành string
    chuoi1 = String.valueOf(charArray);        
  }    
  
  
    public static void main(String[] args){
       Thaotacchuoi a= new Thaotacchuoi();
       a.nhap();
       a.xoacach();
       a.xuat();
       a.hoa();
       a.xuat();
    }

}


