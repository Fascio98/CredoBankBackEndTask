package Utils;

import java.sql.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DatabaseHelper {
    private static final String DB_URL = "jdbc:sqlite:mydatabase.db";
    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    /**
     * Initialize database and create table if it doesn't exist
     */
    public void initializeDatabase() {
        String createTableSQL = """
                CREATE TABLE IF NOT EXISTS Users (
                    id INTEGER PRIMARY KEY AUTOINCREMENT,
                    test_name TEXT NOT NULL UNIQUE,
                    status TEXT NOT NULL,
                    execution_time TEXT NOT NULL,
                    last_updated TEXT NOT NULL
                )
                """;

        try (Connection conn = DriverManager.getConnection(DB_URL);
             Statement stmt = conn.createStatement()) {
            stmt.execute(createTableSQL);
            System.out.println("Database initialized successfully!");
        } catch (SQLException e) {
            System.err.println("Failed to initialize database: " + e.getMessage());
            e.printStackTrace();
        }
    }

    /**
     * Insert or update test result based on test name
     * @param testName The name of the test
     * @param status The test status (PASSED, FAILED, SKIPPED, etc.)
     * @param executionTime The execution time in milliseconds or formatted string
     */
    public void insertOrUpdateTestResult(String testName, String status, String executionTime) {
        String currentTimestamp = LocalDateTime.now().format(FORMATTER);

        // First check if record exists
        String checkSQL = "SELECT id FROM Users WHERE test_name = ?";
        String insertSQL = "INSERT INTO Users (test_name, status, execution_time, last_updated) VALUES(?, ?, ?, ?)";
        String updateSQL = "UPDATE Users SET status = ?, execution_time = ?, last_updated = ? WHERE test_name = ?";
        try (Connection conn = DriverManager.getConnection(DB_URL)) {
            // Check if record exists
            boolean recordExists;

            try (PreparedStatement checkStmt = conn.prepareStatement(checkSQL)) {
                checkStmt.setString(1, testName);
                ResultSet rs = checkStmt.executeQuery();
                recordExists = rs.next();
            }

            if (recordExists) {
                // Update existing record
                try (PreparedStatement updateStmt = conn.prepareStatement(updateSQL)) {
                    updateStmt.setString(1, status);
                    updateStmt.setString(2, executionTime);
                    updateStmt.setString(3, currentTimestamp);
                    updateStmt.setString(4, testName);
                    updateStmt.executeUpdate();
                    System.out.println("Updated test result for: " + testName);
                }
            } else {
                // Insert new record
                try (PreparedStatement insertStmt = conn.prepareStatement(insertSQL)) {
                    insertStmt.setString(1, testName);
                    insertStmt.setString(2, status);
                    insertStmt.setString(3, executionTime);
                    insertStmt.setString(4, currentTimestamp);
                    insertStmt.executeUpdate();
                    System.out.println("Inserted new test result for: " + testName);
                }
            }
        } catch (SQLException e) {
            System.err.println("Database operation failed: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

