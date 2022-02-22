import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

public class ButtonLayout {

    public JPanel KeyboardPanel;

    public ButtonLayout(){

        KeyboardPanel = new JPanel();
        KeyboardPanel.setSize(350,200);
        KeyboardPanel.setLayout(new FlowLayout(FlowLayout.LEFT));

    //initializing virtual keyboard

        //row 1
        JButton buttonOem3 = new Buttons("`", 45, 40, Color.PINK);
        JButton button1 = new Buttons("1",  45, 40, Color.PINK);
        JButton button2 = new Buttons("2", 45, 40, Color.PINK);
        JButton button3 = new Buttons("3", 45, 40, Color.YELLOW);
        JButton button4 = new Buttons("4",  45, 40, Color.GREEN);
        JButton button5 = new Buttons("5", 45, 40, Color.CYAN);
        JButton button6 = new Buttons("6", 45, 40, Color.CYAN);
        JButton button7 = new Buttons("7",  45, 40, Color.MAGENTA);
        JButton button8 = new Buttons("8",  45, 40, Color.MAGENTA);
        JButton button9 = new Buttons("9",  45, 40, Color.PINK);
        JButton button0 = new Buttons("0",  45, 40, Color.YELLOW);
        JButton buttonMinus = new Buttons("-",  45, 40, Color.GREEN);
        JButton buttonEquals = new Buttons("=",  45, 40, Color.GREEN);
        JButton buttonBackSpace = new Buttons("Backspace", 115, 40, Color.LIGHT_GRAY);

        //row 2
        JButton buttonTab = new Buttons("Tab", 75, 40, Color.LIGHT_GRAY);
        JButton buttonQ = new Buttons("й",  45, 40, Color.PINK);
        JButton buttonW = new Buttons("ц",  45, 40, Color.YELLOW);
        JButton buttonE = new Buttons("у",  45, 40, Color.GREEN);
        JButton buttonR = new Buttons("к",  45, 40, Color.CYAN);
        JButton buttonT = new Buttons("е",  45, 40, Color.CYAN);
        JButton buttonY = new Buttons("н",  45, 40, Color.MAGENTA);
        JButton buttonU = new Buttons("г",  45, 40, Color.MAGENTA);
        JButton buttonI= new Buttons("ш",  45, 40, Color.PINK);
        JButton buttonO = new Buttons("щ",  45, 40, Color.YELLOW);
        JButton buttonP = new Buttons("з",  45, 40, Color.GREEN);
        JButton buttonSquareParenthesisOpen = new Buttons("х",  45, 40, Color.GREEN);
        JButton buttonSquareParenthesisClose = new Buttons("ї",  45, 40, Color.GREEN);
        JButton buttonSlashLeft = new Buttons("\\",  85, 40, Color.GREEN);

        //row 3
        JButton buttonCapsLock = new Buttons("Capslock", 100, 40, Color.LIGHT_GRAY);
        JButton buttonA = new Buttons("ф",  45, 40, Color.PINK);
        JButton buttonS = new Buttons("і",  45, 40, Color.YELLOW);
        JButton buttonD = new Buttons("в",  45, 40, Color.GREEN);
        JButton buttonF = new Buttons("а",  45, 40, Color.CYAN);
        JButton buttonG = new Buttons("п",  45, 40, Color.CYAN);
        JButton buttonH = new Buttons("р",  45, 40, Color.MAGENTA);
        JButton buttonJ = new Buttons("о",  45, 40, Color.MAGENTA);
        JButton buttonK = new Buttons("л",  45, 40, Color.PINK);
        JButton buttonL = new Buttons("д",  45, 40, Color.YELLOW);
        JButton buttonDotComa = new Buttons("ж",  45, 40, Color.GREEN);
        JButton buttonQuote = new Buttons("є",  45, 40, Color.GREEN);
        JButton buttonEnter = new Buttons("Enter", 110, 40, Color.LIGHT_GRAY);

        //row 4
        JButton buttonLeftShift = new Buttons("Shift", 120, 40, Color.LIGHT_GRAY);
        JButton buttonZ = new Buttons("я",  45, 40, Color.PINK);
        JButton buttonX = new Buttons("ч",  45, 40, Color.YELLOW);
        JButton buttonC = new Buttons("с",  45, 40, Color.GREEN);
        JButton buttonV = new Buttons("м",  45, 40, Color.CYAN);
        JButton buttonB = new Buttons("и",  45, 40, Color.CYAN);
        JButton buttonN = new Buttons("т",  45, 40, Color.MAGENTA);
        JButton buttonM = new Buttons("ь",   45, 40, Color.MAGENTA);
        JButton buttonComma = new Buttons("б",   45, 40, Color.PINK);
        JButton buttonDot = new Buttons("ю",   45, 40, Color.YELLOW);
        JButton buttonRightSlash = new Buttons(".",   45, 40, Color.GREEN);
        JButton buttonRightShift = new Buttons("Shift", 140, 40, Color.LIGHT_GRAY);

        //row 5
        JButton buttonRightCtrl = new Buttons("Ctrl", 75, 40, Color.LIGHT_GRAY);
        JButton buttonRightWin = new Buttons("Win", 75, 40, Color.LIGHT_GRAY);
        JButton buttonRightAlt = new Buttons("Alt", 75, 40, Color.LIGHT_GRAY);
        JButton buttonSpace = new Buttons( "Space", 285, 40, Color.ORANGE);
        JButton buttonLeftAlt = new Buttons("Alt", 75, 40, Color.LIGHT_GRAY);
        JButton buttonLeftWin = new Buttons("Win", 75, 40, Color.LIGHT_GRAY);
        JButton buttonLeftCtrl = new Buttons( "Ctrl", 75, 40, Color.LIGHT_GRAY);

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
        public Buttons(String name, int width, int height, Color background){

            setPreferredSize(new Dimension(width,height));
            setText(name);
            setFont(new Font("Calibri",Font.BOLD, 14));
            setBackground(background);
        }
    }
}
//go ahead, laugh