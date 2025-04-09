package caso1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class V1 extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblSegundoNmero;
	private JLabel lblTercerNmero;
	private JTextField txtN1;
	private JTextField txtN2;
	private JTextField txtN3;
	private JButton btnNewButton;
	private JButton btnSumarEnteros;
	private JButton btnSumarReales;
	private JScrollPane scrollPane;
	private JTextArea txtS;
	private JButton btnNewButton_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					V1 frame = new V1();
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
	public V1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		{
			lblNewLabel = new JLabel("Primer número:");
			lblNewLabel.setBounds(10, 11, 96, 14);
			contentPane.add(lblNewLabel);
		}
		{
			lblSegundoNmero = new JLabel("Segundo número:");
			lblSegundoNmero.setBounds(10, 25, 96, 14);
			contentPane.add(lblSegundoNmero);
		}
		{
			lblTercerNmero = new JLabel("Tercer número:");
			lblTercerNmero.setBounds(10, 50, 96, 14);
			contentPane.add(lblTercerNmero);
		}
		{
			txtN1 = new JTextField();
			txtN1.setBounds(155, 0, 86, 20);
			contentPane.add(txtN1);
			txtN1.setColumns(10);
		}
		{
			txtN2 = new JTextField();
			txtN2.setBounds(155, 25, 86, 20);
			contentPane.add(txtN2);
			txtN2.setColumns(10);
		}
		{
			txtN3 = new JTextField();
			txtN3.setBounds(155, 47, 86, 20);
			contentPane.add(txtN3);
			txtN3.setColumns(10);
		}
		{
			btnNewButton = new JButton("Sumar dos enteros");
			btnNewButton.addActionListener(this);
			btnNewButton.setBounds(290, 7, 134, 23);
			contentPane.add(btnNewButton);
		}
		{
			btnSumarEnteros = new JButton("Sumar tres enteros");
			btnSumarEnteros.addActionListener(this);
			btnSumarEnteros.setBounds(290, 41, 134, 23);
			contentPane.add(btnSumarEnteros);
		}
		{
			btnSumarReales = new JButton("Sumar dos reales");
			btnSumarReales.addActionListener(this);
			btnSumarReales.setBounds(290, 75, 134, 23);
			contentPane.add(btnSumarReales);
		}
		{
			scrollPane = new JScrollPane();
			scrollPane.setBounds(10, 104, 393, 146);
			contentPane.add(scrollPane);
			{
				txtS = new JTextArea();
				scrollPane.setViewportView(txtS);
			}
		}
		{
			btnNewButton_1 = new JButton("Borrar");
			btnNewButton_1.addActionListener(this);
			btnNewButton_1.setBounds(17, 75, 89, 23);
			contentPane.add(btnNewButton_1);
		}
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnNewButton_1) {
			do_btnNewButton_1_actionPerformed(e);
		}
		if (e.getSource() == btnSumarReales) {
			do_btnSumarReales_actionPerformed(e);
		}
		if (e.getSource() == btnSumarEnteros) {
			do_btnSumarEnteros_actionPerformed(e);
		}
		if (e.getSource() == btnNewButton) {
			do_btnNewButton_actionPerformed(e);
		}
	}
	protected void do_btnNewButton_actionPerformed(ActionEvent e) {
		try {
			int n1 = Integer.parseInt(txtN1.getText());
			int n2 = Integer.parseInt(txtN2.getText());
			Calculadora c = new Calculadora(n1, n2);
			txtS.append("La suma es: "+c.Sumar(n1, n2));
		} catch (Exception e2) {
			MostrarError();
		}
		
	}
	private void MostrarError() {
		JOptionPane.showMessageDialog(this, "Ingrese número(s) válido(s)");
	}
	protected void do_btnSumarEnteros_actionPerformed(ActionEvent e) {
		try {
			int n1 = Integer.parseInt(txtN1.getText());
			int n2 = Integer.parseInt(txtN2.getText());
			int n3 = Integer.parseInt(txtN3.getText());
			Calculadora c = new Calculadora(n1, n2, n3);
			txtS.append("La suma de los tres números es: "+c.Sumar(n1, n2, n3));
		} catch (Exception e2) {
			MostrarError();
		}
	}
	protected void do_btnSumarReales_actionPerformed(ActionEvent e) {
		try {
				double num1 = Double.parseDouble(txtN1.getText());
				double num2 = Double.parseDouble(txtN2.getText());
				Calculadora c = new Calculadora(num1, num2);
				txtS.append("La suma de los dos reales es: "+c.Sumar(num1, num2));
		} catch (Exception e2) {
			MostrarError();
		}
	}
	protected void do_btnNewButton_1_actionPerformed(ActionEvent e) {
	}
}
