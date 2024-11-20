import javax.swing.*;

public class GUI {
    FirstFrame whereIntroductionIsShown;
    LoginFrame whereUserCanInput;
    GameFrame whereTheGridIsShown;
    FirstFrameLabel label;
    LoginFramePanel panel;


    public GUI() {

        panel = new LoginFramePanel(this);

        whereIntroductionIsShown = new FirstFrame();
        whereUserCanInput = new LoginFrame();
        whereTheGridIsShown = new GameFrame();

        label = new FirstFrameLabel(this);
        whereIntroductionIsShown.add(label.getFirstFrameLabel());

        whereUserCanInput.add(panel.getLoginFramePanel());

    }

    public JFrame getWhereIntroductionIsShown() {
        return whereIntroductionIsShown;
    }

    public JFrame getWhereUserCanInput() {
        return whereUserCanInput;
    }

    public JFrame getWhereTheGridIsShown() {
        return whereTheGridIsShown;
    }
}
