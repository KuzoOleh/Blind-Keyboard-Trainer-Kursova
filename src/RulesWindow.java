import javax.swing.JFrame;
import javax.swing.JTextArea;

public class RulesWindow {
    JFrame frame;
    JTextArea placeholder;

    int scrWidth = 500;
    int scrHeight = 500;

    int winWidth,winHeight;
    public RulesWindow(){
        frame = new JFrame();
        frame.setSize(scrWidth,scrHeight);
        frame.setLocation((scrWidth / 2) - (winWidth / 2),(scrHeight / 2) - (winHeight / 2));
        placeholder = new JTextArea();
        placeholder.setText("Placeholder");
        frame.add(placeholder);
    }
}
