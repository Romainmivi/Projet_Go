package Commandes;

import java.util.Scanner;

public class Commandes {
	
	private static boolean Analyse(String elt) {
		if(elt.compareTo("exit")==0) {
			System.out.println("coucou");
			return true;
		}
		return false;
	}
	
	private static void Lecture() {
		while(true) {
			Scanner sc = new Scanner(System.in);
			String str = sc.nextLine();
			if(Analyse(str));
			System.out.println("");
		}
	}
	
	public static void main(String[] args) {
		Lecture();
	}

	
}
