// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        MyStack a= new MyStack(10);
        for(int i=0; i<10; i++){
            a.push(i);
        }
        a.in();
    }
}