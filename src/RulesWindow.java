import javax.swing.JFrame;
import javax.swing.JTextArea;
import java.awt.*;

public class RulesWindow {
    JFrame frame;
    JTextArea placeholder;

    int scrWidth;
    int scrHeight;

    int winWidth = 500;
    int winHeight = 500;

    Font font = new Font("Helvetica", Font.PLAIN, 24);

    public RulesWindow(){
        frame = new JFrame();

        scrWidth = (int)java.awt.Toolkit.getDefaultToolkit().getScreenSize().getWidth();
        scrHeight = (int)java.awt.Toolkit.getDefaultToolkit().getScreenSize().getHeight();
        frame.setSize(winWidth,winHeight);
        frame.setLocation((scrWidth / 2) - (winWidth / 2),(scrHeight / 2) - (winHeight / 2));
        placeholder = new JTextArea();
        placeholder.setFont(font);
        placeholder.setEditable(false);
        placeholder.setText("Placeholder");
        frame.add(placeholder);
    }
}
