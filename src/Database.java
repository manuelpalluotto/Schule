import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;

public class Database {

    // Diese Methode stellt eine Verbindung zur SQLite-Datenbank her und führt eine Abfrage aus
    public void connectToDatabase() {
        String url = "jdbc:sqlite:/home/manuelpalluotto/mydatabase.db";

        try {
            Class.forName("org.sqlite.JDBC"); // Lade den SQLite JDBC-Treiber

            try (Connection conn = DriverManager.getConnection(url)) {  // Verbindung herstellen
                if (conn != null) {
                    System.out.println("Verbindung zur Datenbank erfolgreich!");

                    Statement stmt = conn.createStatement();  // Erstelle ein Statement

                    // Führe die SQL-Abfrage aus, um Daten aus der "users"-Tabelle zu holen
                    ResultSet rs = stmt.executeQuery("SELECT * FROM test;");

                    // Schleife durch das ResultSet und gebe die Daten aus
                    while (rs.next()) {
                        // Hier wird die Spalte "username" für jedes Ergebnis ausgegeben
                        System.out.println(rs.getString("username"));
                    }
                }
            }
        } catch (ClassNotFoundException e) {
            System.out.println("SQLite JDBC-Treiber nicht gefunden.");
        } catch (Exception e) {
            System.out.println("Fehler bei der Verbindung zur Datenbank: " + e.getMessage());
        }
    }
}

