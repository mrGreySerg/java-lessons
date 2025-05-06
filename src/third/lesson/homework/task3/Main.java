package third.lesson.homework.task3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cloth skirt = new Skirt(ClothingSize.M, 3_000, "green");
        Cloth trousers = new Trousers(ClothingSize.L, 2_500, "black");
        Cloth tshirt = new Tshirt(ClothingSize.M, 1_500, "white");
        Cloth tie = new Tie(ClothingSize.S, 2_000, "brown");
        List<Cloth> clothesList = new ArrayList<>(List.of(skirt, trousers, tshirt, tie));

        Studio.dressMan(clothesList);
        Studio.dressWoman(clothesList);
    }

}
