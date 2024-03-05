/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quanlisinhvien;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author VCC
 */
public class QuanLiSinhVien {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ListSinhVien dsSV= new ListSinhVien();
        int luachon=0;
        do{
            System.out.println("___Menu___");
            System.out.println("Moi lua chon");
            System.out.println(
                "1.Them sinh vien\n"
                +"2.in danh sach\n"
                +"3.kiem tra ds rong hay khong\n"
                +"4.lay ra so luong sinh vien trong danh sach\n"
                +"5.lam rong danh sach sinh vien\n"
                +"6.kiem tra sinh vien co ton tai hay ko dua tren msv\n"
                +"7. xoa 1 sinh vien dua tren msv\n"
                +"8. tim kiem sinh vien dua tren ten duoc nhap tu ban phim\n"
                +"9. Xuat danh sach sinh vien co diem tu cao den thap\n"
                +"10. lay du lieu xuong file\n"
                +"11. doc du lieu tu file\n"
                +"0. thoat chuong trinh"
                );
            luachon =sc.nextInt();
            sc.nextLine();
            if(luachon==1){
                System.out.println("Nhap ten sinh vien: ");
                String ten= sc.nextLine();
                System.out.println(" Nhap ma sinh vien:");
                String msv= sc.nextLine();
                System.out.println("Nhap nam sinh: ");
                int ns= sc.nextInt();
                System.out.println("Nhap diem trung  binh");
                double dtb= sc.nextDouble();
                SinhVien sv= new SinhVien(msv, ten, ns, dtb);
                dsSV.themSinhVien(sv);
            }else if(luachon==2){
                System.out.println("In danh sach sinh vien: ");
                dsSV.indanhsach();
                
            }else if(luachon==3){
                if(dsSV.kiemtrarong()){
                    System.out.println("Danh sach rong");
                }else{
                    System.out.println("Danh sach khong rong");
                }
            }else if(luachon==4){
                System.out.println("So luong sinh vien la: "+ dsSV.soluongSV());
            }else if(luachon==5){
                dsSV.lamrongDS();
            }else if(luachon==6){
                System.out.println("nhap ma sinh vien: "); String msv= sc.nextLine();
                SinhVien sv= new SinhVien(msv);
                System.out.println(dsSV.kiemtratontai_bangMSV(sv));
            }else if(luachon==7){
                
            }else if(luachon==8){
                
            }else if(luachon==9){
                
            }else if(luachon==10){
                String file = sc.nextLine();
                File f= new File(file);
                dsSV.ghidulieuxuongfile(f);
            }else if(luachon==11){
                
            }
            
            
        }while(luachon !=0);
        
    }
    
}
