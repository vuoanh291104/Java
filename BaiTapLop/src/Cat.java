public class Cat extends Animal {
    protected int age;
    protected String color;
    protected double height;
    public Cat(){}

    public Cat(int age, String color, double height) {
        this.age = age;
        this.color = color;
        this.height = height;
    }

    public Cat(String name, int age, String color, double height) {
        super(name);
        this.age = age;
        this.color = color;
        this.height = height;
    }

    @Override
    public void talk() {
        System.out.println("Meow meow");
    }
}
