package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class project {

	private JFrame frame;
	private JTextField textField;
	double temp;
    double result;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					project window = new project();
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
	public project() {
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
		
		JLabel lblDegree = new JLabel("Degrees");
		lblDegree.setBounds(69, 68, 65, 14);
		frame.getContentPane().add(lblDegree);
		
		textField = new JTextField();
		textField.setBounds(174, 65, 157, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblResult = new JLabel("Result");
		lblResult.setBounds(113, 132, 46, 14);
		frame.getContentPane().add(lblResult);
		JLabel label = new JLabel("");
		label.setBounds(181, 132, 46, 14);
		frame.getContentPane().add(label);
		
		JButton btnToCelsious = new JButton("To celsius");
		btnToCelsious.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				temp=Double.parseDouble(textField.getText());
				result=(temp-32)/1.8;
				String ans=String.format("%.1f",result);
				label.setText(ans);
				
			}
		});
		btnToCelsious.setBounds(10, 208, 200, 20);
		frame.getContentPane().add(btnToCelsious);
		
		
		JButton btnToFarenheat = new JButton("To fahrenheat");
		btnToFarenheat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				temp=Double.parseDouble(textField.getText());
				result=(temp*1.8)+32;
				String ans=String.format("%.1f",result);
				label.setText(ans);
				
			}
		});
		btnToFarenheat.setBounds(224, 208, 200, 20);
		frame.getContentPane().add(btnToFarenheat);
		
		
	}
}
