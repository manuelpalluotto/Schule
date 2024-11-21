import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class GameFrame extends JFrame {
    GUI gui;
    Dimension screenSize;
    JLabel backgroundLabel;
    JPanel gridPanel;
    String currentPlayer;

    public GameFrame(GUI gui) {
        currentPlayer = "X";

        this.gui = gui;

        screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        setSize(screenSize.width, screenSize.height - 30);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        //setUndecorated(true);



        backgroundLabel = new JLabel(new ImageIcon(GameFrame.class.getResource("/TTT3.png")));
        backgroundLabel.setLayout(new BorderLayout());

        gridPanel = new JPanel(new GridLayout(3, 3));
        gridPanel.setOpaque(false);

        ArrayList<JButton> playButtons = new ArrayList<>();
        ArrayList<JLabel> playLabels = new ArrayList<>();


        for (int i = 0; i < 9; i++) {
            CardLayout cardLayout = new CardLayout();
            JPanel cardPanel = new JPanel(cardLayout);
            cardPanel.setOpaque(false);

            JLabel playLabel = new JLabel("");
            playLabel.setFont(new Font("Times new Roman", Font.BOLD, 50));
            playLabel.setVerticalAlignment(SwingConstants.CENTER);
            playLabel.setHorizontalAlignment(SwingConstants.CENTER);
            playLabel.setForeground(Color.WHITE);

            playLabels.add(playLabel);


            JButton playButton = new JButton();
            playButtons.add(playButton);
            playButton.setContentAreaFilled(false);
            playButton.setBorderPainted(false);
            cardPanel.add(playButton);
            cardPanel.add(playLabel);

            playButton.addActionListener(e -> {
                cardLayout.previous(cardPanel);
                playLabel.setText(currentPlayer);
                currentPlayer = currentPlayer.equals("X") ? "O" : "X";
            });
            gridPanel.add(cardPanel);
        }

        backgroundLabel.add(gridPanel);
        add(backgroundLabel);
        setVisible(false);
    }
}
