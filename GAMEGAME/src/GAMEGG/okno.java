package GAMEGG;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class okno extends JFrame
	{
		private pole gameP;
		private class myKey implements KeyListener
		{
			public void keyPressed(KeyEvent e)
			{
				int key_ = e.getKeyCode();
				if (key_==27)System.exit(0);
				else if(key_==37)
				{
					if (gameP.x-30>-48)gameP.x -= 30;
					else gameP.x = 752;
				}
				else if(key_==39)
				{
					if (gameP.x+30<752)gameP.x += 30;
					else gameP.x=-48;
				}
			}
			public void keyReleased(KeyEvent e) {}
			public void keyTyped(KeyEvent e) {}
		}
		public okno(int slogn)
		{
			addKeyListener(new myKey());
			setFocusable(true);
			setBounds(0,0,800,600);
			setTitle("����: ���������� �����");
			gameP = new pole(slogn);
			Container con = getContentPane();
			con.add(gameP);
			setVisible(true);
		}
		}
