import javax.swing.*;
import java.awt.*;

public class Viewer {
    private JTextField textField;
    public  Viewer(){

        Controller controller = new Controller(this);

        Color fontColor = new Color(235,239,242);
        Color darkGreyColor = new Color(80, 80, 80);
        Color textFieldColor = new Color(43,45,47);
        Color buttonOrangeColor = new Color(255,149,0);
        Color buttonLightGrey = new Color(132,132,130);

        Font textFieldFont = new Font("Helvetica",Font.BOLD, 40 );
        Font buttonFont = new Font("Helvetica", Font.BOLD, 18);

        textField = new JTextField();
        textField.setBounds(0, 0, 280,70 );
        textField.setHorizontalAlignment(JTextField.RIGHT);
        textField.setFont(textFieldFont);
        textField.setForeground(fontColor);
        textField.setBackground(textFieldColor);
        textField.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));


//      buttonAC
        JButton buttonAC = new JButton("AC");
        buttonAC.setBounds(0, 65, 70,55 );
        buttonAC.setBackground(darkGreyColor );
        buttonAC.setOpaque(true);
        buttonAC.setBorderPainted(false);
        buttonAC.setForeground(fontColor);
        buttonAC.setFont(buttonFont);
        buttonAC.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        buttonAC.addActionListener(controller);
        buttonAC.setActionCommand("Clear_Memory");


        JButton buttonNegative = new JButton("+/-");
        buttonNegative.setBounds(70, 65, 70,55 );
        buttonNegative.setBackground(darkGreyColor );
        buttonNegative.setOpaque(true);
        buttonNegative.setBorderPainted(false);
        buttonNegative.setForeground(fontColor);
        buttonNegative.setFont(buttonFont);
        buttonNegative.addActionListener(controller);
        buttonNegative.setActionCommand("Negative");


        JButton buttonPercentage = new JButton("%");
        buttonPercentage.setBounds(140, 65, 70,55 );
        buttonPercentage.setBackground(darkGreyColor );
        buttonPercentage.setOpaque(true);
        buttonPercentage.setBorderPainted(false);
        buttonPercentage.setForeground(fontColor);
        buttonPercentage.setFont(buttonFont);
        buttonPercentage.addActionListener(controller);
        buttonPercentage.setActionCommand("Percent");


        JButton buttonDivision = new JButton("/");
        buttonDivision.setBounds(210, 65, 70,55 );
        buttonDivision.setBackground(buttonOrangeColor);
        buttonDivision.setOpaque(true);
        buttonDivision.setBorderPainted(false);
        buttonDivision.setFont(buttonFont);
        buttonDivision.setForeground(fontColor);
        buttonDivision.addActionListener(controller);
        buttonDivision.setActionCommand("Divide");


        JButton buttonSeven = new JButton("7");
        buttonSeven.setBounds(0, 115, 70,55 );
        buttonSeven.addActionListener(controller);
        buttonSeven.setActionCommand("Seven");
        buttonSeven.setBackground(buttonLightGrey);
        buttonSeven.setOpaque(true);
        buttonSeven.setBorderPainted(false);
        buttonSeven.setFont(buttonFont);
        buttonSeven.setForeground(fontColor);



        JButton buttonEight = new JButton("8");
        buttonEight.setBounds(70, 115, 70,55 );
        buttonEight.setBackground(buttonLightGrey);
        buttonEight.setOpaque(true);
        buttonEight.setBorderPainted(false);
        buttonEight.setFont(buttonFont);
        buttonEight.setForeground(fontColor);
        buttonEight.addActionListener(controller);
        buttonEight.setActionCommand("Eight");


        JButton buttonNine = new JButton("9");
        buttonNine.setBounds(140, 115, 70,55 );
        buttonNine.setBackground(buttonLightGrey);
        buttonNine.setOpaque(true);
        buttonNine.setBorderPainted(false);
        buttonNine.setFont(buttonFont);
        buttonNine.setForeground(fontColor);
        buttonNine.addActionListener(controller);
        buttonNine.setActionCommand("Nine");


        JButton buttonMultiplication = new JButton("x");
        buttonMultiplication.setBounds(210, 115, 70,55 );
        buttonMultiplication.setBackground(buttonOrangeColor);
        buttonMultiplication.setOpaque(true);
        buttonMultiplication.setBorderPainted(false);
        buttonMultiplication.setFont(buttonFont);
        buttonMultiplication.setForeground(fontColor);
        buttonMultiplication.addActionListener(controller);
        buttonMultiplication.setActionCommand("Multiply");



        JButton buttonFour = new JButton("4");
        buttonFour.setBounds(0, 165, 70,55 );
        buttonFour.setBackground(buttonLightGrey);
        buttonFour.setOpaque(true);
        buttonFour.setBorderPainted(false);
        buttonFour.setFont(buttonFont);
        buttonFour.setForeground(fontColor);
        buttonFour.addActionListener(controller);
        buttonFour.setActionCommand("Four");


        JButton buttonFive = new JButton("5");
        buttonFive.setBounds(70, 165, 70,55 );
        buttonFive.setBackground(buttonLightGrey);
        buttonFive.setOpaque(true);
        buttonFive.setBorderPainted(false);
        buttonFive.setFont(buttonFont);
        buttonFive.setForeground(fontColor);
        buttonFive.addActionListener(controller);
        buttonFive.setActionCommand("Five");


        JButton buttonSix = new JButton("6");
        buttonSix.setBounds(140, 165, 70,55 );
        buttonSix.setBackground(buttonLightGrey);
        buttonSix.setOpaque(true);
        buttonSix.setBorderPainted(false);
        buttonSix.setFont(buttonFont);
        buttonSix.setForeground(fontColor);
        buttonSix.addActionListener(controller);
        buttonSix.setActionCommand("Six");



        JButton buttonDeduction = new JButton("-");
        buttonDeduction.setBounds(210, 165, 70,55 );
        buttonDeduction.setBackground(buttonOrangeColor);
        buttonDeduction.setOpaque(true);
        buttonDeduction.setBorderPainted(false);
        buttonDeduction.setFont(buttonFont);
        buttonDeduction.setForeground(fontColor);
        buttonDeduction.addActionListener(controller);
        buttonDeduction.setActionCommand("Minus");


        JButton buttonOne = new JButton("1");
        buttonOne.setBounds(0, 215, 70,55 );
        buttonOne.setBackground(buttonLightGrey);
        buttonOne.setOpaque(true);
        buttonOne.setBorderPainted(false);
        buttonOne.setFont(buttonFont);
        buttonOne.setForeground(fontColor);
        buttonOne.addActionListener(controller);
        buttonOne.setActionCommand("One");


        JButton buttonTwo = new JButton("2");
        buttonTwo.setBounds(70, 215, 70,55 );
        buttonTwo.setBackground(buttonLightGrey);
        buttonTwo.setOpaque(true);
        buttonTwo.setBorderPainted(false);
        buttonTwo.setFont(buttonFont);
        buttonTwo.setForeground(fontColor);
        buttonTwo.addActionListener(controller);
        buttonTwo.setActionCommand("Two");


        JButton buttonThree = new JButton("3");
        buttonThree.setBounds(140, 215, 70,55 );
        buttonThree.setBackground(buttonLightGrey);
        buttonThree.setOpaque(true);
        buttonThree.setBorderPainted(false);
        buttonThree.setFont(buttonFont);
        buttonThree.setForeground(fontColor);
        buttonThree.addActionListener(controller);
        buttonThree.setActionCommand("Three");


        JButton buttonPlus = new JButton("+");
        buttonPlus.setBounds(210, 220, 70,55 );
        buttonPlus.setBackground(buttonOrangeColor);
        buttonPlus.setOpaque(true);
        buttonPlus.setBorderPainted(false);
        buttonPlus.setFont(buttonFont);
        buttonPlus.setForeground(fontColor);
        buttonPlus.addActionListener(controller);
        buttonPlus.setActionCommand("Plus");

        JButton buttonZero = new JButton("0");
        buttonZero.setBounds(0, 265, 140,55 );
        buttonZero.setBackground(buttonLightGrey);
        buttonZero.setOpaque(true);
        buttonZero.setBorderPainted(false);
        buttonZero.setFont(buttonFont);
        buttonZero.setForeground(fontColor);
        buttonZero.addActionListener(controller);
        buttonZero.setActionCommand("Zero");

        JButton buttonComa = new JButton(",");
        buttonComa.setBounds(140, 265, 70,55 );
        buttonComa.setBackground(buttonLightGrey);
        buttonComa.setOpaque(true);
        buttonComa.setBorderPainted(false);
        buttonComa.setFont(buttonFont);
        buttonComa.setForeground(fontColor);
        buttonComa.addActionListener(controller);
        buttonComa.setActionCommand("Coma");

        JButton buttonEqual = new JButton("=");
        buttonEqual.setBounds(210, 265, 70,55 );
        buttonEqual.setBackground(buttonOrangeColor);
        buttonEqual.setOpaque(true);
        buttonEqual.setBorderPainted(false);
        buttonEqual.setFont(buttonFont);
        buttonEqual.setForeground(fontColor);
        buttonEqual.addActionListener(controller);
        buttonEqual.setActionCommand("Equal");

        JFrame frame = new JFrame("Calculator MVC");
        frame.setSize(281, 345);
        frame.getContentPane().setBackground(darkGreyColor);
        frame.setResizable(false);
        frame.add(textField);
        frame.add(buttonAC);
        frame.add(buttonNegative);
        frame.add(buttonPercentage);
        frame.add(buttonDivision);
        frame.add(buttonSeven);
        frame.add(buttonEight);
        frame.add(buttonNine);
        frame.add(buttonMultiplication);
        frame.add(buttonFour);
        frame.add(buttonFive);
        frame.add(buttonSix);
        frame.add(buttonDeduction);
        frame.add(buttonOne);
        frame.add(buttonTwo);
        frame.add(buttonThree);
        frame.add(buttonPlus);
        frame.add(buttonZero);
        frame.add(buttonComa);
        frame.add(buttonEqual);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    public  void update(String text){
        textField.setText(text);
    }
}
