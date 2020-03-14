package Vegetable;

public abstract class Vegetable implements Growable {

    private String name;
    private String type;
    private String instructions;

    public Vegetable(String name, String type, String instructions) {
        this.name = name;
        this.type = type;
        this.instructions = instructions;
    }

    public String getInstructions() {
        return instructions;
    }
    protected void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    public String getName() {
        return name;
    }
    public void setName() {
        this.name = name;
    }
    public String getType() {
        return type;
    }


}
