package JAVA_OOP_DZ;

public class Nipple extends Baby_items{
    
    private String shape;

    public Nipple(String name, double price, double amount, String unit, double minAge, boolean hypoallergic, String shape) {
        super(name, price, amount, unit, minAge, hypoallergic);
        this.shape = shape;
    }
    public Nipple() {
        super("Соска-пустышка", 230, 1, "шт", 0, true);
        this.shape = "Анатомическая";
    }

    public String getShape() {
        return this.shape;
    }

    @Override
    public String toString() {
        String result = String.format("%s\n%s\nФорма: %s", this.getClass().getSimpleName(), super.toString(),
                this.shape);
        return result;
    }
}
