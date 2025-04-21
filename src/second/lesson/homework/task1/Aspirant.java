package second.lesson.homework.task1;

public class Aspirant extends Student {

    private ScientificWork work;

    public Aspirant(String firstName, String lastName, String group, double averageMark, ScientificWork work) {
        super(firstName, lastName, group, averageMark);
        this.work = work;
    }

    @Override
    public int getScholarship() {
        int ratingMark = 5;
        int maxScholarship = 200;
        int minScholarship = 180;
        return getAverageMark() == ratingMark ? maxScholarship : minScholarship;
    }


}
