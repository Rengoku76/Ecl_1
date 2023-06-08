import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.io.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

public class prog extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldFile;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					prog frame = new prog();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public prog() {
		setTitle("\u041E\u043F\u0435\u0440\u0430\u0446\u0438\u0438 \u0434\u043B\u044F \u0440\u0430\u0431\u043E\u0442\u044B \u0441 \u0444\u0430\u0439\u043B\u0430\u043C\u0438");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel btnPro = new JLabel("������� ���� � �����: ");
		btnPro.setBounds(10, 25, 130, 14);
		contentPane.add(btnPro);
		
		textFieldFile = new JTextField();
		textFieldFile.setBounds(144, 22, 280, 20);
		contentPane.add(textFieldFile);
		textFieldFile.setColumns(10);
		
		JButton buttonNoviy = new JButton("������� �����");
		buttonNoviy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str = textFieldFile.getText().trim();
				if (str.isEmpty())
				{
					JOptionPane.showMessageDialog(null,"������� ���� � �����!","������",0);
				}
				else
				{
					File nf = new File(str);
					try
					{
						nf.createNewFile();
						JOptionPane.showMessageDialog(null, "���� ������!","���������",1);
					}
					catch(IOException exp)
					{
						JOptionPane.showMessageDialog(null,"���� �� ������!","������",0);
					}
				}
			}
		});
		buttonNoviy.setBounds(10, 59, 120, 23);
		contentPane.add(buttonNoviy);
		
		JButton buttonUdalit = new JButton("�������");
		buttonUdalit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str = textFieldFile.getText().trim();
				if (str.isEmpty())
				{
					JOptionPane.showMessageDialog(null,"������� ���� � �����!","������",0);
				}
				else
				{
					File nf = new File(str);
					if (nf.exists())
					{
						nf.delete();
						JOptionPane.showMessageDialog(null, "���� �����!","���������",1);
					}
					else
					{
						
						JOptionPane.showMessageDialog(null,"���� �� ������!","������",0);
					}
				}
			}
		});
		buttonUdalit.setBounds(10, 93, 120, 23);
		contentPane.add(buttonUdalit);
		
		JButton buttonPereim = new JButton("�������������");
		buttonPereim.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str = textFieldFile.getText().trim();
				if (str.isEmpty())
				{
					JOptionPane.showMessageDialog(null,"������� ���� � �����!","������",0);
				}
				else
				{
					File nf = new File(str);
					if (nf.exists())
					{
						String newName = JOptionPane.showInputDialog("������� ����� ���:");
						if (newName==null) newName="";
						if (!newName.trim().isEmpty())
						{
							File newFile = new File(nf.getParent()+"\\"+newName);
							nf.renameTo(newFile);
							JOptionPane.showMessageDialog(null,"���� ������������!","���������",1);
						}
					}
					else
					{
						
						JOptionPane.showMessageDialog(null,"���� �� ������!","������",0);
					}
				}
			}
		});
		buttonPereim.setBounds(10, 127, 120, 23);
		contentPane.add(buttonPereim);
		
		JButton buttonProch = new JButton("���������");
		buttonProch.setBounds(10, 161, 120, 23);
		contentPane.add(buttonProch);
		
		JButton buttonZap = new JButton("��������");
		buttonZap.setBounds(10, 195, 120, 23);
		contentPane.add(buttonZap);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(144, 53, 280, 197);
		contentPane.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
	}
}
