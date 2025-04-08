package firstlesson.homework.task1;

public class AirplaneService {

    private static final int MAX_FUEL = 100;
    private static final int MAX_SERVICE_LIFE = 30;

    public int refuel(Airplane airplane) {
//        int maxFuel = 100;
        if (airplane.getFuel() < MAX_FUEL) {
            int fuelForRefuel = MAX_FUEL - airplane.getFuel();
            int fuelCost = 56;
            airplane.setFuel(MAX_FUEL);
            return fuelForRefuel * fuelCost;
        }

        return 0;
    }

    public void checkCondition(Airplane airplane, int currentYear) {

//        int maxServiceLife = 30;
        System.out.println(currentYear - airplane.getYear() > MAX_SERVICE_LIFE ?
                "Самолет пора в утиль" : "Самолет ещё полетает");
    }

    public int countPlanesOver50Weight(Airplane[] airplanes) {
        int count = 0;
        int limitValue = 50;
        for (Airplane plane : airplanes) {
            if (plane.getWeight() > limitValue) {
                count++;
            }
        }
        return count;
    }
}
