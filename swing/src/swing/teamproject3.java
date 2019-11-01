package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Font;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.border.MatteBorder;
import javax.swing.JSeparator;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.awt.event.ActionEvent;
import javax.swing.SpringLayout;
import javax.swing.JTextArea;

public class teamproject3 {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					teamproject3 window = new teamproject3();
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
	public teamproject3() {
		initialize();
	}
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 821, 483);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(414, 60, 381, 266);
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Ticket Details", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblName.setBounds(35, 38, 46, 14);
		panel.add(lblName);
		
		textField = new JTextField();
		textField.setBounds(127, 37, 86, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblFrom = new JLabel("From");
		lblFrom.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblFrom.setBounds(35, 91, 46, 14);
		panel.add(lblFrom);
		
		textField_1 = new JTextField();
		textField_1.setBounds(127, 88, 86, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblTo = new JLabel("To");
		lblTo.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblTo.setBounds(35, 133, 46, 14);
		panel.add(lblTo);
		
		JLabel lblDate = new JLabel("Date");
		lblDate.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDate.setBounds(35, 169, 46, 14);
		panel.add(lblDate);
		
		JLabel lblTime = new JLabel("Time");
		lblTime.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblTime.setBounds(35, 207, 46, 14);
		panel.add(lblTime);
		
		textField_2 = new JTextField();
		textField_2.setBounds(127, 130, 86, 20);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(127, 166, 86, 20);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(127, 204, 86, 20);
		panel.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblTicketNo = new JLabel("Ticket No");
		lblTicketNo.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblTicketNo.setBounds(255, 40, 96, 14);
		panel.add(lblTicketNo);
		
		textField_5 = new JTextField();
		textField_5.setBounds(243, 60, 86, 20);
		panel.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblPrice = new JLabel("Price");
		lblPrice.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblPrice.setBounds(253, 91, 46, 14);
		panel.add(lblPrice);
		
		textField_6 = new JTextField();
		textField_6.setBounds(243, 116, 86, 20);
		panel.add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblRoute = new JLabel("Route");
		lblRoute.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblRoute.setBounds(255, 169, 46, 14);
		panel.add(lblRoute);
		
		textField_7 = new JTextField();
		textField_7.setBounds(243, 194, 86, 20);
		panel.add(textField_7);
		textField_7.setColumns(10);
		
		JButton btnConfirm = new JButton("Confirm");
		btnConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new String[]
						{
							textField.getText(),
							textField.getText(),
							textField_1.getText(),
							textField_2.getText(),
							textField_3.getText(),
							textField_4.getText(),
							textField_5.getText(),
							textField_6.getText(),
							textField_7.getText(),
						});
			}
							
		});
		btnConfirm.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnConfirm.setBounds(163, 235, 89, 23);
		panel.add(btnConfirm);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 372, 785, 62);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		table = new JTable();
		table.setFont(new Font("Tahoma", Font.BOLD, 11));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Name","Booking No","From","To","No of seats","Time","Date","Ac/nonAc","Price"},
			},
			new String[] {
					"Name","Booking No","From","To","No of seats","Time","Date","Ac/nonAc","Price"
				
			}
		));
		table.setBounds(0, 0, 785, 62);
		panel_1.add(table);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(222, 11, 318, 38);
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		frame.getContentPane().add(panel_3);
		
		JLabel lblTicketBooking = new JLabel("Ticket Booking");
		lblTicketBooking.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel_3.add(lblTicketBooking);
		
		JLabel lblName_1 = new JLabel("Name");
		lblName_1.setBounds(50, 103, 46, 14);
		lblName_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		frame.getContentPane().add(lblName_1);
		
		textField_8 = new JTextField();
		textField_8.setBounds(145, 102, 86, 20);
		frame.getContentPane().add(textField_8);
		textField_8.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 133, 394, 4);
		frame.getContentPane().add(separator);
		
		JRadioButton rb1 = new JRadioButton("Standard");
		rb1.setBounds(10, 144, 86, 23);
		frame.getContentPane().add(rb1);
		
		JRadioButton rb2 = new JRadioButton("Single Ticket");
		rb2.setBounds(145, 144, 109, 23);
		frame.getContentPane().add(rb2);
		
		JRadioButton rb3 = new JRadioButton("Adult");
		rb3.setBounds(305, 133, 109, 23);
		frame.getContentPane().add(rb3);
		
		JRadioButton rb4 = new JRadioButton("First Class");
		rb4.setBounds(10, 170, 86, 23);
		frame.getContentPane().add(rb4);
		
		JRadioButton rb5 = new JRadioButton("Ac");
		rb5.setBounds(102, 170, 37, 23);
		frame.getContentPane().add(rb5);
		
		JRadioButton rb7 = new JRadioButton("Child");
		rb7.setBounds(305, 170, 109, 23);
		frame.getContentPane().add(rb7);
		
		JRadioButton rdbtn = new JRadioButton("sleeper");
		rdbtn.setBounds(155, 170, 109, 23);
		frame.getContentPane().add(rdbtn);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(20, 200, 76, 20);
		comboBox.setFont(new Font("Tahoma", Font.BOLD, 11));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Arunachalpradhesh", "Himachalpradhesh", "Madhyapradhesh"}));
		frame.getContentPane().add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(155, 200, 76, 20);
		comboBox_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Kerala", "Tamilnadu", "Karnataka"}));
		frame.getContentPane().add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(294, 200, 70, 20);
		comboBox_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		frame.getContentPane().add(comboBox_2);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 240, 394, 4);
		frame.getContentPane().add(separator_1);
		
		JLabel lblTax = new JLabel("Tax");
		lblTax.setBounds(20, 255, 46, 14);
		frame.getContentPane().add(lblTax);
		
		JLabel lblNewLabel = new JLabel("Total");
		lblNewLabel.setBounds(20, 313, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Sub Total");
		lblNewLabel_1.setBounds(20, 288, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField_9 = new JTextField();
		textField_9.setBounds(102, 252, 86, 20);
		frame.getContentPane().add(textField_9);
		textField_9.setColumns(10);
		
		textField_10 = new JTextField();
		textField_10.setBounds(102, 285, 86, 20);
		frame.getContentPane().add(textField_10);
		textField_10.setColumns(10);
		
		textField_11 = new JTextField();
		textField_11.setBounds(102, 315, 86, 20);
		frame.getContentPane().add(textField_11);
		textField_11.setColumns(10);
		
		JButton btnNewButton = new JButton("Total");
		btnNewButton.setBounds(30, 338, 89, 23);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String name=textField_8.getText();
				textField.setText(name);
				String From=(String)comboBox.getSelectedItem();
				textField_1.setText(From);
				String To=(String)comboBox_1.getSelectedItem();
				textField_2.setText(To);
				Calendar timer=Calendar.getInstance();
                timer.getTime();
                SimpleDateFormat tTime=new SimpleDateFormat("HH:mm:ss");
                textField_3.setText(tTime.format(timer.getTime()));
                //Date
                SimpleDateFormat tdate= new SimpleDateFormat("dd-MMM-yyyy");
                textField_4.setText(tdate.format(timer.getTime()));
                int num;
                String s="";
                num=1325;
                s=s+num+1325;
                textField_5.setText(s);
                textField_7.setText("Any");
                double t=0;
                String m="";
                if(rb2.isSelected())
                {
                	t=t+500;
                }
                else {
                	t=t+300;
                }
                if(rdbtn.isSelected())
                {
                	t=t+500;
                }
                else {
                	t=t+300;
                }
                m=m+t;
                textField_10.setText(m);
                double[]R=new double[15];
                R[0]=Double.parseDouble(textField_9.getText());
                R[1]=Double.parseDouble(textField_10.getText());
                R[2]=(R[0]+R[1]);
                String total=String.format("%.2f",R[2]);
                textField_11.setText(total);
                String Name=textField_8.getText();
                textField.setText(Name);
                String Price=textField_11.getText();
                textField_6.setText(Price);

                
			}
			
		});
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Reset");
		btnNewButton_1.setBounds(142, 338, 89, 23);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_6.setText("");
				textField_7.setText("");
				textField_8.setText("");
				textField_9.setText("");
				textField_10.setText("");
				textField_11.setText("");
				textField_3.setText("");
				textField_4.setText("");
				textField_5.setText("");
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
			
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Exit");
		btnNewButton_2.setBounds(251, 338, 89, 23);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int confirmed=JOptionPane.showConfirmDialog(null,"Exit confirmation?");
				if(confirmed==JOptionPane.YES_OPTION) {
				System.exit(0);}
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		frame.getContentPane().add(btnNewButton_2);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(0, 0, 4, 22);
		frame.getContentPane().add(textArea);
		
		
	}
}
