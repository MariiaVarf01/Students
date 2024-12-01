import java.util.Scanner;

public class StudentRecordManagementSystem {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n--- Student Record Management System ---");
            System.out.println("1. Add a new student");
            System.out.println("2. Update student information");
            System.out.println("3. View students details");
            System.out.println("4. View student detail by ID");
            System.out.println("5. Exit");
            System.out.print("Enter your choice (1–5): ");

            int choice = getMenuChoice();

            switch (choice) {
                case 1 -> addStudentMenu();
                case 2 -> updateStudentMenu();
                case 3 -> StudentManagement.viewStudents();
                case 4 -> getStudentById();
                case 5 -> {
                    System.out.println("Exiting... Goodbye!");
                    System.exit(0);
                }
            }
        }
    }

    // Menu to add a student
    private static void addStudentMenu() {
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        System.out.print("Enter student ID: ");
        int id = getIntInput();

        System.out.print("Enter student age: ");
        int age = getIntInput();

        System.out.print("Enter student grade: ");
        String grade = scanner.nextLine();

        StudentManagement.addStudent(name, id, age, grade);
    }

    // Menu to update student
    private static void updateStudentMenu() {
        System.out.print("Enter student ID to update: ");
        int id = getIntInput();

        System.out.print("Enter new name: ");
        String name = scanner.nextLine();

        System.out.print("Enter new age: ");
        int age = getIntInput();

        System.out.print("Enter new grade: ");
        String grade = scanner.nextLine();

        StudentManagement.updateStudent(id, name, age, grade);
    }

    // Menu to get ID
    public static void getStudentById() {
        System.out.print("Enter student ID get details: ");
        int id = getIntInput();

        StudentManagement.viewStudentById(id);
    }

    // Validate menu input
    private static int getMenuChoice() {
        while (true) {
            int choice = getIntInput();
            if (choice >= 1 && choice <= 5) {
                return choice;
            }
            System.out.print("Invalid choice. Please enter a number between 1 and 5: ");
        }
    }

    // Input validation for integers
    private static int getIntInput() {
        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.print("Invalid input. Please enter a number: ");
            }
        }
    }
}
