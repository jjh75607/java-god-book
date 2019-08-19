package vo1.mission;

public class ManageStudent {

    public static void main(String[] args) {
        ManageStudent manage = new ManageStudent();
        Student[] students = null;

        students = manage.addStudent();
        manage.printStudents(students);
    }

    public Student[] addStudent() {
        Student[] students = new Student[3];
        students[0] = new Student("Lim");
        students[1] = new Student("Min");
        students[2] = new Student("Sook", "Seoul", "010XXXXX", "ask@email.com");

        return students;
    }

    public void printStudents(Student[] student) {
        for (Student s : student) {
            System.out.println(s);
        }
    }
}
