import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.KeyEvent;

public class ButtonLayout {

    public JPanel KeyboardPanel;

    public ButtonLayout(){

        KeyboardPanel = new JPanel();
        KeyboardPanel.setSize(350,200);
        KeyboardPanel.setLayout(new FlowLayout(FlowLayout.LEFT));

    //initializing virtual keyboard

        //row 1
        JButton buttonOem3 = new Buttons("`", 45, 40, Color.PINK, KeyEvent.VK_BACK_QUOTE);
        JButton button1 = new Buttons("1",  45, 40, Color.PINK, KeyEvent.VK_1);
        JButton button2 = new Buttons("2", 45, 40, Color.PINK, KeyEvent.VK_2);
        JButton button3 = new Buttons("3", 45, 40, Color.YELLOW, KeyEvent.VK_3);
        JButton button4 = new Buttons("4",  45, 40, Color.GREEN, KeyEvent.VK_4);
        JButton button5 = new Buttons("5", 45, 40, Color.CYAN, KeyEvent.VK_5);
        JButton button6 = new Buttons("6", 45, 40, Color.CYAN, KeyEvent.VK_6);
        JButton button7 = new Buttons("7",  45, 40, Color.MAGENTA, KeyEvent.VK_7);
        JButton button8 = new Buttons("8",  45, 40, Color.MAGENTA, KeyEvent.VK_8);
        JButton button9 = new Buttons("9",  45, 40, Color.PINK, KeyEvent.VK_9);
        JButton button0 = new Buttons("0",  45, 40, Color.YELLOW, KeyEvent.VK_0);
        JButton buttonMinus = new Buttons("-",  45, 40, Color.GREEN, KeyEvent.VK_MINUS);
        JButton buttonEquals = new Buttons("=",  45, 40, Color.GREEN, KeyEvent.VK_EQUALS);
        JButton buttonBackSpace = new Buttons("Backspace", 115, 40, Color.LIGHT_GRAY, KeyEvent.VK_BACK_SPACE);

        //row 2
        JButton buttonTab = new Buttons("Tab", 75, 40, Color.LIGHT_GRAY, KeyEvent.VK_TAB);
        JButton buttonQ = new Buttons("й",  45, 40, Color.PINK, KeyEvent.VK_Q);
        JButton buttonW = new Buttons("ц",  45, 40, Color.YELLOW, KeyEvent.VK_W);
        JButton buttonE = new Buttons("у",  45, 40, Color.GREEN, KeyEvent.VK_E);
        JButton buttonR = new Buttons("к",  45, 40, Color.CYAN, KeyEvent.VK_R);
        JButton buttonT = new Buttons("е",  45, 40, Color.CYAN, KeyEvent.VK_T);
        JButton buttonY = new Buttons("н",  45, 40, Color.MAGENTA, KeyEvent.VK_Y);
        JButton buttonU = new Buttons("г",  45, 40, Color.MAGENTA, KeyEvent.VK_U);
        JButton buttonI= new Buttons("ш",  45, 40, Color.PINK, KeyEvent.VK_I);
        JButton buttonO = new Buttons("щ",  45, 40, Color.YELLOW, KeyEvent.VK_O);
        JButton buttonP = new Buttons("з",  45, 40, Color.GREEN, KeyEvent.VK_P);
        JButton buttonSquareParenthesisOpen = new Buttons("х",  45, 40, Color.GREEN, KeyEvent.VK_OPEN_BRACKET);
        JButton buttonSquareParenthesisClose = new Buttons("ї",  45, 40, Color.GREEN, KeyEvent.VK_CLOSE_BRACKET);
        JButton buttonSlashLeft = new Buttons("\\",  85, 40, Color.GREEN, KeyEvent.VK_BACK_SLASH);

        //row 3
        JButton buttonCapsLock = new Buttons("Capslock", 100, 40, Color.LIGHT_GRAY, KeyEvent.VK_CAPS_LOCK);
        JButton buttonA = new Buttons("ф",  45, 40, Color.PINK, KeyEvent.VK_A);
        JButton buttonS = new Buttons("і",  45, 40, Color.YELLOW, KeyEvent.VK_S);
        JButton buttonD = new Buttons("в",  45, 40, Color.GREEN, KeyEvent.VK_D);
        JButton buttonF = new Buttons("а",  45, 40, Color.CYAN, KeyEvent.VK_F);
        JButton buttonG = new Buttons("п",  45, 40, Color.CYAN, KeyEvent.VK_G);
        JButton buttonH = new Buttons("р",  45, 40, Color.MAGENTA, KeyEvent.VK_H);
        JButton buttonJ = new Buttons("о",  45, 40, Color.MAGENTA, KeyEvent.VK_J);
        JButton buttonK = new Buttons("л",  45, 40, Color.PINK, KeyEvent.VK_K);
        JButton buttonL = new Buttons("д",  45, 40, Color.YELLOW, KeyEvent.VK_L);
        JButton buttonDotComa = new Buttons("ж",  45, 40, Color.GREEN, KeyEvent.VK_SEMICOLON);
        JButton buttonQuote = new Buttons("є",  45, 40, Color.GREEN, KeyEvent.VK_QUOTE);
        JButton buttonEnter = new Buttons("Enter", 110, 40, Color.LIGHT_GRAY, KeyEvent.VK_ENTER);

        //row 4
        JButton buttonLeftShift = new Buttons("Shift", 120, 40, Color.LIGHT_GRAY, KeyEvent.VK_SHIFT);
        JButton buttonZ = new Buttons("я",  45, 40, Color.PINK, KeyEvent.VK_Z);
        JButton buttonX = new Buttons("ч",  45, 40, Color.YELLOW, KeyEvent.VK_X);
        JButton buttonC = new Buttons("с",  45, 40, Color.GREEN, KeyEvent.VK_C);
        JButton buttonV = new Buttons("м",  45, 40, Color.CYAN, KeyEvent.VK_V);
        JButton buttonB = new Buttons("и",  45, 40, Color.CYAN, KeyEvent.VK_B);
        JButton buttonN = new Buttons("т",  45, 40, Color.MAGENTA, KeyEvent.VK_N);
        JButton buttonM = new Buttons("ь",   45, 40, Color.MAGENTA, KeyEvent.VK_M);
        JButton buttonComma = new Buttons("б",   45, 40, Color.PINK, KeyEvent.VK_COMMA);
        JButton buttonDot = new Buttons("ю",   45, 40, Color.YELLOW, KeyEvent.VK_PERIOD);
        JButton buttonRightSlash = new Buttons(".",   45, 40, Color.GREEN, KeyEvent.VK_SLASH);
        JButton buttonRightShift = new Buttons("Shift", 140, 40, Color.LIGHT_GRAY, KeyEvent.VK_SHIFT);

        //row 5
        JButton buttonRightCtrl = new Buttons("Ctrl", 75, 40, Color.LIGHT_GRAY, KeyEvent.VK_CONTROL);
        JButton buttonRightWin = new Buttons("Win", 75, 40, Color.LIGHT_GRAY, KeyEvent.VK_WINDOWS);
        JButton buttonRightAlt = new Buttons("Alt", 75, 40, Color.LIGHT_GRAY, KeyEvent.VK_ALT);
        JButton buttonSpace = new Buttons( "Space", 285, 40, Color.ORANGE, KeyEvent.VK_SPACE);
        JButton buttonLeftAlt = new Buttons("Alt", 75, 40, Color.LIGHT_GRAY, KeyEvent.VK_ALT);
        JButton buttonLeftWin = new Buttons("Win", 75, 40, Color.LIGHT_GRAY, KeyEvent.VK_WINDOWS);
        JButton buttonLeftCtrl = new Buttons( "Ctrl", 75, 40, Color.LIGHT_GRAY, KeyEvent.VK_CONTROL);

        //adding buttons to window
        KeyboardPanel.add(buttonOem3);
        KeyboardPanel.add(button1);
        KeyboardPanel.add(button2);
        KeyboardPanel.add(button3);
        KeyboardPanel.add(button4);
        KeyboardPanel.add(button5);
        KeyboardPanel.add(button6);
        KeyboardPanel.add(button7);
        KeyboardPanel.add(button8);
        KeyboardPanel.add(button9);
        KeyboardPanel.add(button0);
        KeyboardPanel.add(buttonMinus);
        KeyboardPanel.add(buttonEquals);
        KeyboardPanel.add(buttonBackSpace);

        KeyboardPanel.add(buttonTab);
        KeyboardPanel.add(buttonQ);
        KeyboardPanel.add(buttonW);
        KeyboardPanel.add(buttonE);
        KeyboardPanel.add(buttonR);
        KeyboardPanel.add(buttonT);
        KeyboardPanel.add(buttonY);
        KeyboardPanel.add(buttonU);
        KeyboardPanel.add(buttonI);
        KeyboardPanel.add(buttonO);
        KeyboardPanel.add(buttonP);
        KeyboardPanel.add(buttonSquareParenthesisOpen);
        KeyboardPanel.add(buttonSquareParenthesisClose);
        KeyboardPanel.add(buttonSlashLeft);

        KeyboardPanel.add(buttonCapsLock);
        KeyboardPanel.add(buttonA);
        KeyboardPanel.add(buttonS);
        KeyboardPanel.add(buttonD);
        KeyboardPanel.add(buttonF);
        KeyboardPanel.add(buttonG);
        KeyboardPanel.add(buttonH);
        KeyboardPanel.add(buttonJ);
        KeyboardPanel.add(buttonK);
        KeyboardPanel.add(buttonL);
        KeyboardPanel.add(buttonDotComa);
        KeyboardPanel.add(buttonQuote);
        KeyboardPanel.add(buttonEnter);

        KeyboardPanel.add(buttonLeftShift);
        KeyboardPanel.add(buttonZ);
        KeyboardPanel.add(buttonX);
        KeyboardPanel.add(buttonC);
        KeyboardPanel.add(buttonV);
        KeyboardPanel.add(buttonB);
        KeyboardPanel.add(buttonN);
        KeyboardPanel.add(buttonM);
        KeyboardPanel.add(buttonComma);
        KeyboardPanel.add(buttonDot);
        KeyboardPanel.add(buttonRightSlash);
        KeyboardPanel.add(buttonRightShift);

        KeyboardPanel.add(buttonRightCtrl);
        KeyboardPanel.add(buttonRightWin);
        KeyboardPanel.add(buttonRightAlt);
        KeyboardPanel.add(buttonSpace);
        KeyboardPanel.add(buttonLeftAlt);
        KeyboardPanel.add(buttonLeftWin);
        KeyboardPanel.add(buttonLeftCtrl);
    }
    public static class Buttons extends JButton {

        //default setting for buttons
        public Buttons(String name, int width, int height, Color background, int key){

            setPreferredSize(new Dimension(width,height));
            setText(name);
            setFont(new Font("Calibri",Font.BOLD, 14));
            setBackground(background);

            //set virtual keyboard

            //if button is pressed, paint bottom to red
//            Action pressedButton = new AbstractAction() {
//                @Override
//                public void actionPerformed(ActionEvent e) {
//                    setBackground(Color.RED);
//                    System.out.println(key);
//                }
//            };
            //if button is released, turn default color back
//            Action releasedButton = new AbstractAction() {
//                @Override
//                public void actionPerformed(ActionEvent e) {
//                    setBackground(background);
//
//                }
//            };
//                    getInputMap(WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(key,0,false),
//                            "pressed");
//                    getActionMap().put("pressed",pressedButton);
//
//                    getInputMap(WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(key,0,true),
//                            "released");
//                    getActionMap().put("released",releasedButton);

        }
    }
}
//go ahead, laugh