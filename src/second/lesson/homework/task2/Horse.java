package second.lesson.homework.task2;

public class Horse extends Animal {

    private String name;
    private int maxSpeed;


    public Horse(String food, String location, String name, int maxSpeed) {
        super(food, location);
        this.name = name;
        this.maxSpeed = maxSpeed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void makeNoise() {
        System.out.println("The horse neighs");
    }

    @Override
    public void eat() {
        System.out.println("The horse loves " + getFood());
    }
}
