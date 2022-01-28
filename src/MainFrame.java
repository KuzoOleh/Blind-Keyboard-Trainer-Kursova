import javax.swing.*;
import java.awt.*;



//initializing main window
public class MainFrame {
    JFrame frame;
    JPanel mainPanel;

    public static CheckText checkText = new CheckText();
    public static MenuBarLayout menuBarLayout;

    int scrWidth;
    int scrHeight;
    int winWidth = 800;
    int winHeight = 600;


    public MainFrame(){


        scrWidth = (int)java.awt.Toolkit.getDefaultToolkit().getScreenSize().getWidth();
        scrHeight = (int)java.awt.Toolkit.getDefaultToolkit().getScreenSize().getHeight();

        frame = new JFrame();

        mainPanel = new JPanel();
        mainPanel.setSize(winWidth,winHeight);

        //initializing MenuBarLayout and ButtonLayout modules
        menuBarLayout = new MenuBarLayout();
        frame.add(mainPanel);

        ButtonLayout buttonLayout = new ButtonLayout();
        menuBarLayout = new MenuBarLayout();

        frame.setJMenuBar(MenuBarLayout.menuBar);
        //setting window to center
        frame.setLocation((scrWidth / 2) - (winWidth / 2),(scrHeight / 2) - (winHeight / 2));
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //adding modules to main window
        mainPanel.add(checkText.textLayout);
        mainPanel.add(buttonLayout.KeyboardPanel);

        ImageIcon img = new ImageIcon("src\\resources\\icon\\logo.png");
        frame.setIconImage(img.getImage());

        mainPanel.setLayout(new GridLayout(2,1));

        frame.setSize(new Dimension(790, 550));
        frame.setResizable(false);
        frame.setTitle("Програма-тренажер сліпого друку");
    }
    public static void main(String[] args) {
        new MainFrame();
    }
}
