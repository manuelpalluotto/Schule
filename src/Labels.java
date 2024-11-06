import javax.swing.*;
import java.awt.*;

public class Labels {
    public JLabel myLabel;

    public Labels(String name) {
        myLabel = new JLabel(name, SwingConstants.CENTER);
        myLabel.setForeground(Color.WHITE);
        myLabel.setFont(new Font("Arial", Font.BOLD, 120));
        myLabel.setHorizontalAlignment(SwingConstants.CENTER);
        myLabel.setVerticalAlignment(SwingConstants.CENTER);
        myLabel.setVisible(false);
    }
    public JLabel getLabel() {
        return myLabel;
    }
}
