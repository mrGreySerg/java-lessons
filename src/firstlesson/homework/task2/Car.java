package firstlesson.homework.task2;

public class Car {

    private String model;

    public Engine engine;

    public Car(String model, Engine engine) {
        this.model = model;
        this.engine = engine;
    }

    public void carMove(int pathTraveled) {
        int wearout = 10;
        for (int path = pathTraveled; path >= 1000; path -= 1000) {
            engine.setDurability(engine.getDurability() - wearout);
        }
    }

    public void showEngineInfo() {
        System.out.printf("Состояние двигателя %s после пробега - %d%% \n",
               model, engine.getDurability());
    }

    public static void main(String[] args) {

        Car opelAsta = new Car("Opel Astra", new Engine());
        System.out.printf("Запас двигателя - %d%%  \n",
                opelAsta.engine.getDurability());

        opelAsta.carMove(1200);
        opelAsta.carMove(2000);

        opelAsta.showEngineInfo();

        new Repair().repairEngine(opelAsta);
        System.out.println("Прошло восстановление двигателя");
        opelAsta.showEngineInfo();

        Car nissan = new Car("Nissan", new Engine());
        nissan.carMove(2500);
        nissan.showEngineInfo();

        Car volga = new Car("Volga", new Engine());

        Car[] listCars = { opelAsta, nissan, volga };
        Car mostWearoutCar = new Repair().getMostWearout(listCars);
        System.out.printf("Самая убитая машина - %s", mostWearoutCar.model);
    }

}
