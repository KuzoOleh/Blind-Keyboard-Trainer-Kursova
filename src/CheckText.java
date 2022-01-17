import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.JScrollPane;
import javax.swing.text.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class CheckText  {

    public static int charCount = 0;

    public static JTextPane inputText;
    public static JTextPane outputText;
    StyledDocument doc;
    public  JPanel textLayout;
    JPanel outputTextLayout;
    JPanel inputTextLayout;
    JScrollPane outputTextScrollPane;
    JScrollPane inputTextScrollPane;

    StyleContext context = StyleContext.getDefaultStyleContext();

    AttributeSet attributeSetRed = context.addAttribute(context.getEmptySet(),
            StyleConstants.Foreground, Color.RED);

    AttributeSet attributeSetGreen = context.addAttribute(context.getEmptySet(),
            StyleConstants.Foreground, Color.BLACK);

    public CheckText() {


        outputTextLayout = new JPanel(new BorderLayout());
        inputTextLayout = new JPanel(new BorderLayout());

        Font font = new Font("comic-sans", Font.PLAIN, 16);

        textLayout = new JPanel();
        textLayout.setLayout(new GridLayout(2,1));

        outputText = new JTextPane();
        //outputText.setText("Quick Brown Fox Jumps OVER The Lazy Dog");
        //outputText.setText("Все-таки кодировка не була проблемою, лол");
        //outputText.setText("what if i try it without upper case?");
        outputText.setFont(font);
        outputText.setEditable(false);

        outputTextScrollPane = new JScrollPane(outputText);
        inputTextScrollPane = new JScrollPane(inputText);


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

        outputTextLayout.add(outputTextScrollPane);

        textLayout.add(outputTextLayout);
        textLayout.add(inputText);

    }
    public class Check {
        public Check(KeyEvent e) throws BadLocationException {

            new RowCounter();
            char C = e.getKeyChar();
            fillCharArray cText = new fillCharArray();
            int backSpace = e.getKeyCode();
            int controlButton = e.getKeyCode();
            int shiftButton = e.getKeyCode();

            String current = inputText.getText();

            if (backSpace != KeyEvent.VK_BACK_SPACE) {
                //if cText1 current char is equal to cText2 char set the foreground magenta
                try {
                    if (C == cText.getOutputText.charAt(cText.getInputText.length())) {

                        doc.insertString(doc.getLength(), String.valueOf(C), attributeSetGreen);

                        charCount++;
                        if(charCount == 1){
                            MainFrame.menuBarLayout.timer.start();
                        }
                    }
                    //if cText1 current char is not equal to cText2 char set the foreground red
                    if (C != cText.getOutputText.charAt(cText.getInputText.length())) {
                        charCount++;
                        if(charCount == 1){
                            MainFrame.menuBarLayout.timer.start();
                        }
                        doc.insertString(doc.getLength(), String.valueOf(C), attributeSetRed);
                        MenuBarLayout.mistakes++;
                        MenuBarLayout.mistakeCounter.setText("Помилки: " + MenuBarLayout.mistakes);
                        MenuBarLayout.menuBar.add(MenuBarLayout.mistakeCounter);
                        if((shiftButton == KeyEvent.VK_SHIFT)||(controlButton == KeyEvent.VK_CONTROL)){
                        MenuBarLayout.mistakes--;
                        charCount--;

                            doc.remove(current.length(),1);
                        }
                    }

                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Ви не можете більше дописувати текст",
                            "Помилка", JOptionPane.ERROR_MESSAGE);
                }
            } else {

                doc.remove(current.length() - 1, 1);
                charCount--;
            }
            if (charCount == cText.getOutputText.length()){

                ResultFrame resultFrame = new ResultFrame();
                resultFrame.frame.setVisible(true);
                MainFrame.menuBarLayout.timer.stop();
            }
        }
    }
    public class  fillCharArray {

        String getOutputText;
        String getInputText;

        public fillCharArray() {

            getOutputText = outputText.getText();
            getInputText = inputText.getText();

        }
    }

    public class RowCounter{
        fillCharArray charText = new fillCharArray();
        int totalCharacters = charText.getOutputText.length();
       public int lineCount = (totalCharacters == 0) ? 1 : 0;
        int offset = totalCharacters;

        public RowCounter(){
            try{
            while(offset > 0){
                offset = Utilities.getRowStart(outputText,offset) - 1;
                lineCount++;
                System.out.print(lineCount);
            }
            }
            catch(BadLocationException ex){
                ex.printStackTrace();

            }
        }
    }
}