import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyleContext;
import javax.swing.text.StyledDocument;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class CheckText {

    public static int charCount = 0;
    public static int localCharCount = 0;
    public static JTextPane inputText;
    public static JTextPane outputText;
    StyledDocument doc;
    public JPanel textLayout;

    StyleContext context = StyleContext.getDefaultStyleContext();

    AttributeSet attributeSetRed = context.addAttribute(context.getEmptySet(),
            StyleConstants.Foreground, Color.RED);

    AttributeSet attributeSetGreen = context.addAttribute(context.getEmptySet(),
            StyleConstants.Foreground, Color.BLACK);

    public CheckText() {

        Font font = new Font("Helvetica", Font.PLAIN, 18);

        textLayout = new JPanel();
        textLayout.setLayout(new GridLayout(2, 1));

        outputText = new JTextPane();
        outputText.setFont(font);
        outputText.setEditable(false);

        inputText = new JTextPane();
        inputText.setBackground(Color.GRAY);
        inputText.setFont(font);
        inputText.setEditable(false);

        doc = inputText.getStyledDocument();


        inputText.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {

                try {
                    new Check(e);
                    
                } catch (BadLocationException badLocationException) {
                    badLocationException.printStackTrace();
                }
            }
        });

        textLayout.add(outputText);
        textLayout.add(inputText);

    }
    public class Check {
        public Check(KeyEvent e) throws BadLocationException {

            char C = e.getKeyChar();
            fillCharArray charText = new fillCharArray();
            int backSpace = e.getKeyCode();
            int controlButton = e.getKeyCode();
            int shiftButton = e.getKeyCode();
            int tabButton = e.getKeyCode();
            int altButton = e.getKeyCode();

            String current = inputText.getText();

            if (backSpace != KeyEvent.VK_BACK_SPACE) {
                try {
                    //if charText1 current char is equal to charText2 char set the default black foreground
                    if (C == charText.getOutputText.charAt(charText.getInputText.length())) {

                        doc.insertString(doc.getLength(), String.valueOf(C), attributeSetGreen);

                        charCount++;
                        localCharCount++;
                        //if currentChar equals '.', delete all written text to this char
                            if (C == '.') {
                            int startIndex = charText.getOutputText.indexOf(charText.getOutputText);
                            int endIndex = charText.getOutputText.indexOf(".");
                            String replacement = outputText.getText();
                            String toBeReplaced = outputText.getText();
                            toBeReplaced = toBeReplaced.substring(startIndex, endIndex + 1);
                            replacement = replacement.replace(toBeReplaced,"");
                            outputText.setText(replacement);
                            inputText.setText("");
                            localCharCount = 0;
                            }


                        //start the timer
                        if (charCount == 1) {
                            MainFrame.menuBarLayout.timer.start();
                        }
                    }
                    //if charText1 current char is not equal to charText2 char set the foreground red
                    if (C != charText.getOutputText.charAt(charText.getInputText.length())) {
                        charCount++;
                        localCharCount++;
                        if (charCount == 1) {
                            MainFrame.menuBarLayout.timer.start();
                        }
                        doc.insertString(doc.getLength(), String.valueOf(C), attributeSetRed);
                        MenuBarLayout.mistakes++;

                        //skip this chars
                        if ((shiftButton == KeyEvent.VK_SHIFT) || (controlButton == KeyEvent.VK_CONTROL)
                        ||(tabButton == KeyEvent.VK_TAB) || (altButton == KeyEvent.VK_ALT)) {
                            MenuBarLayout.mistakes--;
                            charCount--;
                            localCharCount--;

                            doc.remove(current.length(), 1);
                        }
                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Ви не можете більше дописувати текст",
                            "Помилка", JOptionPane.ERROR_MESSAGE);
                }
            } 
            //when press the backspace, delete one char
            else {
                doc.remove(current.length() - 1, 1);
                charCount--;
                localCharCount--;
            }
            //stop the timer, show ResultFrame
            if (localCharCount == charText.getOutputText.length()) {
                ResultFrame resultFrame = new ResultFrame();
                resultFrame.frame.setVisible(true);
                MainFrame.menuBarLayout.timer.stop();
                MenuBarLayout.mistakes--;
            }
        }
    }

}
//get text from inputText and outputText
class fillCharArray {

    String getOutputText;
    String getInputText;

    public fillCharArray() {
        getOutputText = CheckText.outputText.getText();
        getInputText =  CheckText.inputText.getText();
    }
}