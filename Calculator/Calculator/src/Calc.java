import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calc {
    public static void main(String[]args) {
        okno nf = new okno();
    }
}

class okno extends JFrame {
    private JTextArea text;
    private double p1=0, p2=0;
    private int oper = 0;

    private void btnClick(JButton btn) {
        String str = btn.getText();
        if (str == "���") {
            System.exit(0);
        } else if (str == "C") {
            text.setText("");
            p1 = p2 = 0;
        } else if (str == "=") {
            p2 = Double.parseDouble(text.getText());
            if (oper == 1) {
                text.setText("" + (p1 + p2));
            } else if (oper == 2) {
                text.setText("" + (p1 - p2));
            } else if (oper == 3) {
                text.setText("" + (p1 * p2));
            } else if (oper == 4) {
                text.setText("" + (p1 / p2));
            } else if (oper == 5) {
                text.setText("" + Math.pow(p1,p2));
            }
        } else if (str == "+") {
            oper = 1;
            p1 = Double.parseDouble(text.getText());
            text.setText("");
        } else if (str == "-") {
            oper = 2;
            p1 = Double.parseDouble(text.getText());
            text.setText("");
        } else if (str == "*") {
            oper = 3;
            p1 = Double.parseDouble(text.getText());
            text.setText("");
        } else if (str == "/") {
            oper = 4;
            p1 = Double.parseDouble(text.getText());
            text.setText("");
        } else if (str == "^") {
            oper = 5;
            p1 = Double.parseDouble(text.getText());
            text.setText("");
        } else {
            text.setText(text.getText() + str);
        }
    }

    public okno() {
        Container cont = getContentPane();
        JPanel pan = new JPanel();
        pan.setLayout(null);
        Font btnFont = new Font("serif", 0, 20);
        Font labFont = new Font("arial", 1, 30);
        Font textFont = new Font("arial", 2, 30);
        JButton[] btn = new JButton[18];
        for (int i = 0; i < 18; i++) {
            btn[i] = new JButton();
            btn[i].setSize(100, 25);
            btn[i].setFont(btnFont);
            btn[i].setLocation(30, 50 + i * 30);
            btn[i].addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    btnClick((JButton) e.getSource());
                }
            });
            pan.add(btn[i]);
        }
        for (int i = 0; i < 10; i++) {
            btn[i].setText("" + i);
        }
        btn[10].setText("+");
        btn[11].setText("-");
        btn[12].setText("/");
        btn[13].setText("*");
        btn[14].setText("=");
        btn[15].setText("^");
        btn[16].setText("C");
        btn[17].setText("�����");
        JLabel lab = new JLabel("�����:");
        lab.setFont(labFont);
        lab.setBounds(130, 0, 300, 50);
        pan.add(lab);
        text = new JTextArea();
    text.setFont(textFont);
    text.setBounds(300, 10, 300, 35);
    text.setForeground(new Color(0, 0, 100 ));
    text.setBackground(Color.WHITE);
    pan.add(text);

    
    cont.add(pan);
    setBounds(0, 0, 800, 600);
    setTitle("�����������");
    setVisible(true);
    
}
}
	

