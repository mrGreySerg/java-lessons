package second.lesson.homework.task2;

public class Cat extends Animal {

    private String name;
    private String furColor;

    public Cat(String food, String location, String name, String furColor) {
        super(food, location);
        this.name = name;
        this.furColor = furColor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFurColor() {
        return furColor;
    }

    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }

    @Override
    public void makeNoise() {
        System.out.println("The cat meows");
    }

    @Override
    public void eat() {
        System.out.println("The cat loves " + getFood());
    }

}
