package Commandes;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JButton;

class BoutonPoint extends JButton {
    private static final int SIZE = 50;
    private Color c;

    public BoutonPoint(Color c) {
        setBackground(Color.LIGHT_GRAY);
        setPreferredSize(new Dimension(SIZE, SIZE));
    }
    
    public void setPoint(Color c) {
    	this.c=c;
    	repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2d = (Graphics2D) g.create();
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        
        if(c != null) {
        	// Dessiner un cercle
        	g2d.setColor(c);
        	//        System.out.println(getWidth());
        	int diff = 40;
        	int Ll = getWidth()-diff;
        	g2d.fillOval(diff/2, diff/2, Ll, Ll);
        	//        g2d.fillOval(0, 0, getWidth(), getHeight()-10);
        }
        // Dessiner une croix
        g2d.setColor(Color.BLACK);
        int halfWidth = getWidth() / 2;
        int halfHeight = getHeight() / 2;
        g2d.drawLine(0, halfHeight, getWidth(), halfHeight); // Ligne horizontale
        g2d.drawLine(halfWidth, 0, halfWidth, getHeight()); // Ligne verticale

        g2d.dispose();
    }

	public Color getc() {
		return c;
	}
}