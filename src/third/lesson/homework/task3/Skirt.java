package third.lesson.homework.task3;

public class Skirt extends Cloth implements WomenClothingInterface {

    public Skirt(ClothingSize clothingSize, int price, String color) {
        super(clothingSize, price, color);
    }

    @Override
    public void dressWoman() {
        System.out.println("Женщина носит юбку");
    }
}
