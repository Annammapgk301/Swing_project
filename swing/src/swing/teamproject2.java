package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.JTextComponent;
import javax.swing.ListSelectionModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class teamproject2 {

	private JFrame frmStudentDetails;
	private JTable table;
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
	private JTextField textField_12;
	private JTextField textField_13;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					teamproject2 window = new teamproject2();
					window.frmStudentDetails.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public teamproject2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmStudentDetails = new JFrame();
		frmStudentDetails.setTitle("Student Details");
		frmStudentDetails.getContentPane().setBackground(Color.BLUE);
		frmStudentDetails.setBounds(100, 100, 815, 486);
		frmStudentDetails.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmStudentDetails.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(192, 192, 192));
		panel.setBorder(new TitledBorder(null, "Student report", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(355, 0, 434, 288);
		frmStudentDetails.getContentPane().add(panel);
		panel.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 21, 414, 242);
		panel.add(textArea);
		
		JButton btnClear = new JButton("clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("");
			}
		});
		btnClear.setBounds(156, 265, 89, 23);
		panel.add(btnClear);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.GRAY);
		panel_1.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Student details", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1.setBounds(0, 0, 355, 288);
		frmStudentDetails.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblStudentid = new JLabel("Student-ID");
		lblStudentid.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblStudentid.setBounds(26, 31, 68, 14);
		panel_1.add(lblStudentid);
		
		textField = new JTextField();
		textField.setBounds(97, 28, 86, 20);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JLabel lblFirstName = new JLabel("First name");
		lblFirstName.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblFirstName.setBounds(26, 68, 68, 14);
		panel_1.add(lblFirstName);
		
		textField_1 = new JTextField();
		textField_1.setBounds(97, 65, 86, 20);
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblSurname = new JLabel("Surname");
		lblSurname.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblSurname.setBounds(26, 104, 56, 14);
		panel_1.add(lblSurname);
		
		textField_2 = new JTextField();
		textField_2.setBounds(97, 101, 86, 20);
		panel_1.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblTotalScore = new JLabel("Total score");
		lblTotalScore.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblTotalScore.setBounds(26, 183, 68, 14);
		panel_1.add(lblTotalScore);
		
		textField_3 = new JTextField();
		textField_3.setBounds(97, 180, 86, 20);
		panel_1.add(textField_3);
		textField_3.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 170, 173, 2);
		panel_1.add(separator);
		
		JLabel lblAverage = new JLabel("Average");
		lblAverage.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblAverage.setBounds(26, 217, 68, 14);
		panel_1.add(lblAverage);
		
		textField_4 = new JTextField();
		textField_4.setBounds(97, 214, 86, 20);
		panel_1.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblRanking = new JLabel("Ranking");
		lblRanking.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblRanking.setBounds(26, 248, 46, 14);
		panel_1.add(lblRanking);
		
		textField_5 = new JTextField();
		textField_5.setBounds(97, 245, 86, 20);
		panel_1.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblCourseCode = new JLabel("Course code");
		lblCourseCode.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCourseCode.setBounds(26, 145, 86, 14);
		panel_1.add(lblCourseCode);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.BOLD, 11));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"301", "302", "303", "304", "305", "306"}));
		comboBox.setBounds(115, 142, 68, 20);
		panel_1.add(comboBox);
		
		JLabel lblNewLabel = new JLabel("Maths");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(205, 28, 46, 14);
		panel_1.add(lblNewLabel);
		
		textField_6 = new JTextField();
		textField_6.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(java.awt.event.KeyEvent evt) {
                char num=evt.getKeyChar();
                if(!(Character.isDigit(num))
                        ||(num==KeyEvent.VK_BACK_SPACE)
                        ||(num==KeyEvent.VK_DELETE)) {
                    evt.consume();
                }
			}
		});
		textField_6.setBounds(259, 28, 86, 20);
		panel_1.add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("English");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(205, 65, 56, 20);
		panel_1.add(lblNewLabel_1);
		
		textField_7 = new JTextField();
		textField_7.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(java.awt.event.KeyEvent evt) {
                char num=evt.getKeyChar();
                if(!(Character.isDigit(num))
                        ||(num==KeyEvent.VK_BACK_SPACE)
                        ||(num==KeyEvent.VK_DELETE)) {
                    evt.consume();
                }
			}
		});
		textField_7.setBounds(259, 65, 86, 20);
		panel_1.add(textField_7);
		textField_7.setColumns(10);
		
		JLabel lblBiology = new JLabel("Biology");
		lblBiology.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblBiology.setBounds(205, 104, 46, 14);
		panel_1.add(lblBiology);
		
		textField_8 = new JTextField();
		textField_8.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(java.awt.event.KeyEvent evt) {
                char num=evt.getKeyChar();
                if(!(Character.isDigit(num))
                        ||(num==KeyEvent.VK_BACK_SPACE)
                        ||(num==KeyEvent.VK_DELETE)) {
                    evt.consume();
                }
			}
		
		});
		textField_8.setBounds(259, 101, 86, 20);
		panel_1.add(textField_8);
		textField_8.setColumns(10);
		
		JLabel lblComputer = new JLabel("Computer");
		lblComputer.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblComputer.setBounds(206, 142, 46, 14);
		panel_1.add(lblComputer);
		
		textField_9 = new JTextField();
		textField_9.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(java.awt.event.KeyEvent evt) {
                char num=evt.getKeyChar();
                if(!(Character.isDigit(num))
                        ||(num==KeyEvent.VK_BACK_SPACE)
                        ||(num==KeyEvent.VK_DELETE)) {
                    evt.consume();
                }
			}
		});
		textField_9.setBounds(259, 132, 86, 20);
		panel_1.add(textField_9);
		textField_9.setColumns(10);
		
		JLabel lblChemistry = new JLabel("Chemistry");
		lblChemistry.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblChemistry.setBounds(206, 171, 46, 14);
		panel_1.add(lblChemistry);
		
		textField_10 = new JTextField();
		textField_10.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(java.awt.event.KeyEvent evt) {
                char num=evt.getKeyChar();
                if(!(Character.isDigit(num))
                        ||(num==KeyEvent.VK_BACK_SPACE)
                        ||(num==KeyEvent.VK_DELETE)) {
                    evt.consume();
                }
			}
		});
		textField_10.setBounds(259, 168, 86, 20);
		panel_1.add(textField_10);
		textField_10.setColumns(10);
		
		textField_11 = new JTextField();
		textField_11.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(java.awt.event.KeyEvent evt) {
                char num=evt.getKeyChar();
                if(!(Character.isDigit(num))
                        ||(num==KeyEvent.VK_BACK_SPACE)
                        ||(num==KeyEvent.VK_DELETE)) {
                    evt.consume();
                }
			}
		});
		textField_11.setBounds(259, 199, 86, 20);
		panel_1.add(textField_11);
		textField_11.setColumns(10);
		
		JLabel lblTamil = new JLabel("Tamil");
		lblTamil.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblTamil.setBounds(206, 235, 46, 14);
		panel_1.add(lblTamil);
		
		textField_12 = new JTextField();
		textField_12.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(java.awt.event.KeyEvent evt) {
                char num=evt.getKeyChar();
                if(!(Character.isDigit(num))
                        ||(num==KeyEvent.VK_BACK_SPACE)
                        ||(num==KeyEvent.VK_DELETE)) {
                    evt.consume();
                }
			}
		});
		textField_12.setBounds(259, 232, 86, 20);
		panel_1.add(textField_12);
		textField_12.setColumns(10);
		
		JLabel lblMalayalam = new JLabel("Malayalam");
		lblMalayalam.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblMalayalam.setBounds(206, 260, 46, 14);
		panel_1.add(lblMalayalam);
		
		textField_13 = new JTextField();
		textField_13.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(java.awt.event.KeyEvent evt) {
                char num=evt.getKeyChar();
                if(!(Character.isDigit(num))
                        ||(num==KeyEvent.VK_BACK_SPACE)
                        ||(num==KeyEvent.VK_DELETE)) {
                    evt.consume();
                }
			}
		});
		textField_13.setBounds(259, 257, 86, 20);
		panel_1.add(textField_13);
		textField_13.setColumns(10);
		
		JLabel lblPhysics = new JLabel("Physics");
		lblPhysics.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblPhysics.setBounds(205, 202, 46, 14);
		panel_1.add(lblPhysics);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.LIGHT_GRAY);
		panel_2.setBounds(10, 306, 779, 89);
		frmStudentDetails.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		table = new JTable();
		table.setForeground(new Color(0, 0, 0));
		table.setBackground(Color.LIGHT_GRAY);
		table.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Student_ID", "Course_Nmae", "Maths", "English", "Biology","Computer","Chemistry","Physics","Tamil","Malayalam","Total Score","Average","Ranking"},
			},
			new String[] {
				"Student_ID", "Course_Name", "Maths", "English", "Biology", "Computer", "Chemistry", "Physics", "Tamil", "Malayalam", "Total Score", "Average", "Ranking"
			}
		));
		table.setCellSelectionEnabled(true);
		table.setColumnSelectionAllowed(true);
		table.setBounds(0, 0, 779, 89);
		panel_2.add(table);
		
		JButton btnNewButton = new JButton(" Add report");
		btnNewButton.setForeground(new Color(34, 139, 34));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double[] R=new double[15];
                R[0]=Double.parseDouble(textField_6.getText());//maths
                R[1]=Double.parseDouble(textField_7.getText());//english
                R[2]=Double.parseDouble(textField_8.getText());//biology
                R[3]=Double.parseDouble(textField_9.getText());//Computer
                R[4]=Double.parseDouble(textField_10.getText());//Chemistry
                R[5]=Double.parseDouble(textField_11.getText());//physics
                R[6]=Double.parseDouble(textField_12.getText());//tamil
                R[7]=Double.parseDouble(textField_13.getText());//malayalam
                R[8]=(R[0]+R[1]+R[2]+R[3]+R[4]+R[5]+R[6]+R[7])/8;
                R[9]=(R[0]+R[1]+R[2]+R[3]+R[4]+R[5]+R[6]+R[7]);
                String avg=String.format("%.2f",R[8]);
                textField_4.setText(avg);
                String total=String.format("%.2f",R[9]);
                textField_3.setText(total);
                if(R[9]>=700)
                {
                	textField_5.setText("1");
                }
                else if(R[9]>=600)
                {
                	textField_5.setText("2");
                }
                else if(R[9]>=500)
                {
                	textField_5.setText("3");
                }
                else if(R[9]>=400)
                {
                	textField_5.setText("4");
                }
                else
                {
                	textField_5.setText("5");
                }
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new String[]
						{
							textField.getText(),
							(String) comboBox.getSelectedItem(),
							textField_6.getText(),
							textField_7.getText(),
							textField_8.getText(),
							textField_9.getText(),
							textField_10.getText(),
							textField_11.getText(),
							textField_12.getText(),
							textField_13.getText(),
							textField_3.getText(),
							textField_4.getText(),
							textField_5.getText(),
							
			
		});
			}
		});
		btnNewButton.setBounds(26, 414, 97, 23);
		frmStudentDetails.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Delete");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				DefaultTableModel model=(DefaultTableModel)table.getModel();
				int i=table.getSelectedRow();
				if(i>=0)
				{
					model.removeRow(i);
					
				}
			}
		});
		btnNewButton_1.setForeground(new Color(255, 0, 0));
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1.setBounds(162, 414, 89, 23);
		frmStudentDetails.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Show report");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

						textArea.append("Student Report\n"+
								"Student Name:\t\t"+textField_1.getText()+textField_2.getText()+"\n========================================================\t\t"+"\nMaths:\t\t"+textField_6.getText()+"\nEnglish:\t\t"+textField_7.getText()+"\nBiology:\t\t"+textField_8.getText()+"\nComputer:\t\t"+textField_9.getText()+"\nChemistry:\t\t"+textField_10.getText()+"\nPhysics:\t\t"+textField_11.getText()+"\nTamil:\t\t"+textField_12.getText()+"\nMalayalam:\t\t"+textField_13.getText()+"\n===============================================================\t\t"+"\nTotal:\t\t"+textField_3.getText()+"\nAverage:\t\t"+textField_4.getText()+"\nRanking:\t\t"+textField_5.getText());
			}
		}); 
		btnNewButton_2.setForeground(new Color(0, 0, 255));
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_2.setBounds(303, 414, 107, 23);
		frmStudentDetails.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Exit");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int confirmed=JOptionPane.showConfirmDialog(null,"Exit confirmation?");
				if(confirmed==JOptionPane.YES_OPTION) {
				System.exit(0);}
			}
		});
		btnNewButton_3.setForeground(new Color(255, 0, 0));
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_3.setBounds(462, 414, 89, 23);
		frmStudentDetails.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Reset");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_6.setText("");
				textField_7.setText("");
				textField_8.setText("");
				textField_9.setText("");
				textField_10.setText("");
				textField_11.setText("");
				textField_12.setText("");
				textField_13.setText("");
				textField_3.setText("");
				textField_4.setText("");
				textField_5.setText("");
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
			
		}
		});
		btnNewButton_4.setForeground(new Color(199, 21, 133));
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_4.setBounds(620, 414, 89, 23);
		frmStudentDetails.getContentPane().add(btnNewButton_4);
	}
		}
