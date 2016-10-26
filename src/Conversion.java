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
		private final String c="Convert!";
		public GWindow()
		{
			setSize(400,400);
			setVisible(true);
			setTitle(title);
			JOptionPane jOP=new JOptionPane();
			add(jOP);
		}
		
	}
	public double convert(double n)
	{
		return (5.0/9.0)*(n-32);
	}
}
