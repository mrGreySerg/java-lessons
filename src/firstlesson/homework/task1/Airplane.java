package firstlesson.homework.task1;

import java.time.Year;

public class Airplane {

    private String producer;
    private int year;
    private int length;
    private double weight;
    private int fuel;

    public String getProducer() {
        return producer;
    }

    public int getYear() {
        return year;
    }

    public int getLength() {return year;}

    public double getWeight() {
        return weight;
    }

    public int getFuel() {
        return fuel;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public Airplane(String producer, int year, int length, double weight) {
        setFuel(100);
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
    }

    public void info() {
        System.out.printf("""
                Изготовитель: %s, год выпуска: %d, длина: %d,
                вес: %f, количество топлива в баке: %d.
                """, producer, year, length, weight, fuel);
    }

    public static void main(String[] args) {

        Airplane boeingPlane = new Airplane("Boeing",1900,
                74, 140);
        boeingPlane.setFuel(90);

        AirplaneService service = new AirplaneService();
        int costOfFuel = service.refuel(boeingPlane);
        System.out.printf("Cамолет заправили на %2d рублей \n", costOfFuel);

        int currentYear = Year.now().getValue();
        service.checkCondition(boeingPlane, currentYear);

        Airplane airbusPlane = new Airplane("Airbus",1900,
                74, 45);
        Airplane embraerPlane = new Airplane("Embraer",1900,
                74, 120);
        Airplane hawkerPlane = new Airplane("Hawker",1900,
                74, 51);

        int count = service.countPlanesOver50Weight(new Airplane[]{airbusPlane, embraerPlane, hawkerPlane});
        System.out.printf("Количество самолетов весом более 50т - %d", count);
    }
}
