package third.lesson.homework.task3;

public class Tie extends Cloth implements MenClothingInterface {

    public Tie(ClothingSize clothingSize, int price, String color) {
        super(clothingSize, price, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Мужчина носит галстук");
    }
}
