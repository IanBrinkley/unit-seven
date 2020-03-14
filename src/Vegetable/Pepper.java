package Vegetable;

public class Pepper extends Vegetable {
    public Pepper() {
        super("Vegetable.Pepper", "Vegetable.Pepper", "Plant in full sunlight, well-draining soil, 1/4th inch deep.");
    }
    public String feed() {
        return "Gave pepper plant high-potassium, high-phosphate fertilizer.";
    }
    public String water() {
        return "Gave carrot 1.5 inches of water.";
    }
    public String harvest() {
        return "Harvested " + (int) (Math.random() * 3 + 3) + " peppers.";
    }
}
