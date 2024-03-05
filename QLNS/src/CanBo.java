public class CanBo extends People{
    private String cap_ham;
    private String chucvu;
    public CanBo(){};

    public CanBo(String cap_ham, String chucvu) {
        this.cap_ham = cap_ham;
        this.chucvu = chucvu;
    }

    public CanBo(String hoTen, String ngaySinh, String gioiTinh, String queQuan, String capham, String chucvu) {
        super(hoTen, ngaySinh, gioiTinh, queQuan);
        this.cap_ham =capham;
        this.chucvu=chucvu;
    }
    public void nhapCap_ham(){
        this.cap_ham =sc.nextLine();
    }
    public void nhapChucvu(){
        this.chucvu = sc.nextLine();
    }
    public void inCanbo(){
        super.inthongTin();
        System.out.println("Cap ham: "+ this.cap_ham + "\nChuc vu: " + this.chucvu);
    }
}
