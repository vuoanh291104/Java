public class Duck extends Animal {
    private double weight;
    public Duck(){}

    public Duck(double weight) {
        this.weight = weight;
    }

    public Duck(String name, double weight) {
        super(name);
        this.weight = weight;
    }

    @Override
    public void talk() {
        System.out.println("Vit Vit");
    }
}
