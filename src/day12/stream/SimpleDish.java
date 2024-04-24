package day12.stream;

public class SimpleDish {

    private final String name;
    private final int calories;

    public SimpleDish(String name, int calories) {
        this.name = name;
        this.calories = calories;
    }

    public SimpleDish(Dish d) {
        this.name = d.getName();
        this.calories = d.getCalories();
    }

    public String getName() {
        return name;
    }

    public int getCalories() {
        return calories;
    }

    @Override
    public String toString() {
        return "SimpleDish{" +
                "name='" + name + '\'' +
                ", calories=" + calories +
                '}';
    }
}
