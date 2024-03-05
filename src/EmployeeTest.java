public class EmployeeTest {
    public static void main(String[] args){
        Employee ojb1= new Employee("Anh","Ha");
        ojb1.setLuong(-1.0);
        Employee ojb2 =new Employee("Thanh","Le");
        ojb2.setLuong(10.0);
        ojb1.luong_sau_1_nam();
        ojb2.luong_sau_1_nam();
        double x=ojb1.themluong();
        double y=ojb2.themluong();
        ojb1.setLuong(x);
        ojb2.setLuong(y);
        ojb1.luong_sau_1_nam();
        ojb2.luong_sau_1_nam();
    }
}
