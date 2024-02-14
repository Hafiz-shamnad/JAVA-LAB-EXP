import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class CalcDesign implements ActionListener {
    boolean isOperatorClicked = false;
    int opFinder;
    float newValF,oldValF;
    String oldVal , newVal;
    JFrame frame;
    JLabel label;
    JButton btn9,btn8,btn7,btn6,btn5,btn4,btn3,btn2,btn1,btn0,op1,op2,op3,op4,clr,perBtn,eqBtn;
    CalcDesign(){
        frame = new JFrame();
        frame.setSize(420, 420);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        btn7 = new JButton("7");
        btn7.setBounds(10,60,100,50);
        btn7.setBackground(Color.WHITE);
        btn7.setFont(new Font("Arial", Font.PLAIN ,25));
        btn7.addActionListener(this);

        btn8 = new JButton("8");
        btn8.setBounds(120,60,100,50);
        btn8.setBackground(Color.WHITE);
        btn8.setFont(new Font("Arial", Font.PLAIN ,25));
        btn8.addActionListener(this);

        btn9 = new JButton("9");
        btn9.setBounds(230,60,100,50);
        btn9.setBackground(Color.WHITE);
        btn9.setFont(new Font("Arial", Font.PLAIN ,25));
        btn9.addActionListener(this);


        btn4 = new JButton("4");
        btn4.setBounds(10,120,100,50);
        btn4.setBackground(Color.WHITE);
        btn4.setFont(new Font("Arial", Font.PLAIN ,25));
        btn4.addActionListener(this);

        btn5 = new JButton("5");
        btn5.setBounds(120,120,100,50);
        btn5.setBackground(Color.WHITE);
        btn5.setFont(new Font("Arial", Font.PLAIN ,25));
        btn5.addActionListener(this);

        btn6 = new JButton("6");
        btn6.setBounds(230,120,100,50);
        btn6.setBackground(Color.WHITE);
        btn6.setFont(new Font("Arial", Font.PLAIN ,25));
        btn6.addActionListener(this);


        btn1 = new JButton("1");
        btn1.setBounds(10,180,100,50);
        btn1.setBackground(Color.WHITE);
        btn1.setFont(new Font("Arial", Font.PLAIN ,25));
        btn1.addActionListener(this);

        btn2 = new JButton("2");
        btn2.setBounds(120,180,100,50);
        btn2.setBackground(Color.WHITE);
        btn2.setFont(new Font("Arial", Font.PLAIN ,25));
        btn2.addActionListener(this);

        btn3 = new JButton("3");
        btn3.setBounds(230,180,100,50);
        btn3.setBackground(Color.WHITE);
        btn3.setFont(new Font("Arial", Font.PLAIN ,25));
        btn3.addActionListener(this);


        btn0 = new JButton("0");
        btn0.setBounds(10,240,100,50);
        btn0.setBackground(Color.WHITE);
        btn0.setFont(new Font("Arial", Font.PLAIN ,25));
        btn0.addActionListener(this);

        clr = new JButton("CLR");
        clr.setBounds(120,240,100,50);
        clr.setBackground(Color.WHITE);
        clr.setFont(new Font("Arial", Font.PLAIN ,25));
        clr.addActionListener(this);

        perBtn = new JButton(".");
        perBtn.setBounds(230,240,100,50);
        perBtn.setBackground(Color.WHITE);
        perBtn.setFont(new Font("Arial", Font.PLAIN ,25));
        perBtn.addActionListener(this);

        eqBtn = new JButton("=");
        eqBtn.setBounds(230,300,100,50);
        eqBtn.setBackground(Color.WHITE);
        eqBtn.setFont(new Font("Arial", Font.PLAIN ,25));
        eqBtn.addActionListener(this);


        op1 = new JButton("+");
        op1.setBounds(350,60,50,50);
        op1.setBackground(Color.WHITE);
        op1.setFont(new Font("Arial", Font.PLAIN ,25));
        op1.addActionListener(this);

        op2 = new JButton("-");
        op2.setBounds(350,120,50,50);
        op2.setBackground(Color.WHITE);
        op2.setFont(new Font("Arial", Font.PLAIN ,25));
        op2.addActionListener(this);

        op3 = new JButton("x");
        op3.setBounds(350,180,50,50);
        op3.setFont(new Font("Arial", Font.PLAIN ,25));
        op3.setBackground(Color.WHITE);
        op3.addActionListener(this);

        op4 = new JButton("/");
        op4.setBounds(350,240,50,50);
        op4.setBackground(Color.WHITE);
        op4.setFont(new Font("Arial", Font.PLAIN ,25));
        op4.addActionListener(this);

        label = new JLabel();
        label.setBounds(10,10,400,40);
        label.setHorizontalAlignment(SwingConstants.RIGHT);
        label.setBackground(Color.DARK_GRAY);
        label.setOpaque(true);
        label.setForeground(Color.white);

        frame.add(btn7);
        frame.add(btn8);
        frame.add(btn9);
        frame.add(btn4);
        frame.add(btn5);
        frame.add(btn6);
        frame.add(btn1);
        frame.add(btn2);
        frame.add(btn3);
        frame.add(btn0);
        frame.add(clr);
        frame.add(perBtn);
        frame.add(eqBtn);
        frame.add(op1);
        frame.add(op2);
        frame.add(op3);
        frame.add(op4);
        frame.add(label);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btn9){
            if (isOperatorClicked){
                label.setText("9");
                isOperatorClicked = false;
            }else {
                label.setText(label.getText() + "9");
            }
        }else if (e.getSource()== btn8){
            if (isOperatorClicked){
                label.setText("8");
                isOperatorClicked = false;
            }else {
                label.setText(label.getText() + "8");
            }
        }else if (e.getSource()== btn7){
            if (isOperatorClicked){
                label.setText("7");
                isOperatorClicked = false;
            }else {
                label.setText(label.getText() + "7");
            }
        }else if (e.getSource()== btn6){
            if (isOperatorClicked){
                label.setText("6");
                isOperatorClicked = false;
            }else {
                label.setText(label.getText() + "6");
            }
        }else if (e.getSource()== btn5){
            if (isOperatorClicked){
                label.setText("5");
                isOperatorClicked = false;
            }else {
                label.setText(label.getText() + "5");
            }
        }else if (e.getSource()== btn4){
            if (isOperatorClicked){
                label.setText("4");
                isOperatorClicked = false;
            }else {
                label.setText(label.getText() + "4");
            }
        }else if (e.getSource()== btn3){
            if (isOperatorClicked){
                label.setText("3");
                isOperatorClicked = false;
            }else {
                label.setText(label.getText() + "3");
            }
        }else if (e.getSource()== btn2){
            if (isOperatorClicked){
                label.setText("2");
                isOperatorClicked = false;
            }else {
                label.setText(label.getText() + "2");
            }
        }else if (e.getSource()== btn1){
            if (isOperatorClicked){
                label.setText("1");
                isOperatorClicked = false;
            }else {
                label.setText(label.getText() + "1");
            }
        }else if (e.getSource()== btn0){
            if (isOperatorClicked){
                label.setText("0");
                isOperatorClicked = false;
            }else {
                label.setText(label.getText() + "0");
            }
        }else if (e.getSource()== eqBtn){
            float res;
            isOperatorClicked = true;
            newVal = label.getText();
            newValF = Float.parseFloat(newVal);
            oldValF = Float.parseFloat(oldVal);
            switch (opFinder){
                case 1 :
                    res = oldValF + newValF;
                    label.setText(res +"");
                    break;
                case 2 :
                    res = oldValF - newValF;
                    label.setText(res +"");
                    break;
                case 3 :
                    res = oldValF * newValF;
                    label.setText(res +"");
                    break;
                case 4 :
                    try{
                        res = oldValF / newValF ;
                        label.setText(res +"");
                        break;
                    }catch (Exception ec){
                        label.setText("Error Occurred");
                        break;
                    }
                default:
                    label.setText("Error Occurred");
            }
        }
        else if (e.getSource()== op1){
            isOperatorClicked = true;
            oldVal = label.getText();
            opFinder = 1;
        }else if (e.getSource()== op2){
            isOperatorClicked = true;
            oldVal = label.getText();
            opFinder = 2;
        }else if (e.getSource()== op3){
            isOperatorClicked = true;
            oldVal = label.getText();
            opFinder = 3;
        }else if (e.getSource()== op4){
            isOperatorClicked = true;
            oldVal = label.getText();
            opFinder = 4;
        } else if (e.getSource()==perBtn) {
            label.setText(label.getText() + ".");
        } else if (e.getSource()==clr) {
            label.setText("");
        }
    }
}
public class Calculator{
    public static void main(String[] args) {
        CalcDesign cd = new CalcDesign();
    }
}