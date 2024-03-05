public class RobotCat extends Cat{
    private String batery;

    public RobotCat(){}

    public RobotCat(String batery) {
        this.batery = batery;
    }

    public RobotCat(int age, String color, double height, String batery) {
        super(age, color, height);
        this.batery = batery;
    }

    public RobotCat(String name, int age, String color, double height, String batery) {
        super(name, age, color, height);
        this.batery = batery;
    }

    @Override
    public void talk() {
        System.out.println("Xin chao");
    }
}
