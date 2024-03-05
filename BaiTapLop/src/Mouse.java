public class Mouse extends Animal {
    private double weight;
    public Mouse(){}

    public Mouse(double weight) {
        this.weight = weight;
    }

    public Mouse(String name, double weight) {
        super(name);
        this.weight = weight;
    }

    @Override
    public void talk() {
        System.out.println("Chit chit");
    }
}
