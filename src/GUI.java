import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

public class GUI {
    private final ImageIcon spielfeld;
    private final JPanel tttGrid;
    private final JLabel background;
    private ArrayList<JLabel> labelList;
    private String currentPlayer;
    String playerOne;
    String playerTwo;


    public GUI() {
        spielfeld = new ImageIcon(this.getClass().getResource("/emptyTTT.jpg"));
        //das leere Bild
        currentPlayer = "X";
        labelList = new ArrayList<>();


        myFrame firstFrame = new myFrame("TicTacToe", 1920, 1137);
        //frame wird erstellt

        IntroductionFrame intro = new IntroductionFrame(firstFrame.getFrame());

        tttGrid = new JPanel(new GridLayout(3, 3));
        tttGrid.setOpaque(false);
        //ein Spielfeld 3x3 wird erstellt

        background = new JLabel(spielfeld);
        //eine Fläche für das Bild wird erstellt

        background.setLayout(new BorderLayout());
        //das Hintergrundbild eingefügt

        background.add(tttGrid, BorderLayout.CENTER);
        //das unsichtbare Spielfeld wird auf den Hintergrund gelegt

        firstFrame.getFrame().add(background);
        //der Hintergrund wird auf den Frame gelegt


        //background.add(intro.introduction);

        for (int i = 0; i < 9; i++) {
            playing();
        }
    }

    private void playing() {
        JPanel cardPanel = new JPanel(new CardLayout());
        cardPanel.setOpaque(false);

        Labels label = new Labels("");
        //ein neues Label Objekt mit dem Namen label wird erstellt
        Buttons button = new Buttons();
        //ein neues Button Objekt mit dem Namen button wird erstellt

        labelList.add(label.getLabel());
        //das Label wird in eine Liste eingefügt

        button.getButtons().addActionListener(e -> {
            label.getLabel().setText(currentPlayer);
            //erst beim Spielzug wird der Text zugewiesen

            label.getLabel().setVisible(true);
            //das Label wird sichtbar

            button.getButtons().setVisible(false);
            //der Button wird unsichtbar

            currentPlayer = currentPlayer.equals("O") ? "X" : "O";
            //der jeweils zugewiesene Text wird für den nächsten Zug überschrieben
        });
        cardPanel.add(button.getButtons());
        cardPanel.add(label.getLabel());

        tttGrid.add(cardPanel);
    }
}
