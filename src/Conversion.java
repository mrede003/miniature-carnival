import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;

import javax.swing.*;

/**
 * Class that lets the user enter a temperature
 * in fahrenheit and converts it to celcius.
 * @author mattbox
 *
 */
public class Conversion {
	public static void main(String args[]) {
		Conversion c = new Conversion();
		GWindow win = c.new GWindow();
		return;
	}
	/**
	 * Class that extends JFrame and 
	 * adds in two Jlabels, and a textfield.
	 * @author mattbox
	 *
	 */
	private class GWindow extends JFrame {
		private final String title = "Fahrenheit to Celcius";
		private final String prompt = "Enter Temp";
		private final String ct = "Converted Temp: ";

		private JPanel row1;
		private JPanel row2;
		private JLabel jL;
		private JLabel jL2;
		private JTextField textField;

		public GWindow() {
			setSize(400, 400);
			row1 = new JPanel();
			jL = new JLabel(prompt);
			textField = new JTextField("", 15);
			row1.add(jL);
			row1.add(textField);

			row2 = new JPanel();
			jL2 = new JLabel(ct);
			row2.add(jL2);

			Action action = new AbstractAction() {
				public void actionPerformed(ActionEvent e) {
					try {
						jL2.setText(ct
								+ String.valueOf(String.format("%.2f",
										convert(Integer.parseInt(textField
												.getText())))));
					} catch (NumberFormatException a) {
						jL2.setText("INVALID DATA");
					}
				}
			};
			textField.addActionListener(action);
			add(row1, BorderLayout.NORTH);
			add(row2, BorderLayout.CENTER);
			pack();
			setVisible(true);
			setTitle(title);
		}

	}
	/**
	 * method that converts a fahrenheit temp.
	 * into a celcius temp
	 * @param int temperature
	 * @return double temperature
	 */
	public double convert(int temperature) {
		return (5.0 / 9.0) * (temperature - 32);
	}
}
