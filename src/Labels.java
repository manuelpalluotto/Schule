import javax.swing.*;
import java.awt.*;

public class Labels {
    public JLabel myLabel;

    public Labels(String name, int width, int height) {
        myLabel = new JLabel(name, SwingConstants.CENTER);
        myLabel.setForeground(Color.WHITE);
        myLabel.setFont(new Font("Arial", Font.BOLD, 45));
        myLabel.setHorizontalAlignment(SwingConstants.CENTER);
        myLabel.setVerticalAlignment(SwingConstants.CENTER);
        myLabel.setVisible(false);
    }

    public JLabel getLabel() {
        return myLabel;
    }

    public void setMyLabelVisible() {
        myLabel.setVisible(true);
    }

    public void setNewFont(int size) {
        myLabel.setFont(new Font("Arial", Font.BOLD, size));
    }
}
