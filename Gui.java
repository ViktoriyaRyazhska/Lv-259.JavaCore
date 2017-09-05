package Тranslator;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Gui extends JFrame {

	private JButton button = new JButton("Перекласти");
	private JButton button2 = new JButton("Очистити поля");
	private JTextField input = new JTextField("", 100);
	private JTextField input2 = new JTextField("", 100);
//	private JLabel empty = new JLabel("");
	private JLabel label = new JLabel("  Введіть текст:");
	private JRadioButton radio1 = new JRadioButton(
			"З англійської на українську");
	private JRadioButton radio2 = new JRadioButton(
			"З української на англійську");

	public Gui() {
		super("Перекладач");
		this.setBounds(100, 100, 700, 160);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container container = this.getContentPane();
		container.setLayout(new GridLayout(4, 2));
		ButtonGroup group = new ButtonGroup();
		group.add(radio1);
		group.add(radio2);
		container.add(radio1);
		radio1.setSelected(true);
		container.add(radio2);
		container.add(label);
		container.add(input);
		button.addActionListener(new ButtonEwentListener());
		container.add(button);
		container.add(input2);
		button2.addActionListener(new Button2EwentListener());
		container.add(button2);

	}

	class ButtonEwentListener implements ActionListener {
		Dictionary s = new Dictionary();

		public void actionPerformed(ActionEvent e) {
			String message = "";
//			message += input.getText() + " \n";
			message += (radio1.isSelected() ? s.rezEn(input.getText()) : s
							.rezUa(input.getText())) + " \n";
			message += " ";
//			JOptionPane.showMessageDialog(null, "  " + message, "Переклад",
//					JOptionPane.PLAIN_MESSAGE);
			
			input2.setText(message); s.setWord("");
		}
	}

	public class Button2EwentListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			Dictionary s = new Dictionary();
			input.setText("");
			input2.setText("");
			s.setWord("");
		}
	}
}
