import javax.swing.*;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

public class ButtonLayout {

    public JPanel KeyboardPanel;

    public ButtonLayout(){

        KeyboardPanel = new JPanel();
        KeyboardPanel.setSize(350,200);
        KeyboardPanel.setLayout(new FlowLayout(FlowLayout.LEFT));

        JButton buttonOem3 = new Buttons("`", "~", 45, 40, Color.PINK, KeyEvent.VK_BACK_QUOTE);
        JButton button1 = new Buttons("1", "!", 45, 40, Color.PINK, KeyEvent.VK_1);
        JButton button2 = new Buttons("2", "@", 45, 40, Color.PINK, KeyEvent.VK_2);
        JButton button3 = new Buttons("3", "#", 45, 40, Color.YELLOW, KeyEvent.VK_3);
        JButton button4 = new Buttons("4", "$", 45, 40, Color.GREEN, KeyEvent.VK_4);
        JButton button5 = new Buttons("5", "%", 45, 40, Color.CYAN, KeyEvent.VK_5);
        JButton button6 = new Buttons("6", "^", 45, 40, Color.CYAN, KeyEvent.VK_6);
        JButton button7 = new Buttons("7", "&", 45, 40, Color.MAGENTA, KeyEvent.VK_7);
        JButton button8 = new Buttons("8", "*", 45, 40, Color.MAGENTA, KeyEvent.VK_8);
        JButton button9 = new Buttons("9", "(", 45, 40, Color.PINK, KeyEvent.VK_9);
        JButton button0 = new Buttons("0", ")", 45, 40, Color.YELLOW, KeyEvent.VK_0);
        JButton buttonMinus = new Buttons("-", "_", 45, 40, Color.GREEN, KeyEvent.VK_MINUS);
        JButton buttonEquals = new Buttons("=", "+", 45, 40, Color.GREEN, KeyEvent.VK_EQUALS);
        JButton buttonBackSpace = new ControlButtons("Backspace", 115, 40, Color.LIGHT_GRAY);

        JButton buttonTab = new ControlButtons("Tab", 75, 40, Color.LIGHT_GRAY);
        JButton buttonQ = new Buttons("q", "Q", 45, 40, Color.PINK, KeyEvent.VK_Q);
        JButton buttonW = new Buttons("w", "W", 45, 40, Color.YELLOW, KeyEvent.VK_W);
        JButton buttonE = new Buttons("e", "E", 45, 40, Color.GREEN, KeyEvent.VK_E);
        JButton buttonR = new Buttons("r", "R", 45, 40, Color.CYAN, KeyEvent.VK_R);
        JButton buttonT = new Buttons("t", "T", 45, 40, Color.CYAN, KeyEvent.VK_T);
        JButton buttonY = new Buttons("y", "Y", 45, 40, Color.MAGENTA, KeyEvent.VK_Y);
        JButton buttonU = new Buttons("u", "U", 45, 40, Color.MAGENTA, KeyEvent.VK_U);
        JButton buttonI= new Buttons("i", "I", 45, 40, Color.PINK, KeyEvent.VK_I);
        JButton buttonO = new Buttons("o", "O", 45, 40, Color.YELLOW, KeyEvent.VK_O);
        JButton buttonP = new Buttons("p", "P", 45, 40, Color.GREEN, KeyEvent.VK_P);
        JButton buttonSquareParenthesisOpen = new Buttons("[", "{", 45, 40, Color.GREEN, KeyEvent.VK_OPEN_BRACKET);
        JButton buttonSquareParenthesisClose = new Buttons("]", "}", 45, 40, Color.GREEN, KeyEvent.VK_CLOSE_BRACKET);
        JButton buttonSlashLeft = new Buttons("\\", "|", 85, 40, Color.GREEN, KeyEvent.VK_BACK_SLASH);

        JButton buttonCapsLock = new ControlButtons("Capslock", 100, 40, Color.LIGHT_GRAY);
        JButton buttonA = new Buttons("a", "A", 45, 40, Color.PINK, KeyEvent.VK_A);
        JButton buttonS = new Buttons("s", "S", 45, 40, Color.YELLOW, KeyEvent.VK_S);
        JButton buttonD = new Buttons("d", "D", 45, 40, Color.GREEN, KeyEvent.VK_D);
        JButton buttonF = new Buttons("f", "F", 45, 40, Color.CYAN, KeyEvent.VK_F);
        JButton buttonG = new Buttons("g", "G", 45, 40, Color.CYAN, KeyEvent.VK_G);
        JButton buttonH = new Buttons("h", "H", 45, 40, Color.MAGENTA, KeyEvent.VK_H);
        JButton buttonJ = new Buttons("j", "J", 45, 40, Color.MAGENTA, KeyEvent.VK_J);
        JButton buttonK = new Buttons("k", "K", 45, 40, Color.PINK, KeyEvent.VK_K);
        JButton buttonL = new Buttons("l", "L", 45, 40, Color.YELLOW, KeyEvent.VK_L);
        JButton buttonDotComa = new Buttons(";", ":", 45, 40, Color.GREEN, KeyEvent.VK_COMMA);
        JButton buttonQuote = new Buttons("'", "\"", 45, 40, Color.GREEN, KeyEvent.VK_QUOTE);
        JButton buttonEnter = new ControlButtons("Enter", 110, 40, Color.LIGHT_GRAY);

        JButton buttonLeftShift = new ControlButtons("Shift", 120, 40, Color.LIGHT_GRAY);
        JButton buttonZ = new Buttons("z", "Z", 45, 40, Color.PINK, KeyEvent.VK_Z);
        JButton buttonX = new Buttons("x", "X", 45, 40, Color.YELLOW, KeyEvent.VK_X);
        JButton buttonC = new Buttons("v", "C", 45, 40, Color.GREEN, KeyEvent.VK_C);
        JButton buttonV = new Buttons("v", "V", 45, 40, Color.CYAN, KeyEvent.VK_V);
        JButton buttonB = new Buttons("b", "B", 45, 40, Color.CYAN, KeyEvent.VK_B);
        JButton buttonN = new Buttons("n", "N", 45, 40, Color.MAGENTA, KeyEvent.VK_N);
        JButton buttonM = new Buttons("m", "M", 45, 40, Color.MAGENTA, KeyEvent.VK_M);
        JButton buttonComma = new Buttons(",", "<", 45, 40, Color.PINK, KeyEvent.VK_COMMA);
        JButton buttonDot = new Buttons(".", ">", 45, 40, Color.YELLOW, KeyEvent.VK_PERIOD);
        JButton buttonRightSlash = new Buttons("/", "?", 45, 40, Color.GREEN, KeyEvent.VK_SLASH);
        JButton buttonRightShift = new ControlButtons("Shift", 140, 40, Color.LIGHT_GRAY);

        JButton buttonRightCtrl = new ControlButtons("Ctrl", 75, 40, Color.LIGHT_GRAY);
        JButton buttonRightWin = new ControlButtons("Win", 75, 40, Color.LIGHT_GRAY);
        JButton buttonRightAlt = new ControlButtons("Alt", 75, 40, Color.LIGHT_GRAY);
        JButton buttonSpace = new Buttons("Space", "Space", 285, 40, Color.ORANGE, KeyEvent.VK_SPACE);
        JButton buttonLeftAlt = new ControlButtons("Alt", 75, 40, Color.LIGHT_GRAY);
        JButton buttonLeftWin = new ControlButtons("Win", 75, 40, Color.LIGHT_GRAY);
        JButton buttonLeftCtrl = new ControlButtons("Ctrl", 75, 40, Color.LIGHT_GRAY);

        
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

        public Buttons(String name, String shiftName, int width, int height, Color background, int key){

            setPreferredSize(new Dimension(width,height));
            setText(name);
            setFont(new Font("Kolibri",Font.PLAIN,14));
            setBackground(background);


            Action pressedButton = new AbstractAction() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    setBackground(Color.RED);

                }
            };

            Action releasedButton = new AbstractAction() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    setBackground(background);

                }
            };

                    getInputMap(WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(key,0,false),
                            "pressed");
                    getActionMap().put("pressed",pressedButton);

                    getInputMap(WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(key,0,true),
                            "released");
                    getActionMap().put("released",releasedButton);
        }
    }

        public static class ControlButtons extends JButton{
        public ControlButtons(String name, int width, int height, Color background){
            setText(name);
            setPreferredSize(new Dimension(width, height));
            setBackground(background);

        }
    }
    }
//go ahead, laugh
