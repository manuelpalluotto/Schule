import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class GameFrame extends JFrame {
    private GUI gui;
    private Dimension screenSize;
    private JLabel backgroundLabel;
    private JPanel gridPanel;
    private String currentPlayer;
    private String[][] playButtons = new String[3][3];


    public GameFrame(GUI gui) {
        currentPlayer = "X";

        this.gui = gui;

        screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        setSize(screenSize.width, screenSize.height);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setUndecorated(true);
        setExtendedState(JFrame.MAXIMIZED_BOTH);

        backgroundLabel = new JLabel(new ImageIcon(GameFrame.class.getResource("/TTT3.png")));
        backgroundLabel.setLayout(new BorderLayout());

        gridPanel = new JPanel(new GridLayout(3, 3));
        gridPanel.setOpaque(false);
        gridPanel.setSize(screenSize.width, screenSize.height);


        for (int y = 0; y < 3; y++) {
            for (int x = 0; x < 3; x++) {
                JButton playButton = new JButton("");
                playButton.setFont(new Font("Times New Roman", Font.BOLD, 50));
                playButton.setContentAreaFilled(false);
                playButton.setBorderPainted(false);

                gridPanel.add(playButton);

                int finalY = y;
                int finalX = x;


                playButton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        buttonAction(playButton, finalX, finalY);
                    }
                });
            }
        }

        backgroundLabel.add(gridPanel);
        add(backgroundLabel);
        setVisible(true);
    }

    public boolean checkWin() {
        // Check rows and columns
        for (int i = 0; i < 3; i++) {
            if (playButtons[i][0] == currentPlayer && playButtons[i][1] == currentPlayer && playButtons[i][2] == currentPlayer) {
                return true;
            }
            if (playButtons[0][i] == currentPlayer && playButtons[1][i] == currentPlayer && playButtons[2][i] == currentPlayer) {
                return true;
            }
        }

        if (playButtons[0][0] == currentPlayer && playButtons[1][1] == currentPlayer && playButtons[2][2] == currentPlayer) {
            return true;
        }
        if (playButtons[0][2] == currentPlayer && playButtons[1][1] == currentPlayer && playButtons[2][0] == currentPlayer) {
            return true;
        }

        return false;
    }


    public boolean checkDraw() {
        // Prüft, ob alle Felder belegt sind
        for (int y = 0; y < 3; y++) {
            for (int x = 0; x < 3; x++) {
                if (playButtons[y][x] == null || playButtons[y][x].isEmpty()) {
                    return false; // Es gibt noch freie Felder
                }
            }
        }

        // Kein Gewinner und alle Felder belegt => Unentschieden
        return !checkWin();
    }

    // Aktualisierte buttonAction-Methode
    private boolean isGameOver = false; // Flag, um zu prüfen, ob das Spiel beendet ist

    public void buttonAction(JButton playButton, int x, int y) {
        if (isGameOver || !playButton.getText().equals("")) return; // Verhindert weitere Eingaben nach Spielende

        playButton.setText(currentPlayer);
        playButtons[y][x] = currentPlayer;

        if (checkWin()) {
            // Dialogbox für den Gewinner mit Buttons
            JDialog d = new JDialog(this, "Spiel beendet");
            d.setLayout(new BorderLayout());

            JLabel l = new JLabel(currentPlayer + " hat gewonnen!", SwingConstants.CENTER);
            l.setFont(new Font("Arial", Font.BOLD, 30));
            l.setForeground(Color.BLUE);

            // Buttons für Neustart und Beenden
            JPanel buttonPanel = new JPanel(new FlowLayout());
            JButton restartButton = new JButton("Neustart");
            JButton exitButton = new JButton("Beenden");

            restartButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    restartGame();
                    d.dispose(); // Dialog schließen
                }
            });

            exitButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    System.exit(0); // Programm beenden
                }
            });

            buttonPanel.add(restartButton);
            buttonPanel.add(exitButton);

            d.add(l, BorderLayout.CENTER);
            d.add(buttonPanel, BorderLayout.SOUTH);
            d.setSize(400, 300);
            d.setLocationRelativeTo(this);
            d.setVisible(true);

            isGameOver = true; // Spiel als beendet markieren
        } else if (checkDraw()) {
            // Dialogbox für Unentschieden mit Buttons
            JDialog d = new JDialog(this, "Spiel beendet");
            d.setLayout(new BorderLayout());

            JLabel l = new JLabel("Unentschieden!", SwingConstants.CENTER);
            l.setFont(new Font("Arial", Font.BOLD, 30));
            l.setForeground(Color.RED);

            // Buttons für Neustart und Beenden
            JPanel buttonPanel = new JPanel(new FlowLayout());
            JButton restartButton = new JButton("Neustart");
            JButton exitButton = new JButton("Beenden");

            restartButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    restartGame();
                    d.dispose(); // Dialog schließen
                }
            });

            exitButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    System.exit(0); // Programm beenden
                }
            });

            buttonPanel.add(restartButton);
            buttonPanel.add(exitButton);

            d.add(l, BorderLayout.CENTER);
            d.add(buttonPanel, BorderLayout.SOUTH);
            d.setSize(400, 300);
            d.setLocationRelativeTo(this);
            d.setVisible(true);

            isGameOver = true; // Spiel als beendet markieren
        }

        currentPlayer = currentPlayer.equals("X") ? "O" : "X";
    }

    // Methode zum Neustarten des Spiels
    public void restartGame() {
        // Setzt das Spiel zurück: Felder leeren, Spieler zurücksetzen
        for (int y = 0; y < 3; y++) {
            for (int x = 0; x < 3; x++) {
                playButtons[y][x] = null; // Felder leeren
            }
        }
        currentPlayer = "X"; // Startspieler zurücksetzen
        isGameOver = false; // Spielstatus zurücksetzen

        // Hier könntest du auch die Buttons im GUI zurücksetzen, falls nötig
        for (Component comp : gridPanel.getComponents()) {
            if (comp instanceof JButton) {
                ((JButton) comp).setText(""); // Alle Buttons leeren
            }
        }
    }





}
