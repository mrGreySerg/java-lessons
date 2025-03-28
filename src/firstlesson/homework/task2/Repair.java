package firstlesson.homework.task2;

public class Repair {

    public void repairEngine(Car car) {
        car.engine.setDurability(100);
    }

    public Car getMostWearout (Car[] cars) {
        int minWearout = cars[0].engine.getDurability();
        int indexMostWearoutCar = 0;
        for (int i = 0; i < cars.length; i++) {
            if (cars[i].engine.getDurability() < minWearout){
                minWearout = cars[i].engine.getDurability();
                indexMostWearoutCar = i;
            }

        }
        return cars[indexMostWearoutCar];
    }
}
