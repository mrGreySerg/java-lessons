package firstlesson.homework.task3;

import java.util.Random;

public class Warrior {

    protected String name;
    private int health = 100;

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public Warrior(String name) {
        this.name = name;
    }

    public void showInfo() {
        System.out.printf("Warrior name - %s. Health - %d points.\n",
                name, health);
    }

    public void fight(Warrior firstUnit, Warrior secondUnit) {
        Random random = new Random();
        Warrior[] warriors = { firstUnit, secondUnit };
        while (firstUnit.health > 0 && secondUnit.health > 0) {
            Warrior attackWarrior = warriors[random.nextInt(warriors.length)];
            Warrior attackedWarrior = attackWarrior.equals(firstUnit) ? secondUnit : firstUnit;
            attackWarrior.hit(attackedWarrior);
            System.out.printf("%s атаковал %s. У противника осталось здоровья - %d",
                    attackWarrior.name, attackedWarrior.name, attackedWarrior.health);
        }
        return;
    }

    public void hit(Warrior warrior) {
        int damageOfHit = 20;
        int healthAfterHit = warrior.getHealth() - damageOfHit;
        warrior.setHealth(healthAfterHit);
    }

    public static void main(String[] args) {

        Warrior achilles = new Warrior("Achilles");
        Warrior hercules = new Warrior("Hercules");

        achilles.showInfo();
        hercules.showInfo();

        Random random = new Random();
        Warrior[] warriors = { achilles, hercules };

        new Battle().fight(hercules, achilles);





    }



    /*
    Напишите программу по следующему описанию. Есть класс "Воин".
    От него создаются два экземпляра-юнита. Каждому устанавливается
    здоровье в 100 очков. В случайном порядке они бьют друг друга.
        Тот, кто бьет, здоровья не теряет. У того, кого бьют, оно
    уменьшается на 20 очков от одного удара. После каждого удара надо
    выводить сообщение, какой юнит атаковал, и сколько у противника
    осталось здоровья. Как только у кого-то заканчивается ресурс здоровья,
    программа завершается сообщением о том, кто одержал победу.\
    */
}
