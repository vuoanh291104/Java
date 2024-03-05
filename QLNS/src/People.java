import java.util.Scanner;

public class People {
    Scanner sc = new Scanner(System.in);

    protected String hoTen;
    protected String ngaySinh;
    protected String gioiTinh;
    protected String queQuan;
    public People(){}

    public People(String hoTen, String ngaySinh, String gioiTinh, String queQuan) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.queQuan = queQuan;
    }
    public void NhapTen(){
        this.hoTen= sc.nextLine();
    }
    public void NhapNgaySinh(){
        this.ngaySinh =sc.nextLine();
    }
    public void Nhapgioitinh(){
        this.gioiTinh=sc.nextLine();
    }
    public void NhapQuequan(){
        this.queQuan=sc.nextLine();
    }
    public void inthongTin(){
        System.out.println("Ho ten: "+ this.hoTen + "\nNgay sinh: "+ this.ngaySinh + " \nGioi tinh: "+this.gioiTinh +" \nQue quan:" +this.queQuan);
    }
}
