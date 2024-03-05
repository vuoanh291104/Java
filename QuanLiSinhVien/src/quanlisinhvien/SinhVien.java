/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlisinhvien;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author VCC
 */
public class SinhVien implements Comparable<SinhVien>, Serializable{
    private String msv;
    private String hoten;
    private int namsinh;
    private double diemtb;
    public SinhVien(){}

    public SinhVien(String msv) {
        this.msv = msv;
    }

    public SinhVien(String msv, String hoten, int namsinh, double diemtb) {
        this.msv = msv;
        this.hoten = hoten;
        this.namsinh = namsinh;
        this.diemtb = diemtb;
    }

    public String getMsv() {
        return msv;
    }

    public void setMsv(String msv) {
        this.msv = msv;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public int getNamsinh() {
        return namsinh;
    }

    public void setNamsinh(int namsinh) {
        this.namsinh = namsinh;
    }

    public double getDiemtb() {
        return diemtb;
    }

    public void setDiemtb(double diemtb) {
        this.diemtb = diemtb;
    }
    
    @Override
    public String toString() {
        return "SinhVien{" + "msv=" + msv + ", hoten=" + hoten + ", namsinh=" + namsinh + ", diemtb=" + diemtb + '}';
    }

    @Override
    public int compareTo(SinhVien o) {
        return this.msv.compareTo(o.msv);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final SinhVien other = (SinhVien) obj;
        
        return Objects.equals(this.msv, other.msv);
    }
    
    
    
    
}
