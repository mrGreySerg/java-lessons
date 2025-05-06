package third.lesson.homework.task1;


public class Musician {

    private InstrumentInterface instrument;

    public Musician (InstrumentInterface instrument) {
        this.instrument = instrument;
    }

    public void setInstrument(InstrumentInterface instrument) {
        this.instrument = instrument;
    }

    public void startPlay() {
        System.out.println("Берем в руки инструмент.");
        instrument.play();
    }

    public static void main(String[] args) {
        Musician musician = new Musician(new Guitar());
        musician.startPlay();

        musician.setInstrument(new Piano());
        musician.startPlay();
    }

}
