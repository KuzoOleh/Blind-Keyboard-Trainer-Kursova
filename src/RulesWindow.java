import javax.swing.JFrame;
import javax.swing.JTextArea;
import java.awt.Dimension;

public class RulesWindow {
    JFrame frame;
    JTextArea placeholder;
    public RulesWindow(){
        frame = new JFrame();
        frame.setPreferredSize(new Dimension(400,400));
        placeholder = new JTextArea();
        placeholder.setText("Placeholder");
        frame.add(placeholder);
    }
}
