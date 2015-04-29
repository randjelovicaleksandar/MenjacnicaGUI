package menjacnica.gui;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Frame;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.SwingUtilities;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DodajKursGUI extends JFrame {

	private JPanel contentPane;
	private JLabel lblIme;
	private JLabel lblNewLabel;
	private JTextField textField;
	private JTextField textField_1;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JTextField textField_2;
	private JTextField textField_3;
	private JLabel lblSrednjiKurs;
	private JLabel lblSkraceniNaziv;
	private JTextField textField_4;
	private JTextField textField_5;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private MenjacnicaGUI gui;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DodajKursGUI frame = new DodajKursGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public DodajKursGUI() {
		setTitle("Dodaj kurs");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 2, 20, 10));
		contentPane.add(getLabel_1());
		contentPane.add(getLabel_2());
		contentPane.add(getTextField());
		contentPane.add(getTextField_1());
		contentPane.add(getLabel_3());
		contentPane.add(getLabel_4());
		contentPane.add(getTextField_2());
		contentPane.add(getTextField_3());
		contentPane.add(getLabel_5());
		contentPane.add(getLabel_6());
		contentPane.add(getTextField_4());
		contentPane.add(getTextField_5());
		contentPane.add(getBtnNewButton());
		contentPane.add(getBtnNewButton_1());
	}
	private JLabel getLabel_1() {
		if (lblIme == null) {
			lblIme = new JLabel("Sifra");
		}
		return lblIme;
	}
	private JLabel getLabel_2() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Naziv");
		}
		return lblNewLabel;
	}
	private JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setColumns(10);
		}
		return textField;
	}
	private JTextField getTextField_1() {
		if (textField_1 == null) {
			textField_1 = new JTextField();
			textField_1.setColumns(10);
		}
		return textField_1;
	}
	private JLabel getLabel_3() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("Prodajni kurs");
		}
		return lblNewLabel_1;
	}
	private JLabel getLabel_4() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("Kupovni kurs");
		}
		return lblNewLabel_2;
	}
	private JTextField getTextField_2() {
		if (textField_2 == null) {
			textField_2 = new JTextField();
			textField_2.setColumns(10);
		}
		return textField_2;
	}
	private JTextField getTextField_3() {
		if (textField_3 == null) {
			textField_3 = new JTextField();
			textField_3.setColumns(10);
		}
		return textField_3;
	}
	private JLabel getLabel_5() {
		if (lblSrednjiKurs == null) {
			lblSrednjiKurs = new JLabel("Srednji kurs");
		}
		return lblSrednjiKurs;
	}
	private JLabel getLabel_6() {
		if (lblSkraceniNaziv == null) {
			lblSkraceniNaziv = new JLabel("Skraceni naziv");
		}
		return lblSkraceniNaziv;
	}
	private JTextField getTextField_4() {
		if (textField_4 == null) {
			textField_4 = new JTextField();
			textField_4.setColumns(10);
		}
		return textField_4;
	}
	private JTextField getTextField_5() {
		if (textField_5 == null) {
			textField_5 = new JTextField();
			textField_5.setColumns(10);
		}
		return textField_5;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("Dodaj");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					String string = textField.getText() + " " +textField_1.getText() + " " +textField_2.getText() + 
							" " +textField_3.getText() + " " +textField_4.getText() + " " +textField_5.getText();
					gui.postaviTekst(string);
				}
			});
		}
		return btnNewButton;
	}
	private JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("Odustani");
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					dispose();
				}
			});
		}
		return btnNewButton_1;
	}
	
}
