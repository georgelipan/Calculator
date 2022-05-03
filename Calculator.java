package Calculator;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class GUI {
	private JFrame gui;

	public GUI() {
		gui = new JFrame("Calculator");
		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gui.setSize(600, 400);
		initGUI();
		try {
			String className = UIManager.getSystemLookAndFeelClassName();
			UIManager.setLookAndFeel(className);
		} catch (Exception e) {
			e.printStackTrace();
		}

		SwingUtilities.updateComponentTreeUI(gui);
		gui.setVisible(true);
	}

	private void initGUI() {
		gui.getContentPane().setBackground(new Color(88, 217, 219));
		gui.setLayout(null);
		
		JTextField valoare_intrare1 = new JTextField("Primul numar");
		valoare_intrare1.setHorizontalAlignment(JTextField.CENTER);
		valoare_intrare1.setBackground(new Color(207, 207, 76));
		gui.add(valoare_intrare1);
		valoare_intrare1.setBounds(100, 90, 150, 30);

		JTextField valoare_intrare2 = new JTextField("Al doilea numar");
		valoare_intrare2.setHorizontalAlignment(JTextField.CENTER);
		valoare_intrare2.setBackground(new Color(207, 207, 76));
		gui.add(valoare_intrare2);
		valoare_intrare2.setBounds(300, 90, 150, 30);

		JButton adunare = new JButton("+");
		gui.add(adunare);
		gui.getContentPane().add(adunare);
		adunare.setBounds(80, 150, 50, 50);

		JButton scadere = new JButton("-");
		gui.add(scadere);
		gui.getContentPane().add(scadere);
		scadere.setBounds(210, 150, 50, 50);

		JButton inmultire = new JButton("X");
		gui.add(inmultire);
		gui.getContentPane().add(inmultire);
		inmultire.setBounds(340, 150, 50, 50);

		JButton impartire = new JButton("÷");
		gui.add(impartire);
		gui.getContentPane().add(impartire);
		impartire.setBounds(470, 150, 50, 50);

		JTextField rezultat = new JTextField("...");
		rezultat.setHorizontalAlignment(JTextField.CENTER);
		rezultat.setBackground(new Color(207, 207, 76));
		gui.add(rezultat);
		rezultat.setBounds(225, 250, 150, 30);

		adunare.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String nr1 = valoare_intrare1.getText();
				float nr1_int = Float.parseFloat(nr1);
				String nr2 = valoare_intrare2.getText();
				float nr2_int = Float.parseFloat(nr2);
				float rez = nr1_int + nr2_int;
				System.out.println("nr: " + rez);
				String p = String.valueOf(rez);
				rezultat.setText(p);

			}
		});

		scadere.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String nr1 = valoare_intrare1.getText();
				float nr1_int = Float.parseFloat(nr1);
				String nr2 = valoare_intrare2.getText();
				float nr2_int = Float.parseFloat(nr2);
				float rez = nr1_int - nr2_int;
				System.out.println("nr: " + rez);
				String p = String.valueOf(rez);
				rezultat.setText(p);

			}
		});

		inmultire.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String nr1 = valoare_intrare1.getText();
				float nr1_int = Float.parseFloat(nr1);
				String nr2 = valoare_intrare2.getText();
				float nr2_int = Float.parseFloat(nr2);
				float rez = nr1_int * nr2_int;
				System.out.println("nr: " + rez);
				String p = String.valueOf(rez);
				rezultat.setText(p);

			}
		});

		impartire.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String nr1 = valoare_intrare1.getText();
				float nr1_int = Float.parseFloat(nr1);
				String nr2 = valoare_intrare2.getText();
				float nr2_int = Float.parseFloat(nr2);
				float rez = nr1_int / nr2_int;
				System.out.println("nr: " + rez);
				String p = String.valueOf(rez);
				rezultat.setText(p);

			}
		});

	}
}

public class Calculator {

	public static void main(String[] args) {
		new GUI();
		
		System.out.println("Calculator...");
	}

}
