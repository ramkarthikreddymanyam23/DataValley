package assignement5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Department {
    private int id;
    private String name;

    public Department(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Getters and setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Method to insert department into database
    public void insertIntoDatabase() {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/your_database_name", "username", "password");

            String query = "INSERT INTO department (id, name) VALUES (?, ?)";
            PreparedStatement preparedStatement = conn.prepareStatement(query);
            preparedStatement.setInt(1, id);
            preparedStatement.setString(2, name);

            preparedStatement.executeUpdate();

            System.out.println("Department added successfully.");

            conn.close();
        } catch (SQLException e) {
            System.out.println("Error inserting department: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Department department = new Department(1, "HR");
        department.insertIntoDatabase();
    }
}