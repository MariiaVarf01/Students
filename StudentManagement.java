import java.util.ArrayList;

class StudentManagement {
    private static ArrayList<Student> students = new ArrayList<>();
    private static int totalStudents = 0;

    // Add a new student
    public static void addStudent(String name, int id, int age, String grade) {
        if (isDuplicateID(id)) {
            System.out.println("Error: A student with this ID already exists.");
            return;
        }
        students.add(new Student(name, id, age, grade));
        totalStudents++;
        System.out.println("Student added successfully!");
    }

    // Check for duplicate ID
    private static boolean isDuplicateID(int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                return true;
            }
        }
        return false;
    }

    // Update student information
    public static void updateStudent(int id, String name, int age, String grade) {
        for (Student student : students) {
            if (student.getId() == id) {
                student.setName(name);
                student.setAge(age);
                student.setGrade(grade);
                System.out.println("Student updated successfully!");
                return;
            }
        }
        System.out.println("Error: Student ID not found.");
    }

    // View student by ID
    public static void viewStudentById(int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                System.out.println("\n--- Student Details ---");
                student.displayDetails();
                return;
            }
        }
        System.out.println("Error: Student ID not found.");
    }
    // View all students details
    public static void viewStudents() {
        if (students.isEmpty()) {
            System.out.println("No students available.");
            return;
        }
        System.out.println("\n--- Student List ---");
        for (Student student : students) {
            student.displayDetails();
        }
    }

    // Get total students count
    public static int getTotalStudents() {
        return totalStudents;
    }
}
