public class Employee {
    private String ten;
    private String ho;
    private double luong;

    public Employee(String ten, String ho) {
        this.ten = ten;
        this.ho = ho;

    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getHo() {
        return ho;
    }

    public void setHo(String ho) {
        this.ho = ho;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        if(luong <0){
            this.luong=0;
        }else{
            this.luong=luong;
        }

    }
    public double themluong(){
        double x= getLuong() + getLuong()*0.1;
        return x;
    }
    public void luong_sau_1_nam(){

        System.out.println(12*getLuong());
    }
}
