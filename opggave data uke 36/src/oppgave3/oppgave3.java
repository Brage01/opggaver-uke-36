package oppgave3;

import static javax.swing.JOptionPane.showMessageDialog;
import static javax.swing.JOptionPane.showInputDialog;
public class oppgave3 {

	public static void main(String[] args) {
		String tallTxt =showInputDialog ("skriv et tall"); 
		int tallgreie = Integer.parseInt(tallTxt);
		if (tallgreie > 0); {
		
		int temp = 1;
		while(tallgreie>1){
		   temp *=tallgreie;
		   tallgreie--;
		}
		showMessageDialog(null, "fakukltete av tallet er " + temp);
		}
	}

}



