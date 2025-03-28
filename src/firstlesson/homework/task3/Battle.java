package firstlesson.homework.task3;

import java.util.Random;

public class Battle {

    public void fight(Warrior firstUnit, Warrior secondUnit) {
        Random random = new Random();
        Warrior[] warriors = { firstUnit, secondUnit };
        while (firstUnit.getHealth() > 0 && secondUnit.getHealth() > 0) {
            Warrior attackWarrior = warriors[random.nextInt(warriors.length)];
            Warrior attackedWarrior = attackWarrior.equals(firstUnit) ? secondUnit : firstUnit;
            attackWarrior.hit(attackedWarrior);
            descriptionOfBattle(attackWarrior, attackedWarrior);
        }
        for (Warrior warrior : warriors) {
            if (warrior.getHealth() != 0) {
                System.out.printf("%s одержал победу!!!", warrior.name);
            }
        }
        return;
    }

    public void descriptionOfBattle(Warrior attackWarrior, Warrior attackedWarrior) {
        System.out.printf("%1$s атаковал %2$s. У нападающего %1$s %3$d здоровья. У атакуемого %2$s %4$d здоровья\n",
                attackWarrior.name, attackedWarrior.name,
                attackWarrior.getHealth(), attackedWarrior.getHealth());
    }

    public void hit(Warrior warrior) {
        int damageOfHit = 20;
        int healthAfterHit = warrior.getHealth() - damageOfHit;
        warrior.setHealth(healthAfterHit);
    }

}
