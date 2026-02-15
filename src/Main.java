import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StudentDAO dao = new StudentDAO();

        int choice;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Add Sample Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search Student by Roll");
            System.out.println("4. Exit");

            System.out.print("Enter choice: ");

            // -------- Menu Validation --------
            if (!sc.hasNextInt()) {
                System.out.println("⚠ Invalid input! Enter number only.");
                sc.next(); // clear wrong input
                continue;
            }

            choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (choice) {

                // (Keeping your original insert for testing)
                case 1:
                    Student s = new Student("Trisha", "ROLL999", "BCA", 88, "9876543210");

                    if (dao.addStudent(s)) {
                        System.out.println("✅ Student added successfully!");
                    } else {
                        System.out.println("❌ Failed to add student!");
                    }
                    break;

                // ---------------- OPTION 2 ----------------
                case 2:
                    ArrayList<Student> list = dao.getAllStudents();

                    if (list.isEmpty()) {
                        System.out.println("No students found.");
                    } else {
                        for (Student st : list) {
                            System.out.println("----------------------");
                            System.out.println("Name : " + st.getName());
                            System.out.println("Roll : " + st.getRoll());
                            System.out.println("Dept : " + st.getDepartment());
                            System.out.println("Marks: " + st.getMarks());
                            System.out.println("Phone: " + st.getPhone());
                        }
                    }
                    break;

                // ---------------- OPTION 3 ----------------
                case 3:
                    System.out.print("Enter Roll: ");
                    String roll = sc.nextLine();

                    // Roll Validation
                    if (roll.trim().isEmpty()) {
                        System.out.println("⚠ Roll should not be empty!");
                        break;
                    }

                    Student found = dao.getStudentByRoll(roll);

                    if (found != null) {
                        System.out.println("\nStudent Found:");
                        System.out.println("Name : " + found.getName());
                        System.out.println("Roll : " + found.getRoll());
                        System.out.println("Dept : " + found.getDepartment());
                        System.out.println("Marks: " + found.getMarks());
                        System.out.println("Phone: " + found.getPhone());
                    } else {
                        System.out.println("❌ Student not found!");
                    }
                    break;

                case 4:
                    System.out.println("Program closed.");
                    break;

                default:
                    System.out.println("⚠ Invalid menu choice!");
            }

        } while (choice != 4);

        sc.close();
    }
}
