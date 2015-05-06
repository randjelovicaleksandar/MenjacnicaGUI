package menjacnica.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JSlider;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

public class IzvrsiZamenuGUI extends JFrame {

	private JPanel contentPane;
	private JLabel lblKupovniKurs;
	private JLabel lblValuta;
	private JLabel lblProdajniKurs;
	private JTextField textField;
	private JTextField textField_1;
	private JComboBox comboBox;
	private JLabel lblIznos;
	private JLabel lblVrstaTransakcije;
	private JTextField textField_2;
	private JRadioButton rdbtnNewRadioButton;
	private JRadioButton rdbtnNewRadioButton_1;
	private JSlider slider;
	private JButton btnIzvrsiZamenu;
	private JButton btnOdustani;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private MenjacnicaGUI gui;



	/**
	 * Create the frame.
	 */
	public IzvrsiZamenuGUI(MenjacnicaGUI gui) {
		setResizable(false);
		setTitle("Izvrsi izmenu");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 253);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[grow][][grow][][grow][]", "[][][][][][][]"));
		contentPane.add(getLblKupovniKurs(), "cell 0 0");
		contentPane.add(getLblValuta(), "cell 2 0");
		contentPane.add(getLblProdajniKurs(), "cell 4 0");
		contentPane.add(getTextField(), "cell 0 1,growx");
		contentPane.add(getComboBox(), "cell 2 1,growx");
		contentPane.add(getTextField_1(), "cell 4 1,growx");
		contentPane.add(getLblIznos(), "cell 0 2");
		contentPane.add(getLblVrstaTransakcije(), "cell 3 2 2 1");
		contentPane.add(getTextField_2(), "cell 0 3 3 1,growx");
		contentPane.add(getRdbtnNewRadioButton(), "cell 3 3 2 1");
		contentPane.add(getRdbtnNewRadioButton_1(), "cell 3 4 2 1");
		contentPane.add(getSlider(), "cell 0 5 6 1,grow");
		contentPane.add(getBtnIzvrsiZamenu(), "cell 0 6 2 1,grow");
		contentPane.add(getBtnOdustani(), "cell 4 6 2 1,grow");
		this.gui = gui;
	}

	private JLabel getLblKupovniKurs() {
		if (lblKupovniKurs == null) {
			lblKupovniKurs = new JLabel("Kupovni kurs");
		}
		return lblKupovniKurs;
	}
	private JLabel getLblValuta() {
		if (lblValuta == null) {
			lblValuta = new JLabel("Valuta");
		}
		return lblValuta;
	}
	private JLabel getLblProdajniKurs() {
		if (lblProdajniKurs == null) {
			lblProdajniKurs = new JLabel("Prodajni kurs");
		}
		return lblProdajniKurs;
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
	private JComboBox getComboBox() {
		if (comboBox == null) {
			comboBox = new JComboBox();
			comboBox.setModel(new DefaultComboBoxModel(new String[] {"EUR", "USD", "CHF"}));
		}
		return comboBox;
	}
	private JLabel getLblIznos() {
		if (lblIznos == null) {
			lblIznos = new JLabel("Iznos");
		}
		return lblIznos;
	}
	private JLabel getLblVrstaTransakcije() {
		if (lblVrstaTransakcije == null) {
			lblVrstaTransakcije = new JLabel("Vrsta transakcije");
		}
		return lblVrstaTransakcije;
	}
	private JTextField getTextField_2() {
		if (textField_2 == null) {
			textField_2 = new JTextField();
			textField_2.setColumns(10);
		}
		return textField_2;
	}
	private JRadioButton getRdbtnNewRadioButton() {
		if (rdbtnNewRadioButton == null) {
			rdbtnNewRadioButton = new JRadioButton("Kupovina");
			buttonGroup.add(rdbtnNewRadioButton);
		}
		return rdbtnNewRadioButton;
	}
	private JRadioButton getRdbtnNewRadioButton_1() {
		if (rdbtnNewRadioButton_1 == null) {
			rdbtnNewRadioButton_1 = new JRadioButton("Prodaja");
			buttonGroup.add(rdbtnNewRadioButton_1);
		}
		return rdbtnNewRadioButton_1;
	}
	private JSlider getSlider() {
		if (slider == null) {
			slider = new JSlider();
			slider.addChangeListener(new ChangeListener() {
				public void stateChanged(ChangeEvent arg0) {
					textField_2.setText(""+ slider.getValue());
				}
			});
			slider.setPaintLabels(true);
			slider.setMajorTickSpacing(10);
			slider.setPaintTicks(true);
			slider.setMinorTickSpacing(10);
		}
		return slider;
	}
	private JButton getBtnIzvrsiZamenu() {
		if (btnIzvrsiZamenu == null) {
			btnIzvrsiZamenu = new JButton("Izvrsi zamenu");
			btnIzvrsiZamenu.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					String string;
					if (rdbtnNewRadioButton.isSelected())
						string = lblValuta.getText() + ": " + comboBox.getSelectedItem().toString() + " " + lblIznos.getText() + ": "
								+ textField_2 + " " + lblVrstaTransakcije.getText() + ": " + rdbtnNewRadioButton.getText();
					else
						string = lblValuta.getText() + " " + comboBox.getSelectedItem().toString() + " " + lblIznos.getText() + ": "
								+ textField_2.getText() + " " + lblVrstaTransakcije.getText() + ": " + rdbtnNewRadioButton_1.getText();
					gui.postaviTekst(string);
					dispose();
				}
			});
		}
		return btnIzvrsiZamenu;
	}
	private JButton getBtnOdustani() {
		if (btnOdustani == null) {
			btnOdustani = new JButton("Odustani");
			btnOdustani.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					dispose();
				}
			});
		}
		return btnOdustani;
	}
}
