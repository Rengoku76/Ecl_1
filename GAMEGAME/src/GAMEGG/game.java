package GAMEGG;
import javax.swing.*;
public class game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String rez = JOptionPane.showInputDialog(null,"������� ��������� ���� �� 1 �� 7:","��������� ����",1);
		int slogn = rez.charAt(0)-'0';
		if ((slogn>=1)&&(slogn<=7))
		{
		okno window = new okno(slogn);
	}

}
}