/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlisinhvien;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author VCC
 */
public class ListSinhVien {
    private List<SinhVien> danhsachSinhVien;
    public ListSinhVien(){
        this.danhsachSinhVien = new ArrayList<SinhVien>();
    }

    public ListSinhVien(List<SinhVien> danhsachSinhVien) {
        this.danhsachSinhVien = danhsachSinhVien;
    }
    public void themSinhVien(SinhVien a){
        this.danhsachSinhVien.add(a);
        
    }
    public  void indanhsach(){
        for(SinhVien o: danhsachSinhVien){
            System.out.println(o);
        }
    }
    public boolean kiemtrarong(){
        return this.danhsachSinhVien.isEmpty();
    }
    public int soluongSV(){
        return this.danhsachSinhVien.size();
    }
    public void lamrongDS(){
        this.danhsachSinhVien.removeAll(danhsachSinhVien);
    }
    public  boolean kiemtratontai_bangMSV(SinhVien sv){
        return this.danhsachSinhVien.contains(sv);

    }
    public  void xoaSinhVien(SinhVien sv){
        this.danhsachSinhVien.remove(sv);
    }
    public void timkiem_duatrenten(String ten){
        for(SinhVien sv: danhsachSinhVien){
            if(sv.getHoten().indexOf(ten)>=0){
                System.out.println("co ton tai");
            }else{
                System.out.println("khong ton tai");
            }
        }
    }
    public void sapxep(){
        Collections.sort(this.danhsachSinhVien,new Comparator<SinhVien>(){
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                if(o1.getDiemtb()<o2.getDiemtb()){
                    return 1;
                }else if(o1.getDiemtb()> o2.getDiemtb()){
                    return -1;
                }else{
                   return 0;
                }
            } 
        });
    }
    public void ghidulieuxuongfile(File file){
        try {
            OutputStream os = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(os);
            for(SinhVien sv: danhsachSinhVien){
                oos.writeObject(sv);
            }
            oos.flush();
            oos.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
    }
    public void docdulieutuFile(File file){
        try {
            InputStream is= new FileInputStream(file);
            ObjectInputStream ois= new ObjectInputStream(is);
            SinhVien sv= null;
            while(true){
                Object o= ois.readObject();
                if(o!=null){
                    sv=(SinhVien)o;
                    this.danhsachSinhVien.add(sv);
                }else{
                    break;
                }
            }
             ois.close();       

        } catch (Exception e) {
        }
        
    }
        
    
    
}
