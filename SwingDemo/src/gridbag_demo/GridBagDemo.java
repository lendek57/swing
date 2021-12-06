package gridbag_demo;

import swing_console.SwingConsole;

import java.awt.*;
import javax.swing.*;

public class GridBagDemo extends JPanel {
    public GridBagDemo() {
        setLayout(new GridBagLayout());
        setBackground(Color.ORANGE);

        JButton btnBrowse = new JButton("Browse");
        JTextField txfHeight = new JTextField(4);
        JTextField txfWidth = new JTextField(10);
        JButton btnMore = new JButton("More PDF Attributes");

        JTextArea txaPreview = new JTextArea(20, 30);
        JScrollPane scrPreview = new JScrollPane(txaPreview);
        scrPreview.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(3,5,3,5); // set margins for the components

        setGBC(gbc, 0, 0, 1, 1, GridBagConstraints.NONE, 0, 0);
        add(new JLabel("Source PDF size..."), gbc);

        setGBC(gbc, 0, 1, 2, 1, GridBagConstraints.HORIZONTAL, 0, 0);
        add(btnBrowse, gbc);

        setGBC(gbc, 0, 2, 1, 1, GridBagConstraints.NONE, 0, 0);
        add(new JLabel("Height (in inches):"), gbc);

        setGBC(gbc, 1, 2, 1, 1, GridBagConstraints.HORIZONTAL, 0, 0);
        add(txfHeight, gbc);

        setGBC(gbc, 0, 3, 1, 1, GridBagConstraints.NONE, 0, 0);
        add(new JLabel("Width (in inches):"), gbc);

        setGBC(gbc, 1, 3, 1, 1, GridBagConstraints.HORIZONTAL, 0, 0);
        add(txfWidth, gbc);

        setGBC(gbc, 0, 4, 2, 1, GridBagConstraints.HORIZONTAL, 0, 0);
        add(btnMore, gbc);

        setGBC(gbc, 2, 0, 1, 1, GridBagConstraints.NONE, 0, 0);
        add(new JLabel("Preview"), gbc);

        setGBC(gbc, 2, 1, 1, 5, GridBagConstraints.BOTH, 1, 1);
        gbc.insets = new Insets(3,5,10,10);
        add(scrPreview, gbc);
    }

    private static void setGBC(GridBagConstraints gbc, int gridx, int gridy,
                               int gridWidth, int gridHeight, int fill, double weightx, double weighty) {
        gbc.gridx = gridx;
        gbc.gridy = gridy;
        gbc.gridwidth = gridWidth;
        gbc.gridheight = gridHeight;
        gbc.fill = fill;
        gbc.weightx = weightx;
        gbc.weighty = weighty;
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.getContentPane().add(new JScrollPane(new GridBagDemo()));
//		frame.getContentPane().add(new GridBagDemo(), BorderLayout.CENTER);
        SwingConsole.run(frame);
    }
}
