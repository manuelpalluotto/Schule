import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;

public class Database {
    public static void main(String[] args) {
        // Ersetze den Pfad mit dem Pfad zu deiner SQLite-Datenbank
        String url = "jdbc:sqlite:/home/manuelpalluotto/mydatabase.db";

        // Verbindung zur SQLite-Datenbank herstellen
        try (Connection conn = DriverManager.getConnection(url)) {
            if (conn != null) {
                System.out.println("Verbindung zur Datenbank erfolgreich!");

                // Beispiel: Daten aus einer Tabelle abfragen
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM deineTabelle;");

                // Daten aus der Tabelle ausgeben
                while (rs.next()) {
                    System.out.println(rs.getString("deinFeldName"));
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}