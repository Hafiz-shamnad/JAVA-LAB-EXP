import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class TrafficLightDesign extends JPanel implements ActionListener {
    private final JRadioButton stopBtn;
    private final JRadioButton goBtn;
    private final JRadioButton slowBtn;
    private Color redBulb, greenBulb, orangeBulb;

    TrafficLightDesign() {
        setBounds(0, 0, 300, 600);
        stopBtn = new JRadioButton("STOP");
        slowBtn = new JRadioButton("SLOW");
        goBtn = new JRadioButton("GO");

        ButtonGroup bg = new ButtonGroup();
        bg.add(stopBtn);
        bg.add(slowBtn);
        bg.add(goBtn);

        stopBtn.addActionListener(this);
        slowBtn.addActionListener(this);
        goBtn.addActionListener(this);

        redBulb = Color.RED;
        greenBulb = getBackground();
        orangeBulb = getBackground();

        add(goBtn);
        add(stopBtn);
        add(slowBtn);
    }

        public void actionPerformed(ActionEvent e) {
            System.out.println("Action Performed");
            if (stopBtn.isSelected()) {
                redBulb = Color.RED;
                orangeBulb = getBackground();
                greenBulb = getBackground();
            } else if (slowBtn.isSelected()) {
                orangeBulb = Color.ORANGE;
                redBulb = getBackground();
                greenBulb = getBackground();
            } else if (goBtn.isSelected()) {
                greenBulb = Color.GREEN;
                redBulb = getBackground();
                orangeBulb = getBackground();
            }
            repaint();
        }



    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        int x = getWidth() / 2 - 30;
        int y = getHeight() / 2 - 80;
        g.drawOval(x + 10, y + 110, 40, 40);
        g.drawOval(x + 10, y + 10, 40, 40);
        g.drawOval(x + 10, y + 60, 40, 40);

        g.setColor(redBulb);
        g.fillOval(x + 10, y + 10, 40, 40); // drawing red light

        g.setColor(orangeBulb);
        g.fillOval(x + 10, y + 60, 40, 40); // drawing orange light

        g.setColor(greenBulb);
        g.fillOval(x + 10, y + 110, 40, 40); // drawing green light
    }
}

public class TrafficLight {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Traffic Light");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        TrafficLightDesign trafficLight = new TrafficLightDesign();
        frame.add(trafficLight);
        frame.setSize(300, 600);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
