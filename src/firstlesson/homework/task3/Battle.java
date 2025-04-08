package firstlesson.homework.task3;

import java.util.Random;

public class Battle {

    private static final Random RANDOM = new Random();

    public void fight(Warrior firstUnit, Warrior secondUnit) {
        Warrior[] warriors = { firstUnit, secondUnit };
        while (firstUnit.getHealth() > 0 && secondUnit.getHealth() > 0) {
            Warrior attackWarrior = warriors[RANDOM.nextInt(warriors.length)];
            Warrior attackedWarrior = attackWarrior.equals(firstUnit) ? secondUnit : firstUnit;
            attackWarrior.hit(attackedWarrior);
            descriptionOfBattle(attackWarrior, attackedWarrior);
        }
        for (Warrior warrior : warriors) {
            if (warrior.getHealth() != 0) {
                System.out.printf("%s одержал победу!!!", warrior.getName());
            }
        }
        return;
    }

    public void descriptionOfBattle(Warrior attackWarrior, Warrior attackedWarrior) {
        System.out.printf("%1$s атаковал %2$s. У нападающего %1$s %3$d здоровья. У атакуемого %2$s %4$d здоровья\n",
                attackWarrior.getName(), attackedWarrior.getName(),
                attackWarrior.getHealth(), attackedWarrior.getHealth());
    }

}
