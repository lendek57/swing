package swing_console;

import javax.swing.*;
public class SwingConsole {

	private static void commonActions(final JFrame frame) {
		frame.setTitle(frame.getClass().getSimpleName());
		frame.setLocationRelativeTo(null); // locate new window at the center of the screen
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

	public static void run(final JFrame frame, final int width, final int height) {
		SwingUtilities.invokeLater(() -> {
			frame.setSize(width, height);
			commonActions(frame);
		});

	}

	public static void run(final JFrame frame) {
		SwingUtilities.invokeLater(() -> {
			frame.pack();
			commonActions(frame);
		});
	}
}

