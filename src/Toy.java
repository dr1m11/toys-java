public class Toy {
    private int id;
    private String name;
    int quantity;
    private double frequency;

    public Toy(int id, String name, int quantity, double frequency) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.frequency = frequency;
    }

    public void setFrequency(double frequency) {
        this.frequency = frequency;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getFrequency() {
        return frequency;
    }
}