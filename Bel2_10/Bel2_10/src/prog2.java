import javax.swing.JFrame;

public class prog2 {
	public static void main(String[] args) throws Exception{
		myFrame	ob1 = null;
		ob1 = new myFrame(300);
}
}
class myFrame extends JFrame
{
	private int val;
	public myFrame(int val)
	{
		this.val = val;
		setBounds(val,val,500,400);
		setVisible(true);
	}
}