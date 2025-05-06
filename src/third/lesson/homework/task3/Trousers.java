package third.lesson.homework.task3;

public class Trousers extends Cloth implements MenClothingInterface, WomenClothingInterface {

    public Trousers(ClothingSize clothingSize, int price, String color) {
        super(clothingSize, price, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Мужчина носит брюки");

    }

    @Override
    public void dressWoman() {
        System.out.println("Женщина носит брюки");

    }
}
