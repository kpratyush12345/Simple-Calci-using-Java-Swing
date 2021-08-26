
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;


import javax.swing.SwingConstants;


import java.awt.Color;


public class Calci {

	private JFrame frame;
	private JTextField textField;
	
	double firstnum;
	double secondnum;
	double result;
	String operations;
	String answer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calci window = new Calci();
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
	public Calci() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(51, 153, 204));
		frame.setBounds(100, 100, 354, 513);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBackground(new Color(204, 255, 255));
		textField.setFont(new Font("Monoscope", Font.PLAIN, 25));
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBounds(23, 11, 290, 57);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnBack = new JButton("\u2190");
		btnBack.setBackground(new Color(255, 51, 51));
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backspace = null;
				if(textField.getText().length() > 0) {
					StringBuilder strB = new StringBuilder(textField.getText());
					strB.deleteCharAt(textField.getText().length() - 1);
					backspace = strB.toString();
					textField.setText(backspace);
				}
			}
		});
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnBack.setBounds(23, 79, 65, 65);
		frame.getContentPane().add(btnBack);
		
		JButton btnClear = new JButton("C");
		btnClear.setBackground(new Color(255, 51, 51));
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnClear.setFont(new Font("Monoscope", Font.PLAIN, 25));
		btnClear.setBounds(98, 79, 65, 65);
		frame.getContentPane().add(btnClear);
		
		JButton btnMod = new JButton("%");
		btnMod.setBackground(new Color(204, 204, 204));
		btnMod.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "%";
			}
		});
		btnMod.setFont(new Font("Monoscope", Font.PLAIN, 25));
		btnMod.setBounds(173, 79, 65, 65);
		frame.getContentPane().add(btnMod);
		
		JButton btnAdd = new JButton("+");
		btnAdd.setBackground(new Color(204, 204, 204));
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "+";
			}
		});
		btnAdd.setFont(new Font("Monoscope", Font.PLAIN, 25));
		btnAdd.setBounds(248, 79, 65, 65);
		frame.getContentPane().add(btnAdd);
		
		JButton btn7 = new JButton("7");
		btn7.setBackground(new Color(153, 204, 255));
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn7.getText();
				textField.setText(EnterNumber);
			}
		});
		btn7.setFont(new Font("Monoscope", Font.PLAIN, 25));
		btn7.setBounds(23, 158, 65, 65);
		frame.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.setBackground(new Color(153, 204, 255));
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn8.getText();
				textField.setText(EnterNumber);
			}
		});
		btn8.setFont(new Font("Monoscope", Font.PLAIN, 25));
		btn8.setBounds(98, 158, 65, 65);
		frame.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.setBackground(new Color(153, 204, 255));
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn9.getText();
				textField.setText(EnterNumber);
			}
		});
		btn9.setFont(new Font("Monoscope", Font.PLAIN, 25));
		btn9.setBounds(173, 158, 65, 65);
		frame.getContentPane().add(btn9);
		
		JButton btnSub = new JButton("-");
		btnSub.setBackground(new Color(204, 204, 204));
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "-";
			}
		});
		btnSub.setFont(new Font("Monoscope", Font.PLAIN, 25));
		btnSub.setBounds(248, 158, 65, 65);
		frame.getContentPane().add(btnSub);
		
		JButton btn4 = new JButton("4");
		btn4.setBackground(new Color(153, 204, 255));
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn4.getText();
				textField.setText(EnterNumber);
			}
		});
		btn4.setFont(new Font("Monoscope", Font.PLAIN, 25));
		btn4.setBounds(23, 237, 65, 65);
		frame.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.setBackground(new Color(153, 204, 255));
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn5.getText();
				textField.setText(EnterNumber);
			}
		});
		btn5.setFont(new Font("Monoscope", Font.PLAIN, 25));
		btn5.setBounds(98, 237, 65, 65);
		frame.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.setBackground(new Color(153, 204, 255));
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn6.getText();
				textField.setText(EnterNumber);
			}
		});
		btn6.setFont(new Font("Monoscope", Font.PLAIN, 25));
		btn6.setBounds(173, 237, 65, 65);
		frame.getContentPane().add(btn6);
		
		JButton btnMult = new JButton("*");
		btnMult.setBackground(new Color(204, 204, 204));
		btnMult.setFont(new Font("Monoscope", Font.PLAIN, 25));
		btnMult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "*";
			}
			
		});
		btnMult.setBounds(248, 237, 65, 65);
		frame.getContentPane().add(btnMult);
		
		JButton btn1 = new JButton("1");
		btn1.setBackground(new Color(153, 204, 255));
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn1.getText();
				textField.setText(EnterNumber);
			}
		});
		btn1.setFont(new Font("Monoscope", Font.PLAIN, 25));
		btn1.setBounds(23, 316, 65, 65);
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.setBackground(new Color(153, 204, 255));
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn2.getText();
				textField.setText(EnterNumber);
			}
		});
		btn2.setFont(new Font("Monoscope", Font.PLAIN, 25));
		btn2.setBounds(98, 316, 65, 65);
		frame.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.setBackground(new Color(153, 204, 255));
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn3.getText();
				textField.setText(EnterNumber);
			}
		});
		btn3.setFont(new Font("Monoscope", Font.PLAIN, 25));
		btn3.setBounds(173, 316, 65, 65);
		frame.getContentPane().add(btn3);
		
		JButton btnDiv = new JButton("/");
		btnDiv.setBackground(new Color(204, 204, 204));
		btnDiv.setFont(new Font("Monoscope", Font.PLAIN, 25));
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "/";
			}
		});
		btnDiv.setBounds(248, 316, 65, 65);
		frame.getContentPane().add(btnDiv);
		
		JButton btn0 = new JButton("0");
		btn0.setBackground(new Color(153, 204, 255));
		btn0.setFont(new Font("Monoscope", Font.PLAIN, 25));
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn0.getText();
				textField.setText(EnterNumber);
			}
		});
		btn0.setBounds(23, 395, 65, 65);
		frame.getContentPane().add(btn0);
		
		JButton btnDot = new JButton(".");
		btnDot.setBackground(new Color(204, 204, 204));
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!textField.getText().contains(".")) {
					textField.setText(textField.getText() + btnDot.getText());
				}
			}
		});
		btnDot.setFont(new Font("Monoscope", Font.PLAIN, 25));
		btnDot.setBounds(98, 395, 65, 65);
		frame.getContentPane().add(btnDot);
		
		JButton btnAbs = new JButton("+/-");
		btnAbs.setBackground(new Color(204, 204, 204));
		btnAbs.setFont(new Font("Monoscope", Font.PLAIN, 20));
		btnAbs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(String.valueOf(textField.getText()));
				ops *= -1;
				textField.setText(String.valueOf(ops));
			}
		});
		btnAbs.setBounds(173, 395, 65, 65);
		frame.getContentPane().add(btnAbs);
		
		JButton btnEquals = new JButton("=");
		btnEquals.setBackground(new Color(102, 255, 102));
		btnEquals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String answer;
				secondnum = Double.parseDouble(textField.getText());
				if(operations == "+") {
					result = firstnum + secondnum;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operations == "-") {
					result = firstnum - secondnum;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operations == "*") {
					result = firstnum * secondnum;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operations == "/") {
					result = firstnum / secondnum;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operations == "%") {
					result = firstnum % secondnum;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
			}
		});
		btnEquals.setFont(new Font("Monoscope", Font.PLAIN, 25));
		btnEquals.setBounds(248, 395, 65, 65);
		frame.getContentPane().add(btnEquals);
	}
}
