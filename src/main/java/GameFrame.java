import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class GameFrame extends JFrame {
    GUI gui;
    Dimension screenSize;
    JLabel backgroundLabel;
    JPanel gridPanel;
    JPanel cardPanel;

    public GameFrame(GUI gui) {
        this.gui = gui;

        screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        setSize(screenSize.width, screenSize.height - 30);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        //setUndecorated(true);

        cardPanel = new JPanel(new CardLayout());

        backgroundLabel = new JLabel(new ImageIcon(GameFrame.class.getResource("/emptyTTT.jpg")));
        backgroundLabel.setLayout(new BorderLayout());

        gridPanel = new JPanel(new GridLayout(3, 3));
        gridPanel.setOpaque(false);

        ArrayList<JButton> playButtons = new ArrayList<>();
        ArrayList<JLabel> playLabels = new ArrayList<>();

        for (int i = 0; i < 9; i++) {
            JButton playButton = new JButton();
            playButtons.add(playButton);
            playButton.setContentAreaFilled(false);
            playButton.addActionListener(e -> {
                playButton.setVisible(false);
            });
            gridPanel.add(playButton);
        }

        for (int i = 0; i < 9; i++) {
            JLabel playLabel = new JLabel();
            playLabels.add(playLabel);
        }

        backgroundLabel.add(gridPanel);
        cardPanel.add(backgroundLabel);
        add(cardPanel);
        setVisible(false);
    }
}
