package Vegetable;

public class Lettuce extends Vegetable {
    public Lettuce() {
        super("Vegetable.Lettuce", "Leafy", "Plant in 40-60 fahrenheit soil, harvest after 7-10 days, plant 0.25-0.5 inches deep.");
    }
    public String feed() {
        return "Gave lettuce nitrogen-rich fertilizer and organic mulch.";
    }
    public String water() {
        return "Lightly sprinkled leaves with water.";
    }
    public String harvest() {
        return "Removed " + (int) (Math.random() * 5 + 4) + " outer leaves from lettuce.";
    }
}
