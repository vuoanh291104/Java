public class SinhVien extends People{
    private String lop;
    private String khoa;
    public SinhVien(){}

    public SinhVien(String lop, String khoa) {
        this.lop = lop;
        this.khoa = khoa;
    }

    public SinhVien(String hoTen, String ngaySinh, String gioiTinh, String queQuan, String lop, String khoa) {
        super(hoTen, ngaySinh, gioiTinh, queQuan);
        this.lop = lop;
        this.khoa = khoa;
    }
    public void nhapLop(){
        this.lop=sc.nextLine();
    }
    public void nhapKhoa(){
        this.khoa=sc.nextLine();
    }
    public void inSinhVien(){
        super.inthongTin();
        System.out.println("Lop: " +this.lop +"\nKhoa: "+ this.khoa);
    }

}
