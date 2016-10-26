import javax.swing.*;
public class Conversion {
	public static void main(String args[])
	{
		Conversion c=new Conversion();
		GWindow win= c.new GWindow();
		return;
	}
	private class GWindow extends JFrame
	{
		private final String title="Conversion!";
		private final String prompt="Enter Temp";
		private final String ct="Converted Temp:";
		private final String c="FIRST GIT PROJECT" +
				"";
		
		private JPanel jP;
		private JLabel jL;
		private JLabel jL2;
		private JButton button;
		
		public GWindow()
		{
			setSize(400,400);
			setVisible(true);
			setTitle(title);
			
		}
		
	}
	public double convert(double n)
	{
		return (5.0/9.0)*(n-32);
	}
}
