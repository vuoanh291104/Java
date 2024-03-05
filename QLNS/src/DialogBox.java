import  javax.swing.JOptionPane;
public class DialogBox {
    public static void main(String[] args) {
        int a= Integer.parseInt(JOptionPane.showInputDialog("Nhap a: "));
        int b=Integer.parseInt(JOptionPane.showInputDialog("Nhap b: "));
        JOptionPane.showMessageDialog(null,"Tong: "+(a+b)+"\nHieu: "+(a-b)
        +"\nTich: "+ (a*b)+"\nThuong: "+ (1.0*a/b)+ "\nchia du: "+ (a%b));
    }
}
