package Commandes;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class GobanPoint extends JFrame {
    private static final int BOARD_SIZE = 9;
	public BoutonPoint[][] buttons;


    public GobanPoint() {
    	buttons = new BoutonPoint[BOARD_SIZE][BOARD_SIZE];
        setTitle("Goban");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(BOARD_SIZE, BOARD_SIZE));

        for (int i = 0; i < BOARD_SIZE; ++i) {
            for (int j = 0; j < BOARD_SIZE; ++j) {
            	buttons[i][j]= new BoutonPoint(Color.red);
            	buttons[i][j].setBorderPainted(false);
            	buttons[i][j].addActionListener(new Pointex(i,j,buttons));
            	
                add(buttons[i][j]);
            }
        }
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(GobanPoint::new);
    }
}

//class BoutonPoint extends JButton {
//    private static final int SIZE = 50;
//
//    public BoutonPoint() {
//        setBackground(Color.LIGHT_GRAY);
//        setPreferredSize(new Dimension(SIZE, SIZE));
//    }
//
//    @Override
//    protected void paintComponent(Graphics g) {
//        super.paintComponent(g);
//
//        Graphics2D g2d = (Graphics2D) g.create();
//        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
//
//        // Dessiner un cercle
//        g2d.setColor(Color.BLACK);
////        System.out.println(getWidth());
//        int diff = 40;
//		int Ll = getWidth()-diff;
//        g2d.fillOval(diff/2, diff/2, Ll, Ll);
////        g2d.fillOval(0, 0, getWidth(), getHeight()-10);
//
//        // Dessiner une croix
//        g2d.setColor(Color.BLACK);
//        int halfWidth = getWidth() / 2;
//        int halfHeight = getHeight() / 2;
//        g2d.drawLine(0, halfHeight, getWidth(), halfHeight); // Ligne horizontale
//        g2d.drawLine(halfWidth, 0, halfWidth, getHeight()); // Ligne verticale
//
//        g2d.dispose();
//    }
    
//	public static void main(String[] args) {
////      SwingUtilities.invokeLater(() -> new Goban());
//		GobanPoint goban = new GobanPoint();
//	}
//}