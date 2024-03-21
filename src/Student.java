import java.util.Scanner;
public class Student {
    private String codeStudent;
    private double averageScore;
    private int age;
    private String classStudent;

    public Student() {
    }

    public Student(String codeStudent, double averageScore, int age, String classStudent) {
        this.codeStudent = codeStudent;
        this.averageScore = averageScore;
        this.age = age;
        this.classStudent = classStudent;
    }

    public String getCodeStudent() {
        return codeStudent;
    }

    public void setCodeStudent(String codeStudent) {
        this.codeStudent = codeStudent;
    }

    public double getaverageScore() {
        return averageScore;
    }

    public void setPoint(double averageScore) {
        this.averageScore = averageScore;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getClassStudent() {
        return classStudent;
    }

    public void setClassStudent(String classStudent) {
        this.classStudent = classStudent;
    }
    public void  inputInfo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập mã hoc sinh:");
        this.codeStudent = sc.nextLine();
        System.out.println("nhập điểm học sinh");
        this.averageScore = Double.parseDouble(sc.nextLine());
        System.out.println("nhập tuổi học sinh");
        this.age = Integer.parseInt(sc.nextLine());
        System.out.println("nhập lớp của học sinh");
        this.classStudent = sc.nextLine();
    }
    public void  showInfo(){
        System.out.print("mã học sinh là: " + this.codeStudent);
        System.out.print(" điểm học sinh là: " + this.averageScore);
        System.out.print(" tuổi học sinh là: " + this.age);
        System.out.print(" lớp của học sinh là: " + this.classStudent);
    }
    public boolean isScholarshipEligible(){
      return this.averageScore >= 8;
    }

    public static void main(String[] args) {
        Student student1 = new Student();
        student1.inputInfo();
        student1.showInfo();

        if (student1.isScholarshipEligible()) {
            System.out.println("Sinh viên được học bổng!");
        } else {
            System.out.println("Sinh viên không được học bổng.");
        }
    }
}
