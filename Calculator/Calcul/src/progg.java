
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class progg {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		okno nf = new okno();
	}
}
class okno extends JFrame
{
	private JTextArea text;
	private double p1=0,p2=0;
	private int oper=0;
	private void btnClick(JButton btn)
		{
		}
public okno()
{
Container cont = getContentPane();
JPanel pan = new JPanel();
pan.setLayout(null);
Font btnFont = new Font("serif",0,20);
Font labFont = new Font("arial",1,30);
Font textFont = new Font("arial",2,30);
JButton[] btn = new JButton[17];
for (int i=0;i<17;i++)
{
	btn[i] = new JButton();
	btn[i].setSize(100,25);
	btn[i].setFont(btnFont);
	btn[i].setLocation(30,50+i*30);
	btn[i].addActionListener(new ActionListener()
			{
			public void actionPerformed(ActionEvent e) {
		btnClick((JButton)e.getSource());
		/*JOptionPane.showMessageDialog(null,"Привет!");*/
		}});
	pan.add(btn[i]);
}
for (int i=0;i<10;i++) btn[i].setText(""+i);
btn[10].setText("+");
btn[11].setText("-");
btn[12].setText("/");
btn[13].setText("*");
btn[14].setText("=");
btn[15].setText("C");
btn[16].setText("Выход");

JLabel lab = new JLabel("Результат: ");
lab.setFont(labFont);
lab.setBounds(130,0,300,50);
pan.add(lab);
cont.add(pan);
setBounds(0,0,800,600);
setTitle("Калькулятор");
setVisible(true);

}


}