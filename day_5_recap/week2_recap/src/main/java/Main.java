public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Edward", 24, "St Albans", "Newcastle");

        Cohort cohort = new Cohort("T-Techs");

        cohort.addStudents(student1);

        System.out.println(student1.livesInLondon());

        student1.countToNumber(10);
    }
}
