package Vegetable;

public class Carrot extends Vegetable {
    public Carrot() {
        super("Vegetable.Carrot", "Root", "Plant in full sunlight, loose soil, harvest at minimum 1/2 inch diameter, plant 12 inches deep.");
    }
    public String feed() {
        return "Gave carrot mulch and low-nitrogen fertilizer.";
    }
    public String water() {
        return "Gave carrot one inch of water.";
    }
    public String harvest() {
        if ((int) (Math.random() * 7) == 0) {
            return "The leaves broke off of the carrot.";
        } else {
            return "Pulled carrot from ground!";
        }
    }
}
