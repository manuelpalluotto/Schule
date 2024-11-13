import javax.swing.*;

public class Exe {
    public static void main(String[] args) {
        Database db = new Database();

        db.connectToDatabase();

        SwingUtilities.invokeLater(GUI::new);
    }
}
