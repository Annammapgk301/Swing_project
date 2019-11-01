package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JMenu;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class teamproject1 {

	private JFrame frame;
	private JTextField textField1;
	double number1;
	double number2;
	String op;
	double result;
	private JTextField con;
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					teamproject1 window = new teamproject1();
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
	public teamproject1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 815, 372);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField1 = new JTextField();
		textField1.setBounds(95, 0, 468, 51);
		frame.getContentPane().add(textField1);
		textField1.setColumns(10);
		
		JButton btnNewButton_2 = new JButton("+/-");
		btnNewButton_2.setBounds(183, 128, 50, 30);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("sqrt");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double number1=Double.parseDouble(textField1.getText());
				double result=Math.sqrt(number1);
				String ans=String.format("%.2f",result);
				textField1.setText(String.valueOf(ans));
			}
		});
		btnNewButton_3.setBounds(243, 128, 50, 30);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("L");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double number1=Double.parseDouble(textField1.getText());
				double result=Math.log(number1);
				String ans=String.format("%.2f",result);
				textField1.setText(String.valueOf(ans));
			}
		});
		btnNewButton_4.setBounds(305, 128, 58, 30);
		frame.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("sin");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double number1=Double.parseDouble(textField1.getText());
				double result=Math.sin(number1);
				String ans=String.format("%.2f",result);
				textField1.setText(String.valueOf(ans));
			}
		});
		btnNewButton_5.setBounds(365, 128, 50, 30);
		frame.getContentPane().add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("sinh");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double number1=Double.parseDouble(textField1.getText());
				double result=Math.sinh(number1);
				String ans=String.format("%.2f",result);
				textField1.setText(String.valueOf(ans));
			}
		});
		btnNewButton_6.setBounds(425, 128, 58, 30);
		frame.getContentPane().add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("c");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double number1=Double.parseDouble(textField1.getText());
				textField1.setText("");
			}
		});
		btnNewButton_7.setBounds(123, 128, 50, 30);
		frame.getContentPane().add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("mod");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double number1=Double.parseDouble(textField1.getText());
				textField1.setText(" ");
				op="%";
			}
		});
		btnNewButton_8.setBounds(503, 128, 60, 30);
		frame.getContentPane().add(btnNewButton_8);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 97, 21);
		frame.getContentPane().add(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		JMenuItem mntmScientific = new JMenuItem("Scientific");
		mntmScientific.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setBounds(100, 100, 570, 372);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.getContentPane().setLayout(null);
				textField1.setBounds(95,0,468,51);
			}
		});
		mnFile.add(mntmScientific);
		
		JMenuItem mntmStandard = new JMenuItem("Standard");
		mntmStandard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setBounds(100, 100, 314, 372);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.getContentPane().setLayout(null);
				textField1.setBounds(95,0,198,51);
			}
		});
		mnFile.add(mntmStandard);
		
		JMenuItem mntmUnit = new JMenuItem("Unit");
		mntmUnit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setBounds(100, 100, 802, 372);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.getContentPane().setLayout(null);
			}
		});
		mnFile.add(mntmUnit);
		
		JMenuItem mntmExit = new JMenuItem("Exit");
		mntmExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int confirmed=JOptionPane.showConfirmDialog(null,"Exit confirmation?");
				if(confirmed==JOptionPane.YES_OPTION) {
				System.exit(0);}
			}
		});
		mnFile.add(mntmExit);
		
		JButton button7 = new JButton("7");
		button7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number1=textField1.getText()+button7.getText();
				textField1.setText(number1);
			}
		});
		button7.setBounds(10, 169, 50, 30);
		frame.getContentPane().add(button7);
		
		JButton button8 = new JButton("8");
		button8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number1=textField1.getText()+button8.getText();
				textField1.setText(number1);
			}
		});
		button8.setBounds(70, 169, 50, 30);
		frame.getContentPane().add(button8);
		
		JButton button9 = new JButton("9");
		button9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number1=textField1.getText()+button9.getText();
				textField1.setText(number1);
			}
		});
		button9.setBounds(123, 169, 50, 30);
		frame.getContentPane().add(button9);
		
		JButton btnNewButton_12 = new JButton("/");
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double number1=Double.parseDouble(textField1.getText());
				textField1.setText(" ");
				op="/";
				
			}
		});
		btnNewButton_12.setBounds(183, 169, 50, 30);
		frame.getContentPane().add(btnNewButton_12);
		
		JButton btnNewButton_13 = new JButton("%");
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double number1=Double.parseDouble(textField1.getText());
				textField1.setText(" ");
				op="%";
				
			}
		});
		btnNewButton_13.setBounds(243, 169, 50, 30);
		frame.getContentPane().add(btnNewButton_13);
		
		JButton btnNewButton_14 = new JButton("Pi");
		btnNewButton_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double number1=Double.parseDouble(textField1.getText());
				double result=3.14*(number1);
				String ans=String.format("%.2f",result);
				textField1.setText(String.valueOf(ans));
			}
		});
		btnNewButton_14.setBounds(305, 169, 58, 30);
		frame.getContentPane().add(btnNewButton_14);
		
		JButton btnNewButton_15 = new JButton("cos");
		btnNewButton_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double number1=Double.parseDouble(textField1.getText());
				double result=Math.cos(number1);
				String ans=String.format("%.2f",result);
				textField1.setText(String.valueOf(ans));
			}
		});
		btnNewButton_15.setBounds(365, 169, 50, 30);
		frame.getContentPane().add(btnNewButton_15);
		
		JButton btnNewButton_16 = new JButton("cosh");
		btnNewButton_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double number1=Double.parseDouble(textField1.getText());
				double result=Math.cosh(number1);
				String ans=String.format("%.2f",result);
				textField1.setText(String.valueOf(ans));
			}
		});
		btnNewButton_16.setBounds(425, 169, 58, 30);
		frame.getContentPane().add(btnNewButton_16);
		
		JButton btnNewButton_17 = new JButton("lnx");
		btnNewButton_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double number1=Double.parseDouble(textField1.getText());
				double result=Math.log(number1)/10;
				String ans=String.format("%.2f",result);
				textField1.setText(String.valueOf(ans));
			}
		});
		btnNewButton_17.setBounds(503, 169, 58, 30);
		frame.getContentPane().add(btnNewButton_17);
		
		JButton button4 = new JButton("4");
		button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number1=textField1.getText()+button4.getText();
				textField1.setText(number1);
			}
		});
		button4.setBounds(10, 210, 50, 30);
		frame.getContentPane().add(button4);
		
		JButton button5 = new JButton("5");
		button5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number1=textField1.getText()+button5.getText();
				textField1.setText(number1);
			}
		});
		button5.setBounds(70, 210, 50, 30);
		frame.getContentPane().add(button5);
		
		JButton button6 = new JButton("6");
		button6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number1=textField1.getText()+button6.getText();
				textField1.setText(number1);
			}
			
		});
		button6.setBounds(123, 210, 50, 30);
		frame.getContentPane().add(button6);
		
		JButton btnNewButton_21 = new JButton("*");
		btnNewButton_21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double number1=Double.parseDouble(textField1.getText());
				textField1.setText(" ");
				op="*";
			}
		});
		btnNewButton_21.setBounds(183, 210, 50, 30);
		frame.getContentPane().add(btnNewButton_21);
		
		JButton btnNewButton_22 = new JButton("1/x");
		btnNewButton_22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double number1=Double.parseDouble(textField1.getText());
				double result=1/number1;
				String ans=String.format("%.2f",result);
				textField1.setText(String.valueOf(ans));
			}
		});
		btnNewButton_22.setBounds(243, 210, 50, 30);
		frame.getContentPane().add(btnNewButton_22);
		
		JButton btnNewButton_23 = new JButton("x^y");
		btnNewButton_23.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double number1=Double.parseDouble(textField1.getText());
				double number2=Double.parseDouble(textField1.getText());
				double result=Math.pow(number1,number2);
				String ans=String.format("%.2f",result);
				textField1.setText(String.valueOf(ans));
			}
		});
		btnNewButton_23.setBounds(305, 210, 58, 30);
		frame.getContentPane().add(btnNewButton_23);
		
		JButton btnNewButton_24 = new JButton("Tan");
		btnNewButton_24.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double number1=Double.parseDouble(textField1.getText());
				double result=Math.tan(number1);
				String ans=String.format("%.2f",result);
				textField1.setText(String.valueOf(ans));
			}
		});
		btnNewButton_24.setBounds(365, 210, 50, 30);
		frame.getContentPane().add(btnNewButton_24);
		
		JButton btnNewButton_25 = new JButton("Tanh");
		btnNewButton_25.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double number1=Double.parseDouble(textField1.getText());
				double result=Math.tanh(number1);
				String ans=String.format("%.2f",result);
				textField1.setText(String.valueOf(ans));
			}
		});
		btnNewButton_25.setBounds(425, 210, 58, 30);
		frame.getContentPane().add(btnNewButton_25);
		
		JButton btnNewButton_26 = new JButton("C");
		btnNewButton_26.setBounds(503, 210, 60, 30);
		frame.getContentPane().add(btnNewButton_26);
		
		JButton button1 = new JButton("1");
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number1=textField1.getText()+button1.getText();
				textField1.setText(number1);
			}
		});
		button1.setBounds(10, 251, 50, 30);
		frame.getContentPane().add(button1);
		
		JButton button2 = new JButton("2");
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number1=textField1.getText()+button2.getText();
				textField1.setText(number1);
			}
		});
		button2.setBounds(70, 251, 50, 30);
		frame.getContentPane().add(button2);
		
		JButton button3 = new JButton("3");
		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number1=textField1.getText()+button3.getText();
				textField1.setText(number1);
			}
		});
		button3.setBounds(123, 251, 50, 30);
		frame.getContentPane().add(button3);
		
		JButton btnNewButton_30 = new JButton("-");
		btnNewButton_30.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			 number1=Double.parseDouble(textField1.getText());
				textField1.setText(" ");
				op="-";
			}
		});
		btnNewButton_30.setBounds(183, 251, 50, 30);
		frame.getContentPane().add(btnNewButton_30);
		
		JButton btnNewButton_31 = new JButton("=");
		btnNewButton_31.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ans;
				number2=Double.parseDouble(textField1.getText());
				if(op=="+")
				{
				result=number1+number2;
				ans=String.format("%.2f", result);
				textField1.setText(ans);
				}
				if(op=="-")
				{
				result=number1-number2;
				ans=String.format("%.2f", result);
				textField1.setText(ans);
				}
				if(op=="*")
				{
				result=number1*number2;
				ans=String.format("%.2f", result);
				textField1.setText(ans);
				}
				if(op=="/")
				{
				result=number1/number2;
				ans=String.format("%.2f", result);
				textField1.setText(ans);
				}
				if(op=="%")
				{
				result=number1%number2;
				ans=String.format("%.2f", result);
				textField1.setText(ans);
				}
				if(op=="Cbr")
				{
					result=(number1/number2)*100;
					ans=String.format("%.2f", result);
					textField1.setText(ans);
				}
			}
		});
		btnNewButton_31.setBounds(243, 251, 50, 81);
		frame.getContentPane().add(btnNewButton_31);
		
		JButton btnNewButton_32 = new JButton("x^2");
		btnNewButton_32.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double number1=Double.parseDouble(textField1.getText());
				double result=number1*number1;
				String ans=String.format("%.2f",result);
				textField1.setText(String.valueOf(ans));
			}
		});
		btnNewButton_32.setBounds(305, 251, 58, 30);
		frame.getContentPane().add(btnNewButton_32);
		
		JButton btnNewButton_33 = new JButton("Cbr");
		btnNewButton_33.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 number1=Double.parseDouble(textField1.getText());
				textField1.setText("");
				op="Cbr";
			}
		});
		btnNewButton_33.setBounds(365, 251, 50, 30);
		frame.getContentPane().add(btnNewButton_33);
		
		JButton btnNewButton_34 = new JButton("Rund");
		btnNewButton_34.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double number1=Double.parseDouble(textField1.getText());
				double result=Math.round(number1);
				String ans=String.format("%.2f",result);
				textField1.setText(String.valueOf(ans));
				
			}
		});
		btnNewButton_34.setBounds(425, 251, 58, 30);
		frame.getContentPane().add(btnNewButton_34);
		
		JButton btnNewButton_35 = new JButton("2*Pi");
		btnNewButton_35.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double number1=Double.parseDouble(textField1.getText());
				double result=2*3.14;
				String ans=String.format("%.2f",result);
				textField1.setText(String.valueOf(ans));
			}
		});
		btnNewButton_35.setBounds(495, 251, 68, 30);
		frame.getContentPane().add(btnNewButton_35);
		
		JButton button0 = new JButton("0");
		button0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number1=textField1.getText()+button0.getText();
				textField1.setText(number1);
			}
		});
		button0.setBounds(10, 291, 110, 30);
		frame.getContentPane().add(button0);
		
		JButton button = new JButton(".");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number1=textField1.getText()+button.getText();
				textField1.setText(number1);
			}
		});
		button.setBounds(123, 291, 50, 30);
		frame.getContentPane().add(button);
		
		JButton btnNewButton_38 = new JButton("+");
		btnNewButton_38.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 number1=Double.parseDouble(textField1.getText());
				textField1.setText(" ");
				op="+";
			}
		});
		btnNewButton_38.setBounds(183, 292, 50, 30);
		frame.getContentPane().add(btnNewButton_38);
		
		JButton btnNewButton_40 = new JButton("x^3");
		btnNewButton_40.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double number1=Double.parseDouble(textField1.getText());
				double result=number1*number1*number1;
				String ans=String.format("%.2f",result);
				textField1.setText(String.valueOf(ans));
			}
		});
		btnNewButton_40.setBounds(305, 292, 58, 30);
		frame.getContentPane().add(btnNewButton_40);
		
		JButton btnNewButton_41 = new JButton("Bin");
		btnNewButton_41.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int number1=Integer.parseInt(textField1.getText());
				textField1.setText(Integer.toBinaryString(number1));
			}
		});
		btnNewButton_41.setBounds(365, 292, 50, 30);
		frame.getContentPane().add(btnNewButton_41);
		
		JButton btnNewButton_42 = new JButton("Hex");
		btnNewButton_42.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int number1=Integer.parseInt(textField1.getText());
				textField1.setText(Integer.toHexString(number1));
			}
		});
		btnNewButton_42.setBounds(425, 292, 58, 30);
		frame.getContentPane().add(btnNewButton_42);
		
		JButton btnNewButton_43 = new JButton("Oc..");
		btnNewButton_43.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int number1=Integer.parseInt(textField1.getText());
				textField1.setText(Integer.toOctalString(number1));
			}
		});
		btnNewButton_43.setBounds(485, 292, 68, 30);
		frame.getContentPane().add(btnNewButton_43);
		
		JPanel panel = new JPanel();
		panel.setBounds(571, 0, 224, 332);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblCurrencyConverrter = new JLabel("Currency  Converter");
		lblCurrencyConverrter.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblCurrencyConverrter.setBounds(21, 11, 184, 34);
		panel.add(lblCurrencyConverrter);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"USA", "INDIA", "CHINA", "BRAZIL", "CANADA"}));
		comboBox.setBounds(60, 67, 85, 20);
		panel.add(comboBox);
		
		con = new JTextField();
		con.setBounds(60, 136, 86, 20);
		panel.add(con);
		con.setColumns(10);
		
		JLabel label = new JLabel("");
		label.setBounds(60, 196, 86, 20);
		panel.add(label);
		
		JButton btnNewButton = new JButton("Convert");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double bp=Double.parseDouble(con.getText());
				if(comboBox.getSelectedItem().equals("INDIA"))
				{
					String c=String.format("Rs %.2f",bp*40);
					label.setText(c);
				}
				else if(comboBox.getSelectedItem().equals("CHINA"))
				{
					String c=String.format("Rs %.2f",bp*50);
					label.setText(c);
				}
				else if(comboBox.getSelectedItem().equals("BRAZIL"))
				{
					String c=String.format("Rs %.2f",bp*30);
					label.setText(c);
				}
				else
				{
					String c=String.format("Rs %.2f",bp*20);
					label.setText(c);
				}
				
			}
		});
		btnNewButton.setBounds(10, 281, 89, 23);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Clear");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double number1=Double.parseDouble(con.getText());
				con.setText("");
			}
		});
		btnNewButton_1.setBounds(127, 281, 89, 23);
		panel.add(btnNewButton_1);
	}
}
