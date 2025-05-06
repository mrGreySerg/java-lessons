package third.lesson.homework.task3;

import java.util.List;

public class Studio {


    public static void dressMan(List<Cloth> clothList) {
        clothList.stream().filter(close -> close instanceof MenClothingInterface)
                .forEach(i -> {
                    ((MenClothingInterface) i).dressMan();
                    System.out.printf("Размер: %d, цена: %d, цвет: %s%n",
                            i.getClothingSize().getEuroSize(), i.getPrice(), i.getColor());
                });
    }

    public static void dressWoman(List<Cloth> clothList) {

        clothList.stream().filter(cloth -> cloth instanceof WomenClothingInterface)
                .forEach(i -> {
                    ((WomenClothingInterface) i).dressWoman();
                    System.out.printf("Размер: %d, цена: %d, цвет: %s%n",
                            i.getClothingSize().getEuroSize(), i.getPrice(), i.getColor());
                });

    }


}
