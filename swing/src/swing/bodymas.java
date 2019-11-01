package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.Font;
import javax.swing.JToolBar;
import javax.swing.JDesktopPane;
import javax.swing.JLayeredPane;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.BoxLayout;
import javax.swing.JList;
import javax.swing.JTable;

public class bodymas {

private JFrame frame;
private JTextField textField;
private JTextField textField_1;
Double num1;
Double num2;
Double res;

/**
* Launch the application.
*/
public static void main(String[] args) {
EventQueue.invokeLater(new Runnable() {
public void run() {
try {
bodymas window = new bodymas();
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
public bodymas() {
initialize();
}

/**
* Initialize the contents of the frame.
*/
private void initialize() {
frame = new JFrame();
frame.setBounds(100, 100, 450, 587);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.getContentPane().setLayout(null);

JPanel panel = new JPanel();
panel.setBackground(new Color(0, 255, 0));
panel.setBounds(12, 25, 408, 104);
frame.getContentPane().add(panel);
panel.setLayout(null);

JLabel lblBodyMassIndex = new JLabel("Body Mass Index");
lblBodyMassIndex.setBounds(42, 0, 330, 93);
lblBodyMassIndex.setForeground(new Color(0, 128, 0));
lblBodyMassIndex.setFont(new Font("Tahoma", Font.BOLD, 30));
panel.add(lblBodyMassIndex);

JPanel panel_1 = new JPanel();
panel_1.setBackground(new Color(0, 255, 0));
panel_1.setBounds(12, 156, 408, 234);
frame.getContentPane().add(panel_1);
panel_1.setLayout(null);

JLabel lblHeight = new JLabel("Height(m)    :");
lblHeight.setFont(new Font("Tahoma", Font.BOLD, 13));
lblHeight.setBounds(26, 41, 104, 16);
panel_1.add(lblHeight);

JLabel lblWeightkg = new JLabel("Weight(kg)  :");
lblWeightkg.setFont(new Font("Tahoma", Font.BOLD, 13));
lblWeightkg.setBounds(26, 97, 104, 16);
panel_1.add(lblWeightkg);

textField = new JTextField();
textField.setBounds(130, 41, 116, 22);
panel_1.add(textField);
textField.setColumns(10);

textField_1 = new JTextField();
textField_1.setColumns(10);
textField_1.setBounds(130, 94, 116, 22);
panel_1.add(textField_1);

JLabel lblNewLabel = new JLabel("BMI");
lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
lblNewLabel.setBounds(34, 161, 56, 16);
panel_1.add(lblNewLabel);

JLabel label1 = new JLabel("ans");
label1.setForeground(new Color(0, 0, 0));
label1.setBackground(new Color(255, 204, 0));
label1.setBounds(113, 162, 56, 16);
panel_1.add(label1);

JLabel label2 = new JLabel("ov");
label2.setBounds(190, 162, 104, 16);
panel_1.add(label2);


JButton btnNewButton = new JButton("Calculate");
btnNewButton.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
num1=Double.parseDouble(textField.getText());
num2=Double.parseDouble(textField_1.getText());
res=((num1/num2/num2)*10000);
String ans=String.format("%.2f", res);
label1.setText(ans);
if(res<18.5)
{
label2.setText("Under Weight");
}
else if(res>18.5 && res<24.9)
{
label2.setText("Normal Weight");
}
else if(res>25 && res<29.9)
{
label2.setText("Over Weight");
}
else
label2.setText("Obese");





}
});
btnNewButton.setBounds(67, 196, 97, 25);
panel_1.add(btnNewButton);

JButton btnNewButton_1 = new JButton("Clear");
btnNewButton_1.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
textField.setText(null);
textField_1.setText(null);
label1.setText(null);
label2.setText(null);

}
});
btnNewButton_1.setBounds(199, 196, 63, 25);
panel_1.add(btnNewButton_1);

JButton btnNewButton_2 = new JButton("Exit");
btnNewButton_2.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
	System.exit(0);
}
});
btnNewButton_2.setBounds(301, 196, 73, 25);
panel_1.add(btnNewButton_2);





JPanel panel_2 = new JPanel();
panel_2.setBackground(new Color(0, 255, 0));
panel_2.setBounds(12, 413, 408, 116);
frame.getContentPane().add(panel_2);
panel_2.setLayout(null);

JList list = new JList();
list.setBounds(29, 39, 1, 1);
panel_2.add(list);

}
}
