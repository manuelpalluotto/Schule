
import javax.swing.*;
import java.awt.*;
public class GUI {
    private JFrame frame;

    private ImageIcon spielfeld;

    private JPanel panel;

    private JLabel pTopLeft;
    private JLabel pTopCenter;
    private JLabel pTopRight;
    private JLabel pCenterLeft;
    private JLabel pCenterCenter;
    private JLabel pCenterRight;
    private JLabel pBottomLeft;
    private JLabel pBottomCenter;
    private JLabel pBottomRight;
    private JLabel label;

    private JButton topLeft;
    private JButton topCenter;
    private JButton topRight;
    private JButton centerLeft;
    private JButton centerCenter;
    private JButton centerRight;
    private JButton bottomLeft;
    private JButton bottomCenter;
    private JButton bottomRight;

    public GUI() {
    frame = new JFrame();
        frame.setTitle("TicTacToe");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setSize(1920, 1137);
        frame.setLocationRelativeTo(null);

        spielfeld = new ImageIcon(this.getClass().getResource("/emptyTTT.jpg"));

        panel = new JPanel(new BorderLayout());
        panel.setSize(500, 350);

        label = new JLabel(spielfeld);
        label.setSize(500, 350);

        panel.add(label);
        frame.add(panel);

        frame.revalidate();
        frame.repaint();

        //ein Feld 250 breit
        topLeft = new JButton();
        topLeft.setOpaque(false);
        topLeft.setContentAreaFilled(false);
        topLeft.setBounds(525, 60, 50, 50);
        label.add(topLeft);

        topCenter = new JButton();
        topCenter.setOpaque(false);
        topCenter.setContentAreaFilled(false);
        topCenter.setBounds(940, 60, 50, 50);
        label.add(topCenter);

        topRight = new JButton();
        topRight.setOpaque(false);
        topRight.setContentAreaFilled(false);
        topRight.setBounds(1355, 60, 50, 50);
        label.add(topRight);



        centerLeft = new JButton();
        centerLeft.setOpaque(false);
        centerLeft.setContentAreaFilled(false);
        centerLeft.setBounds(525, 340, 50, 50);
        label.add(centerLeft);

        centerCenter = new JButton();
        centerCenter.setOpaque(false);
        centerCenter.setContentAreaFilled(false);
        centerCenter.setBounds(940, 340, 50, 50);
        label.add(centerCenter);

        centerRight = new JButton();
        centerRight.setOpaque(false);
        centerRight.setContentAreaFilled(false);
        centerRight.setBounds(1355, 340, 50, 50);
        label.add(centerRight);



        bottomLeft = new JButton();
        bottomLeft.setOpaque(false);
        bottomLeft.setContentAreaFilled(false);
        bottomLeft.setBounds(525, 670, 50, 50);
        label.add(bottomLeft);

        bottomCenter = new JButton();
        bottomCenter.setOpaque(false);
        bottomCenter.setContentAreaFilled(false);
        bottomCenter.setBounds(940, 670, 50, 50);
        label.add(bottomCenter);

        bottomRight = new JButton();
        bottomRight.setOpaque(false);
        bottomRight.setContentAreaFilled(false);
        bottomRight.setBounds(1355, 670, 50, 50);
        label.add(bottomRight);



        pTopLeft.setBackground(Color.darkGray);
        Icon x = new Icon();


        frame.revalidate();
        frame.repaint();


        label.add(pTopLeft);
        label.add(pTopCenter);
        label.add(pTopRight);
        label.add(pCenterLeft);
        label.add(pCenterCenter);
        label.add(pCenterRight);
        label.add(pBottomLeft);
        label.add(pBottomCenter);
        label.add(pBottomRight);

        frame.revalidate();
        frame.repaint();






    }









    public static void main(String[] args) {
        new GUI();
    }
}


