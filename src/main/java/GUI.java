import javax.swing.*;

public class GUI {
    FirstFrame whereIntroductionIsShown;
    LoginFrame whereUserCanInput;
    GameFrame whereTheGridIsShown;
    FirstFrameLabel label;
    LoginFramePanel panel;


    public GUI() {


        whereIntroductionIsShown = new FirstFrame(this);
        whereUserCanInput = new LoginFrame(this);
        whereTheGridIsShown = new GameFrame(this);

        panel = new LoginFramePanel(this);

        label = new FirstFrameLabel(this);

        whereIntroductionIsShown.add(label.getFirstFrameLabel());

        whereUserCanInput.add(panel.getLoginFramePanel());

    }

//    public JFrame getWhereIntroductionIsShown() {
//        return whereIntroductionIsShown;
//    }
//
//    public JFrame getWhereUserCanInput() {
//        return whereUserCanInput;
//    }
//
//    public JFrame getWhereTheGridIsShown() {
//        return whereTheGridIsShown;
//    }
}
