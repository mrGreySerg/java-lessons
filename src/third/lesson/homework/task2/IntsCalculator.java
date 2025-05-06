package third.lesson.homework.task2;
/*Создайте класс IntsCalculator, укажите что он имплементирует интерфейс Ints, реализуйте его методы
 через обращение к объекту класса Calculator:
 */

public class IntsCalculator implements Ints {
    protected final Calculator target;

    public IntsCalculator() {
        this.target = new Calculator();
    }

    @Override
    public int sum(int arg0, int arg1) {

        double result = target
                .newFormula()
                .addOperand((double) arg0)
                .addOperand((double) arg1)
                .calculate(Calculator.Operation.SUM)
                .result();
        return (int) result;
    }

    @Override
    public int mult(int arg0, int arg1) {
        double result = target
                .newFormula()
                .addOperand((double) arg0)
                .addOperand((double) arg1)
                .calculate(Calculator.Operation.MULT)
                .result();
        return (int) result;
    }

    @Override
    public int pow(int a, int b) {
        double result = target
                .newFormula()
                .addOperand((double) a)
                .addOperand((double) b)
                .calculate(Calculator.Operation.POW)
                .result();
        return (int) result;
    }

}



