import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;

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
		private final String c="FIRsdfd" +
				"";
		
		private JPanel row1;
		private JPanel row2;
		private JPanel row3;
		private JLabel jL;
		private JLabel jL2;
		private JTextField textField;
		private JButton button;
		
		public GWindow()
		{
			setSize(400,400);
			row1=new JPanel();
			row1.setMinimumSize(new Dimension(400,100));
			jL=new JLabel(prompt);
			textField=new JTextField("",20);
			
			row1.add(jL);
			row1.add(textField);
			add(row1);
			
			setVisible(true);
			setTitle(title);
			
		}
		
	}
	public double convert(double n)
	{
		return (5.0/9.0)*(n-32);
	}
}
