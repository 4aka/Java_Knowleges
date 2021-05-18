package J_Patterns.Builder;

public class BuilderAnimal {
    private String type;
    private String name;
    private int age;
    private double weight;

    public BuilderAnimal(String type, String name, int age, double weight) {
        super();
        this.type = type;
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }
}