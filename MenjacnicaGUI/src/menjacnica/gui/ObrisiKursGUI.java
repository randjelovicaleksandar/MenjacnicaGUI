package menjacnica.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JCheckBox;
import javax.swing.SwingConstants;

import net.miginfocom.swing.MigLayout;

public class ObrisiKursGUI extends JFrame {

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
	private JCheckBox chckbxNewCheckBox;
	private MenjacnicaGUI gui;



	/**
	 * Create the frame.
	 */
	public ObrisiKursGUI(MenjacnicaGUI gui) {
		setTitle("Obrisi kurs");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 267);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[207px][207px]", "[23px][23px][23px][23px][23px][23px][23px][23px]"));
		contentPane.add(getLabel_1(), "cell 0 0,grow");
		contentPane.add(getLabel_2(), "cell 1 0,grow");
		contentPane.add(getTextField(), "cell 0 1,grow");
		contentPane.add(getTextField_1(), "cell 1 1,grow");
		contentPane.add(getLabel_3(), "cell 0 2,grow");
		contentPane.add(getLabel_4(), "cell 1 2,grow");
		contentPane.add(getTextField_2(), "cell 0 3,grow");
		contentPane.add(getTextField_3(), "cell 1 3,grow");
		contentPane.add(getLabel_5(), "cell 0 4,grow");
		contentPane.add(getLabel_6(), "cell 1 4,grow");
		contentPane.add(getTextField_4(), "cell 0 5,grow");
		contentPane.add(getTextField_5(), "cell 1 5,grow");
		contentPane.add(getChckbxNewCheckBox(), "cell 0 6,grow");
		contentPane.add(getBtnNewButton(), "cell 0 7,grow");
		contentPane.add(getBtnNewButton_1(), "cell 1 7,grow");
		this.gui = gui;
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
			textField.setEditable(false);
			textField.setColumns(10);
		}
		return textField;
	}
	private JTextField getTextField_1() {
		if (textField_1 == null) {
			textField_1 = new JTextField();
			textField_1.setEditable(false);
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
			textField_2.setEditable(false);
			textField_2.setColumns(10);
		}
		return textField_2;
	}
	private JTextField getTextField_3() {
		if (textField_3 == null) {
			textField_3 = new JTextField();
			textField_3.setEditable(false);
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
			textField_4.setEditable(false);
			textField_4.setColumns(10);
		}
		return textField_4;
	}
	private JTextField getTextField_5() {
		if (textField_5 == null) {
			textField_5 = new JTextField();
			textField_5.setEditable(false);
			textField_5.setColumns(10);
		}
		return textField_5;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("Obrisi");
			btnNewButton.setEnabled(false);
		}
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String string = "Sifra: " + textField.getText() + " Naziv: " +textField_1.getText() 
						+ " Prodajni kurs: " +textField_2.getText() + " Kupovni kurs: " +textField_3.getText()
						+ " Srednji kurs: " +textField_4.getText() + " Skraceni naziv: " +textField_5.getText();
				gui.postaviTekst(string);
			}
		});
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
	
	private JCheckBox getChckbxNewCheckBox() {
		if (chckbxNewCheckBox == null) {
			chckbxNewCheckBox = new JCheckBox("Zaista obrisi kurs");
			chckbxNewCheckBox.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					if (!btnNewButton.isEnabled())
						btnNewButton.setEnabled(true);
					else
						btnNewButton.setEnabled(false);
				}
			});
			chckbxNewCheckBox.setHorizontalAlignment(SwingConstants.LEFT);
		}
		return chckbxNewCheckBox;
	}
}
