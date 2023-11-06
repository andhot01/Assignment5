import java.util.ArrayList;

public class Student extends Person{
    private ArrayList<GradeInfo> gradeReport;
    private String education;

    public Student(int id, String name, String email, String education) {
        super(id, name, email);
        this.education = education;
        this.gradeReport = new ArrayList<>();
    }

    public ArrayList<GradeInfo> getGradeReport() {
        return gradeReport;
    }

    public String getEducation() {
        return education;
    }

    public void addGrade(String subject, int grade){
        gradeReport.add(new GradeInfo(subject, grade));
    }

    public double calcAverageGrade(){
        double sum = 0.0;

        for (GradeInfo grade : gradeReport){
            sum += grade.getGrade();
        }
        return sum / gradeReport.size();
    }

    public String toString(){
        return super.toString() + " " + education + " " + calcAverageGrade();
    }
}
