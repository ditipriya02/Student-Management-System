import java.sql.Connection;
import java.sql.PreparedStatement;

public class StudentDAO {

    public boolean addStudent(Student s) {

        boolean result = false;

        try {
            Connection con = DBConnection.getConnection();

            String query = "INSERT INTO students(name, roll, department, marks, phone) VALUES (?, ?, ?, ?, ?)";

            PreparedStatement pst = con.prepareStatement(query);

            pst.setString(1, s.getName());
            pst.setString(2, s.getRoll());
            pst.setString(3, s.getDepartment());
            pst.setInt(4, s.getMarks());
            pst.setString(5, s.getPhone());

            int rows = pst.executeUpdate();

            if (rows > 0) {
                result = true;
            }

            pst.close();
            con.close();

        } catch (Exception e) {
            System.out.println("❌ Insert failed!");
            e.printStackTrace();
        }

        return result;
    }
}
