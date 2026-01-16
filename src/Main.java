import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Scanner object for taking input from user
        Scanner sc = new Scanner(System.in);

        int choice;   // variable to store menu choice

        // do-while loop to keep showing menu until user chooses Exit
        do {
            // Menu Display
            System.out.println("\n Student Management System ");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            //  Input Handling 
            choice = sc.nextInt();

            //  Switch-Case Logic
            switch (choice) {
                case 1:
                    System.out.println("Add Student option selected");
                    // call addStudent() method here
                    break;

                case 2:
                    System.out.println("View Students option selected");
                    // call viewStudent() method here
                    break;

                case 3:
                    System.out.println("Update Student option selected");
                    // call updateStudent() method here
                    break;

                case 4:
                    System.out.println("Delete Student option selected");
                    // call deleteStudent() method here
                    break;

                case 5:
                    System.out.println("Exiting the program...");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }

        } while (choice != 5);  
        // Loop continues until user selects Exit (choice 5)

        // Closing scanner resource
        sc.close();
    }
}
