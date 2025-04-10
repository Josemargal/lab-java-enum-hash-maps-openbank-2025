import java.util.HashMap;
import java.util.Map;

public class StudentGradeManagement {

    public static void main(String[] args) {

        Map<String, Student> studentMap = new HashMap<>();

        Student student1 = new Student("Carlos", 75);
        Student student2 = new Student("Maria", 82);
        Student student3 = new Student("Juan", 68);
        Student student4 = new Student("Ana", 91);

        studentMap.put(student1.getName(), student1);
        studentMap.put(student2.getName(), student2);
        studentMap.put(student3.getName(), student3);
        studentMap.put(student4.getName(), student4);


        System.out.println("Original grades:");
        displayStudents(studentMap);

        Map<String, Student> updatedMap = increaseGrades(studentMap);

        System.out.println("\nGrades after 10% increase:");
        displayStudents(updatedMap);
    }


    public static Map<String, Student> increaseGrades(Map<String, Student> studentMap) {
        for (Student student : studentMap.values()) {

            int newGrade = (int) Math.min(100, student.getGrade() * 1.1);
            student.setGrade(newGrade);
        }
        return studentMap;
    }

    public static void displayStudents(Map<String, Student> studentMap) {
        for (Map.Entry<String, Student> entry : studentMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue().getGrade());
        }
    }
}

class Student {
    private String name;
    private int grade;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}
