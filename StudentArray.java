public class StudentArray {
    public static void main(String[] args) {
       Student  []student = {
        new Student("Aryan", "biratnagar", "csit", "981900000"),
        new Student("Sujata", "Canda", "CSE", "981900100"),
        new Student("Aryan", "biratnagar", "csit", "981900000"),
       };
        for (Student student1 : student) {
            student1.display();
        }
    }
}
