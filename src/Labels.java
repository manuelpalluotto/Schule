import javax.swing.*;
import java.awt.*;

public class Labels extends JLabel{
    public JLabel myLabel;

    public Labels() {
        myLabel = new JLabel();
        myLabel.setForeground(Color.WHITE);
        myLabel.setFont(new Font("Arial", Font.BOLD, 45));
        myLabel.setHorizontalAlignment(SwingConstants.CENTER);
        myLabel.setVerticalAlignment(SwingConstants.CENTER);
        myLabel.setVisible(false);
    }
}
