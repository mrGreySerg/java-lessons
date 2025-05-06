package third.lesson.homework.task3;


public enum ClothingSize {
    XXS(32), XS(34), S(36), M(38), L(40);

    private final int euroSize;

    ClothingSize(int euroSize) {
        this.euroSize = euroSize;
    }

    public static void main(String[] args) {
        System.out.println(XXS.getDescription());
        for (ClothingSize size1 : ClothingSize.values()) {
            System.out.println(size1);
        }
    }

    public int getEuroSize() {
        return euroSize;
    }

    public String getDescription() {
        return this == XXS ? "Детский размер" : "Взрослый размер";
    }

}
