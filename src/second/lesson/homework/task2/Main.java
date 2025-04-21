package second.lesson.homework.task2;

public class Main {

    public static void main(String[] args) {
        Animal cat = new Cat("milk", "home", "Barsik", "ginger");
        Animal dog = new Dog("meat", "home", "Bobik", "Labrador");
        Animal horse = new Horse("grass", "farm", "Wind", 60);

        Vet vet = new Vet();
        Animal[] animals = {cat, dog, horse};
        for (Animal animal : animals) {
            vet.treatAnimal(animal);
            System.out.println("=========================");
        }
    }

}
