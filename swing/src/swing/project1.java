package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;

public class project1 {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					project1 window = new project1();
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
	public project1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblInput = new JLabel("Input");
		lblInput.setBounds(42, 33, 46, 14);
		frame.getContentPane().add(lblInput);
		
		textField = new JTextField();
		textField.setBounds(114, 30, 243, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblInputScale = new JLabel("Input Scale");
		lblInputScale.setBounds(24, 71, 80, 14);
		frame.getContentPane().add(lblInputScale);
		
		JLabel lblOutputScale = new JLabel("Output Scale");
		lblOutputScale.setBounds(284, 71, 62, 14);
		frame.getContentPane().add(lblOutputScale);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Celsius");
		rdbtnNewRadioButton.setBounds(6, 105, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Fahrenheat");
		rdbtnNewRadioButton_1.setBounds(6, 152, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Kelvin");
		rdbtnNewRadioButton_2.setBounds(6, 206, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_2);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("Celsius");
		rdbtnNewRadioButton_3.setBounds(284, 105, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_3);
		
		JRadioButton rdbtnNewRadioButton_4 = new JRadioButton("Fahrenheat");
		rdbtnNewRadioButton_4.setBounds(284, 152, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_4);
		
		JRadioButton rdbtnNewRadioButton_5 = new JRadioButton("Kelvin");
		rdbtnNewRadioButton_5.setBounds(284, 206, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_5);
		
		JLabel lblOutput = new JLabel("Output");
		lblOutput.setBounds(81, 236, 46, 14);
		frame.getContentPane().add(lblOutput);
		
		JLabel label = new JLabel("");
		label.setBounds(179, 236, 46, 14);
		frame.getContentPane().add(label);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(24, 105, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnCelsius = new JButton("celsius");
		btnCelsius.setBounds(24, 105, 89, 23);
		frame.getContentPane().add(btnCelsius);
	}
}
