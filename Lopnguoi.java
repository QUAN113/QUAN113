

 

import java.util.Scanner;

 

public class Nguoi {

    private String ngaysinh;

    private String gioiTinh;

    private String nhommau;

     

    public Nguoi() {

        super();

    }

 

    public Nguoi(String ngaysinh, String gioiTinh, String nhommau) {

        super();

        this.ngaysinh = ngaysinh;

        this.gioiTinh = gioiTinh;

        this.nhommau = nhommau;

    }

     public String getngaysinh() {

        return ngaysinh;

    }
     
    public String getgioitinh() {

        return gioiTinh;

    }
    
    public String getnhommau() {

        return nhommau;

    }

 

    public void nhapThongTin() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập ngay sinh cua nguoi: ");

        ngaysinh = scanner.nextLine();

        System.out.print("Nhập giới tính: ");

        gioiTinh = scanner.nextLine();

        System.out.print("Nhập nhom mau: ");

       nhommau = scanner.nextLine();

    }

     

    public void hienThiThongTin() {

        System.out.println("ngày sinh: " + ngaysinh);

        System.out.println("Giới tính: " + gioiTinh);

        System.out.println("nhóm máu: " + nhommau);

    }


public static void main(String[] args){
      Nguoi a= new Nguoi();
       a.nhapThongTin();
       a.hienThiThongTin();
    }

}

