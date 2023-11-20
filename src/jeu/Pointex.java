package Commandes;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Pointex implements ActionListener{
	private int l;
	private int c;
	private BoutonPoint[][] buttons;


	public Pointex(int r, int c, BoutonPoint[][] buttons) {
		this.l = r;
		this.c = c;
		this.buttons = buttons;
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// Répondez au clic sur un bouton
//		System.out.println("Clic sur la case : " + l + ", " + c);
		// Vous pouvez ajouter votre logique de jeu ici
//		System.out.println(buttons[l][c].getBackground());
//		((JButton) e.getSource()).setBackground(Color.black);
		buttons[l][c].setPoint(Color.yellow);;
//		System.out.println(buttons[l][c].getBackground());
		if(l>=1 && c>=0 && buttons[l-1][c].getc() == Color.yellow) {
			System.out.println("dessus oui");
		}
		
	}

}
