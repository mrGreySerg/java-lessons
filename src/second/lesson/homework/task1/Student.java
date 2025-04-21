package second.lesson.homework.task1;

public class Student {
    private String firstName;
    private String lastName;
    private String group;
    private double averageMark;

    public Student(String firstName, String lastName, String group, double averageMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averageMark = averageMark;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public double getAverageMark() {
        return averageMark;
    }

    public void setAverageMark(double averageMark) {
        this.averageMark = averageMark;
    }

    public int getScholarship() {
        int ratingMark = 5;
        int maxScholarship = 100;
        int minScholarship = 80;
        return averageMark == ratingMark ? maxScholarship : minScholarship;

    }

    public static void main(String[] args) {
        ScientificWork work = new ScientificWork("Quantum Mechanics",
                "Physics");
        Student firstStudent = new Aspirant("Serg", "Ivanov", "3434",
                5, work);
        Student secondStudent = new Student("Maks", "Petrov", "1212", 5);
        Student[] students = {firstStudent, secondStudent};
        for (Student student : students) {
            System.out.printf("%s Scholarship: %d%n", student.firstName, student.getScholarship());
            ;
        }
    }

}
