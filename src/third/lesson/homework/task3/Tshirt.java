package third.lesson.homework.task3;

public class Tshirt extends Cloth implements MenClothingInterface, WomenClothingInterface {

    public Tshirt(ClothingSize clothingSize, int price, String color) {
        super(clothingSize, price, color);
    }

    @Override
    public void dressWoman() {
        System.out.println("Женщина носит футболку");
    }

    @Override
    public void dressMan() {
        System.out.println("Мужчина носит футболку");
    }
}
