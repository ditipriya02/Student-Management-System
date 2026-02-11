public class Main {
    public static void main(String[] args) {

        Student s = new Student("Trisha", "ROLL999", "BCA", 88, "9876543210");

        StudentDAO dao = new StudentDAO();

        if (dao.addStudent(s)) {
            System.out.println("✅ Student added successfully!");
        } else {
            System.out.println("❌ Failed to add student!");
        }
    }
}
