import java.util.ArrayList;

public class Cohort {

    private String name;
    private ArrayList<Student> student;

    public Cohort(String name){
        this.name = name;
        this.student = new ArrayList<>();
    }


    // Getters and Setters


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Student> getStudents() {
        return student;
    }

    public void setStudents(ArrayList<Student> student) {
        this.student = student;
    }

    // Behaviours

    public int countStudents(){
        return this.student.size();
    }

    public void addStudents(Student student){
        this.student.add(student);
    }
}
