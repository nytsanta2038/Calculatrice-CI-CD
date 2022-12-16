package com.etglp59.calculatrice;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;

public class Calculatrice {

	private JFrame frame;
	private JTextField ecran;
	private Double nombre;
	private String operations;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculatrice window = new Calculatrice();
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
	public Calculatrice() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setFont(new Font("Tahoma", Font.BOLD, 17));
		frame.setTitle("Calculatrice");
		frame.setBounds(100, 100, 616, 325);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		final JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String affichage = ecran.getText() + btn7.getText();
				ecran.setText(affichage);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn7.setBounds(23, 91, 89, 23);
		frame.getContentPane().add(btn7);
		
		final JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String affichage = ecran.getText() + btn4.getText();
				ecran.setText(affichage);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn4.setBounds(23, 132, 89, 23);
		frame.getContentPane().add(btn4);
		
		final JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String affichage = ecran.getText() + btn1.getText();
				ecran.setText(affichage);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn1.setBounds(23, 178, 89, 23);
		frame.getContentPane().add(btn1);
		
		final JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String affichage = ecran.getText() + btn8.getText();
				ecran.setText(affichage);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn8.setBounds(169, 91, 89, 23);
		frame.getContentPane().add(btn8);
		
		final JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String affichage = ecran.getText() + btn5.getText();
				ecran.setText(affichage);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn5.setBounds(169, 132, 89, 23);
		frame.getContentPane().add(btn5);
		
		final JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String affichage = ecran.getText() + btn2.getText();
				ecran.setText(affichage);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn2.setBounds(169, 178, 89, 23);
		frame.getContentPane().add(btn2);
		
		final JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String affichage = ecran.getText() + btn9.getText();
				ecran.setText(affichage);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn9.setBounds(311, 91, 89, 23);
		frame.getContentPane().add(btn9);
		
		final JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String affichage = ecran.getText() + btn6.getText();
				ecran.setText(affichage);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn6.setBounds(311, 132, 89, 23);
		frame.getContentPane().add(btn6);
		
		final JButton btn3 = new JButton("3");
		btn3.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String affichage = ecran.getText() + btn3.getText();
				ecran.setText(affichage);
			}
		});
		btn3.setBounds(311, 178, 89, 23);
		frame.getContentPane().add(btn3);
		
		JButton signe = new JButton("+/-");
		signe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(ecran.getText().length() > 0) {
					nombre = Double.parseDouble(ecran.getText());
					nombre = nombre * (-1);
					ecran.setText(String.valueOf(nombre));
				}
			}
		});
		signe.setFont(new Font("Tahoma", Font.BOLD, 14));
		signe.setBounds(23, 237, 89, 23);
		frame.getContentPane().add(signe);
		
		final JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String affichage = ecran.getText() + btn0.getText();
				ecran.setText(affichage);
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn0.setBounds(169, 237, 89, 23);
		frame.getContentPane().add(btn0);
		
		JButton clear = new JButton("C");
		clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(ecran.getText().length() > 0) {
					StringBuilder efface = new StringBuilder(ecran.getText());
					efface.deleteCharAt(ecran.getText().length() - 1);
					ecran.setText(efface.toString());
				}
			}
		});
		clear.setFont(new Font("Tahoma", Font.BOLD, 14));
		clear.setBounds(311, 237, 89, 23);
		frame.getContentPane().add(clear);
		
		final JButton division = new JButton("/");
		division.setFont(new Font("Tahoma", Font.BOLD, 14));
		division.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nombre = Double.parseDouble(ecran.getText());
				ecran.setText("");
				operations = division.getText();
			}
		});
		division.setBounds(457, 91, 50, 23);
		frame.getContentPane().add(division);
		
		final JButton addition = new JButton("+");
		addition.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 nombre = Double.parseDouble(ecran.getText());
				 ecran.setText("");
				 operations = addition.getText();
			}
		});
		addition.setFont(new Font("Tahoma", Font.BOLD, 14));
		addition.setBounds(457, 132, 50, 23);
		frame.getContentPane().add(addition);
		
		final JButton soustraction = new JButton("-");
		soustraction.setFont(new Font("Tahoma", Font.BOLD, 14));
		soustraction.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nombre = Double.parseDouble(ecran.getText());
				ecran.setText("");
				operations = soustraction.getText();
			}
		});
		soustraction.setBounds(457, 178, 50, 23);
		frame.getContentPane().add(soustraction);
		
		// Ajout de final 
		final JButton multi = new JButton("X");
		multi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nombre = Double.parseDouble(ecran.getText());
				ecran.setText("");
				operations = multi.getText();
			}
		});
		multi.setFont(new Font("Tahoma", Font.BOLD, 14));
		multi.setBounds(529, 91, 50, 23);
		frame.getContentPane().add(multi);
		
		JButton vide = new JButton("AC");
		vide.setFont(new Font("Tahoma", Font.BOLD, 12));
		vide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ecran.setText("");
			}
		});
		vide.setBounds(529, 132, 50, 23);
		frame.getContentPane().add(vide);
		
		JButton pourcentage = new JButton("%");
		pourcentage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nombre = Double.parseDouble(ecran.getText());
				nombre = nombre * 0.01;
				ecran.setText(String.valueOf(nombre));
			}
		});
		pourcentage.setFont(new Font("Tahoma", Font.BOLD, 12));
		pourcentage.setBounds(529, 178, 50, 23);
		frame.getContentPane().add(pourcentage);
		
		JButton egale = new JButton("=");
		egale.setFont(new Font("Tahoma", Font.BOLD, 14));
		egale.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String format;
				double secondNum = Double.parseDouble(ecran.getText());
				double result;
				if(operations == "+") {
					result = nombre + secondNum;
					format = String.valueOf(result);
					ecran.setText(format);
				} else if(operations == "-") {
					result = nombre - secondNum;
					format = String.valueOf(result);
					ecran.setText(format);
				} else if(operations == "/") {
					result = nombre / secondNum;
					format = String.valueOf(result);
					ecran.setText(format);
				} else if(operations == "X") {
					result = nombre * secondNum;
					format = String.valueOf(result);
					ecran.setText(format);
				}
			}
		});
		egale.setBounds(529, 212, 50, 48);
		frame.getContentPane().add(egale);
		
		JButton point = new JButton(".");
		point.setFont(new Font("Tahoma", Font.BOLD, 14));
		point.setBounds(457, 237, 50, 23);
		frame.getContentPane().add(point);
		
		ecran = new JTextField();
		ecran.setFont(new Font("Tahoma", Font.BOLD, 15));
		ecran.setEditable(false);
		ecran.setBounds(23, 11, 554, 69);
		frame.getContentPane().add(ecran);
		ecran.setColumns(10);
	}
}
