package second.lesson.homework.task2;

public class Dog extends Animal {

    private String name;
    private String breed;

    public Dog(String food, String location, String name, String breed) {
        super(food, location);
        this.name = name;
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public void makeNoise() {
        System.out.println("The dog is barking");
    }

    @Override
    public void eat() {
        System.out.println("The dog loves " + getFood());
    }
}
