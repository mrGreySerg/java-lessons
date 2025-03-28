package firstlesson.homework.task1;

public class AirplaneService {

    public int refuel(Airplane airplane) {
        int maxFuel = 100;
        if (airplane.getFuel() < maxFuel) {
            int fuelForRefuel = maxFuel - airplane.getFuel();
            int fuelCost = 56;
            airplane.setFuel(maxFuel);
            return fuelForRefuel * fuelCost;
        }

        return 0;
    }

    public void checkCondition(Airplane airplane, int currentYear) {

        int maxServiceLife = 30;
        System.out.println(currentYear - airplane.getYear() > maxServiceLife ?
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
