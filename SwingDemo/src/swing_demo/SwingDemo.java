package swing_demo;

import swing_console.SwingConsole;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingDemo extends JPanel implements ActionListener {
	private final JTextField jTextField = new JTextField(10);

	@Override
	public void actionPerformed(ActionEvent e) {
		jTextField.setText(((JButton)e.getSource()).getText());
		System.out.println("is Event Dispatch Thread: " + SwingUtilities.isEventDispatchThread());
	}

	public SwingDemo() {
		setBackground(Color.BLUE);
		setLayout(new FlowLayout());
//		setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
		setBorder(BorderFactory.createEmptyBorder(25, 5, 5, 5)); // set margins
		JButton button1 = new JButton("Button 1");
		JButton button2 = new JButton("Button 2");
		button1.addActionListener(this);
		button2.addActionListener(this);
		add(button1);
		add(button2);
		add(jTextField);
	}

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.getContentPane().add(new SwingDemo());
//		swing_console.SwingConsole.run(frame);
		SwingConsole.run(frame, 250, 150);
	}
}

