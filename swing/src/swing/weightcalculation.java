package swing;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class weightcalculation {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	double height;
	double weight;
	double result1;
	double result2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					weightcalculation window = new weightcalculation();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public weightcalculation() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 415, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblHelp = new JLabel("Help");
		lblHelp.setBounds(21, 25, 46, 14);
		frame.getContentPane().add(lblHelp);
		
		JLabel lblAbout = new JLabel("About");
		lblAbout.setBounds(77, 25, 46, 14);
		frame.getContentPane().add(lblAbout);
		
		textField = new JTextField();
		textField.setBounds(88, 96, 129, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(88, 142, 129, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		JLabel label1 = new JLabel("");
		label1.setBounds(307, 99, 46, 14);
		frame.getContentPane().add(label1);
		
		JLabel label2 = new JLabel("");
		label2.setBounds(307, 145, 46, 14);
		frame.getContentPane().add(label2);
		
		JButton btnNewButton = new JButton("Ok");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				height=Double.parseDouble(textField.getText());
				weight=Double.parseDouble(textField_1.getText());
				result1=height*.296;
				String ans1=String.format("%.2f",result1);
				label1.setText(ans1);
				result2=weight*0.45359237;
				String ans2=String.format("%.2f",result2);
				label2.setText(ans2);
				
			}
		});
		btnNewButton.setBounds(66, 204, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Cancel");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
			
		});
		btnNewButton_1.setBounds(252, 204, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JLabel lblHeight = new JLabel("Height");
		lblHeight.setBounds(32, 99, 46, 14);
		frame.getContentPane().add(lblHeight);
		
		JLabel lblWeight = new JLabel("Weight");
		lblWeight.setBounds(32, 145, 46, 14);
		frame.getContentPane().add(lblWeight);
		
		JLabel lblMetric = new JLabel("Metric");
		lblMetric.setBounds(295, 56, 46, 14);
		frame.getContentPane().add(lblMetric);
		
		JLabel lblUsMeasurement = new JLabel("US measurement");
		lblUsMeasurement.setBounds(88, 67, 129, 14);
		frame.getContentPane().add(lblUsMeasurement);
		
		
	}
}
