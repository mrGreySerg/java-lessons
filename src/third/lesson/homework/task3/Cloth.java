package third.lesson.homework.task3;

public abstract class Cloth {

    private final ClothingSize clothingSize;
    private final int price;
    private final String color;

    public Cloth(ClothingSize clothingSize, int price, String color) {
        this.clothingSize = clothingSize;
        this.price = price;
        this.color = color;
    }

    public ClothingSize getClothingSize() {
        return clothingSize;
    }

    public int getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }
}
